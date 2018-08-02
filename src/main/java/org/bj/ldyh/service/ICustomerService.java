package org.bj.ldyh.service;

import org.bj.ldyh.model.Customer;
import org.bj.ldyh.model.ResponseResult;

public interface ICustomerService {

    ResponseResult<Customer> getCustomerList(String query);

}
