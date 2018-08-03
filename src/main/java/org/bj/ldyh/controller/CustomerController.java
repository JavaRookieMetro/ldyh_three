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

import java.util.List;

@Controller
@RequestMapping("/Customer")
public class CustomerController {

    @Resource
    private ICustomerService customerService;

    /**
     * 搜索客户
     * @param query
     * @param pageNo
     * @param pageSize
     * @param request
     * @return
     */
    @RequestMapping("/search.do")
    public String searchCustomer(
            @RequestParam(value = "query", required = true) String query,
            @RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
            @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
            @RequestParam(value = "sort", required = false) String sort,
            @RequestParam(value = "dir", required = false) String dir,
            HttpServletRequest request) {

        // 创建第一次的排序规则
        if(StringUtils.isEmpty(dir)) {
            request.setAttribute("dir", "desc");
        }

        PageInfo<Customer> customerPageInfo = customerService.getCustomerListByPage(query, pageNo, pageSize, sort, dir);
        List<Customer> list = customerPageInfo.getList();
        request.setAttribute("pageInfo", customerPageInfo);
        request.setAttribute("list", list);
        request.setAttribute("query", query);
        request.setAttribute("pageSize", pageSize);

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
}
