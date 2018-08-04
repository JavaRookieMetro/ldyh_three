package org.bj.ldyh.service;

import javax.annotation.Resource;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.bj.ldyh.dao.CustomerMapper;
import org.bj.ldyh.model.Customer;
import org.bj.ldyh.model.ResponseResult;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerService implements ICustomerService {

    @Resource
    private CustomerMapper customerMapper;


    /**
     * 搜索功能，分页， 字段排序
     *
     * @param query
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<Customer> getCustomerListByPage(String query, int pageNo, int pageSize, String sort, String dir) {
        // 使用mybatis-helper分页插件
        PageHelper.startPage(pageNo, pageSize);
        List<Customer> list = customerMapper.selectBySearch(query, sort, dir);
        // 返回分页对象
        PageInfo<Customer> pageInfo = new PageInfo<Customer>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<Customer> getCustomerList(Customer customer, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<Customer> list = customerMapper.selectList(customer);
        PageInfo<Customer> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 搜索客户
     * @param query
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<Customer> getCustomerListBySearch(String query, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<Customer> list = customerMapper.selectSearch(query);
        PageInfo<Customer> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 获取筛选项
     * @return
     */
    @Override
    public Map<String, List<Customer>> getFilterInfo() {
        List<Customer> address = customerMapper.selectAddress();
        List<Customer> industry = customerMapper.selectIndustry();
        List<Customer> importance = customerMapper.selectImportance();
        Map<String, List<Customer>> map = new HashMap<String, List<Customer>>();
        map.put("address", address);
        map.put("industry", industry);
        map.put("importance", importance);
        return map;
    }


    /**
     * 分页结果集列表
     * @param customer
     * @param query
     * @param pageNo
     * @param pageSize
     * @return
     */
    public PageInfo<Customer> getCustomerListByPage(Customer customer, String query, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<Customer> list = customerMapper.selectListByPage(customer, query);
        PageInfo<Customer> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 排序结果集列表
     * @param customer
     * @param query
     * @param pageNo
     * @param pageSize
     * @param sort
     * @param dir
     * @return
     */
    @Override
    public PageInfo<Customer> getCustomerListBySort(Customer customer, String query, int pageNo, int pageSize, String sort, String dir) {
        // 使用mybatis-helper分页插件
        PageHelper.startPage(pageNo, pageSize);
        List<Customer> list = customerMapper.selectListBySort(customer, query, sort, dir);
        // 返回分页对象
        PageInfo<Customer> pageInfo = new PageInfo<Customer>(list);
        return pageInfo;
    }


}
