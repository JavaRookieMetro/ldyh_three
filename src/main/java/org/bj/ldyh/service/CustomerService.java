package org.bj.ldyh.service;

import javax.annotation.Resource;

import org.bj.ldyh.dao.CustomerMapper;
import org.bj.ldyh.model.Customer;
import org.bj.ldyh.model.ResponseResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{

    @Resource
    private CustomerMapper customerMapper;


    @Override
    public ResponseResult getCustomerList(String query) {
        List<Customer> list = customerMapper.selectBySearch(query);
        return ResponseResult.createBySuccess("sucess", list);
    }
}
