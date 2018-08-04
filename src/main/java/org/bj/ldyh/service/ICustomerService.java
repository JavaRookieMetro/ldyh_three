package org.bj.ldyh.service;

import com.github.pagehelper.PageInfo;
import org.bj.ldyh.model.Customer;

import java.util.List;
import java.util.Map;

public interface ICustomerService {

    PageInfo<Customer> getCustomerListByPage(String query, int pageNo, int pageSize, String sort, String dir);

    PageInfo<Customer> getCustomerList(Customer customer, int pageNo, int pageSize);

    PageInfo<Customer> getCustomerListBySearch(String query, int pageNo, int pageSize);

    PageInfo<Customer> getCustomerListByPage(Customer customer, String query, int pageNo, int pageSize);

    PageInfo<Customer> getCustomerListBySort(Customer customer, String query, int pageNo, int pageSize, String sort, String dir);

    Map<String, List<Customer>> getFilterInfo();



}
