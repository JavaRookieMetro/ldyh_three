package org.bj.ldyh.service;

import java.util.List;

import org.bj.ldyh.model.Customer;

public interface ICustomerService {
    /**
     * 根据输入信息查找对应的客户信息
     * @return
     */
    List<Customer> getAllCustomer(String input);
}
