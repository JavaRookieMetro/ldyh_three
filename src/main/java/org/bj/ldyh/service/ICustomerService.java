package org.bj.ldyh.service;

import com.github.pagehelper.PageInfo;
import org.bj.ldyh.model.Customer;

public interface ICustomerService {

    PageInfo<Customer> getCustomerListByPage(String query, int pageNo, int pageSize, String sort, String dir);

}
