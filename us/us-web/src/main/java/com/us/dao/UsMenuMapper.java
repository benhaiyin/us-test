package com.us.dao;

import com.us.model.defaults.UsMenu;
import com.us.model.defaults.UsMenuExample;
import java.util.List;

public interface UsMenuMapper {
    int countByExample(UsMenuExample example);

    int deleteByExample(UsMenuExample example);

    int deleteByPrimaryKey(String menuId);

    int insert(UsMenu record);

    int insertSelective(UsMenu record);

    List<UsMenu> selectByExample(UsMenuExample example);

    UsMenu selectByPrimaryKey(String menuId);

    int updateByPrimaryKeySelective(UsMenu record);

    int updateByPrimaryKey(UsMenu record);
}