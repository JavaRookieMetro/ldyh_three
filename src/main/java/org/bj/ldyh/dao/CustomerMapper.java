package org.bj.ldyh.dao;

import org.apache.ibatis.annotations.Param;
import org.bj.ldyh.model.Customer;

import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> selectBySearch(@Param("query") String query);
}