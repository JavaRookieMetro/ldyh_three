package org.bj.ldyh.dao;

import org.bj.ldyh.model.Cpimid;

public interface CpimidMapper {
    int deleteByPrimaryKey(Integer cpid);

    int insert(Cpimid record);

    int insertSelective(Cpimid record);

    Cpimid selectByPrimaryKey(Integer cpid);

    int updateByPrimaryKeySelective(Cpimid record);

    int updateByPrimaryKey(Cpimid record);
}