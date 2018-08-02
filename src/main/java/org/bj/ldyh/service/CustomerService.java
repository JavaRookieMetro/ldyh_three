package org.bj.ldyh.service;

import java.util.List;

import javax.annotation.Resource;

import org.bj.ldyh.model.Customer;
import org.bj.ldyh.dao.CustomerDao;
import org.springframework.stereotype.Service;
@Service
public class CustomerService implements ICustomerService{

    @Resource
    private CustomerDao customerDao;

    @Override
    public List<Customer> getAllCustomer(String input) {
        List<Customer> list = customerDao.showAllCustomer(input);
        if(list.size()>0) {
            return  list;
        }else {
            throw new RuntimeException("未找到匹配的客户");
        }

    }

}
