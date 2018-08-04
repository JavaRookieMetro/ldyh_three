package org.bj.ldyh.dao;

import org.apache.ibatis.annotations.Param;
import org.bj.ldyh.model.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> selectBySearch(@Param("query") String query, @Param("sort")String sort,
                                  @Param("dir") String dir);

    List<Customer> selectSearch(@Param("query") String query);

    List<Customer> selectList(Customer customer);

    List<Customer> selectIndustry();

    List<Customer> selectAddress();

    List<Customer> selectImportance();

    List<Customer> selectListByPage(@Param("customer") Customer customer, @Param("query") String query);

    List<Customer> selectListBySort(@Param("customer") Customer customer, @Param("query") String query, @Param("sort") String sort, @Param("dir") String dir);
}