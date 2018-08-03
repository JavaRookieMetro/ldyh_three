package org.bj.ldyh.service;

import javax.annotation.Resource;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.bj.ldyh.dao.CustomerMapper;
import org.bj.ldyh.model.Customer;
import org.bj.ldyh.model.ResponseResult;
import org.springframework.stereotype.Service;

import java.util.List;

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
     * @param name
     * @param age
     * @param industry
     * @param gender
     * @param address
     * @param importance
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
}
