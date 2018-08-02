package org.bj.ldyh.dao;

import org.bj.ldyh.model.Person;

public interface PersonMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}