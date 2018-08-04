package org.bj.ldyh.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.github.pagehelper.PageInfo;
import org.bj.ldyh.model.Customer;
import org.bj.ldyh.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Customer")
public class CustomerController {

    @Resource
    private ICustomerService customerService;

    @RequestMapping("/index.do")
    public String index(
            @RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
            @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
            HttpServletRequest request) {

        Customer customer = new Customer();

        PageInfo<Customer> customerPageInfo = customerService.getCustomerList(customer, pageNo, pageSize);
        List<Customer> list = customerPageInfo.getList();
        request.setAttribute("pageInfo", customerPageInfo);
        request.setAttribute("list", list);
        request.setAttribute("pageSize", pageSize);

        return "customer";
    }

    /**
     * 排序
     * @param query
     * @param pageNo
     * @param pageSize
     * @param request
     * @return
     */
    @RequestMapping("/sort.do")
    public String pageCustomer(
            @RequestParam(value = "query", required = true) String query,
            @RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
            @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
            @RequestParam(value = "industry", required = false) String industry,
            @RequestParam(value = "address", required = false) String address,
            @RequestParam(value = "importance", required = false) String importance,
            @RequestParam(value = "sort", required = false) String sort,
            @RequestParam(value = "dir", required = false) String dir,
            HttpServletRequest request) {

        // 创建第一次的排序规则
        if(StringUtils.isEmpty(dir)) {
            request.setAttribute("dir", "desc");
            dir = "desc";
        }

        Customer customer = new Customer();
        if(!StringUtils.isEmpty(industry)) {
            customer.setIndustry(industry);
        }
        if(!StringUtils.isEmpty(address)) {
            customer.setAddress(address);
        }
        if(!StringUtils.isEmpty(importance)) {
            customer.setImportance(importance);
        }

        PageInfo<Customer> customerPageInfo = customerService.getCustomerListBySort(customer, query, pageNo, pageSize, sort, dir);
        List<Customer> list = customerPageInfo.getList();
        request.setAttribute("pageInfo", customerPageInfo);
        request.setAttribute("list", list);
        request.setAttribute("query", query);
        request.setAttribute("pageSize", pageSize);
        request.setAttribute("industry", industry);
        request.setAttribute("address", address);
        request.setAttribute("importance", importance);

        // 更换排序规则(缺陷，切换栏目时，会继承上一次的排序规则，可以优化)
        if(!StringUtils.isEmpty(sort)) {
            if(dir.equals("desc")) {
                request.setAttribute("dir", "asc");
            }else if(dir.equals("asc")){
                request.setAttribute("dir", "desc");
            }
        }
        return "customer";
    }

    /**
     * 搜索客户
     * @param request
     * @return
     */
    @RequestMapping("/search.do")
    public String searchCustomer(
            @RequestParam(value = "query", required = true) String query,
            HttpServletRequest request) {

        PageInfo<Customer> customerPageInfo = customerService.getCustomerListBySearch(query, 1, 10);
        List<Customer> list = customerPageInfo.getList();
        request.setAttribute("pageInfo", customerPageInfo);
        request.setAttribute("list", list);
        request.setAttribute("query", query);
        request.setAttribute("pageSize", 10);
        return "customer";
    }

    /**
     * 筛选客户
     * @param industry
     * @param address
     * @param importance
     * @param request
     * @return
     */
    @RequestMapping("/filter.do")
    public String filterCustomer(
            @RequestParam(value = "industry", required = false) String industry,
            @RequestParam(value = "address", required = false) String address,
            @RequestParam(value = "importance", required = false) String importance,
            HttpServletRequest request) {

        Customer customer = new Customer();
        if(!StringUtils.isEmpty(industry)) {
            customer.setIndustry(industry);
        }
        if(!StringUtils.isEmpty(address)) {
            customer.setAddress(address);
        }
        if(!StringUtils.isEmpty(importance)) {
            customer.setImportance(importance);
        }
        request.setAttribute("industry", industry);
        request.setAttribute("address", address);
        request.setAttribute("importance", importance);
        PageInfo<Customer> customerPageInfo = customerService.getCustomerList(customer, 1,10);
        request.setAttribute("pageInfo", customerPageInfo);
        request.setAttribute("list", customerPageInfo.getList());
        request.setAttribute("pageSize", 10);
        return "customer";
    }

    /**
     * 获取筛选项
     * @param request
     * @return
     */
    @RequestMapping("/Filter/select.do")
    @ResponseBody
    public Object getIndustry(HttpServletRequest request) {
        Map<String, List<Customer>> map = customerService.getFilterInfo();
        return map;
    }

    /**
     * 分页
     * @param query
     * @param pageNo
     * @param pageSize
     * @param request
     * @return
     */
    @RequestMapping("/page.do")
    public String pageCustomer(
            @RequestParam(value = "query", required = true) String query,
            @RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
            @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
            @RequestParam(value = "industry", required = false) String industry,
            @RequestParam(value = "address", required = false) String address,
            @RequestParam(value = "importance", required = false) String importance,
            HttpServletRequest request) {

        Customer customer = new Customer();
        if(!StringUtils.isEmpty(industry)) {
            customer.setIndustry(industry);
        }
        if(!StringUtils.isEmpty(address)) {
            customer.setAddress(address);
        }
        if(!StringUtils.isEmpty(importance)) {
            customer.setImportance(importance);
        }
        request.setAttribute("industry", industry);
        request.setAttribute("address", address);
        request.setAttribute("importance", importance);
        PageInfo<Customer> customerPageInfo = customerService.getCustomerListByPage(customer, query, pageNo, pageSize);
        request.setAttribute("pageInfo", customerPageInfo);
        request.setAttribute("list", customerPageInfo.getList());
        request.setAttribute("query", query);
        request.setAttribute("pageSize", pageSize);
        return "customer";
    }

}
