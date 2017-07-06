package com.us.dao;

import com.us.model.defaults.UsFile;
import com.us.model.defaults.UsFileExample;
import java.util.List;

public interface UsFileMapper {
    int countByExample(UsFileExample example);

    int deleteByExample(UsFileExample example);

    int deleteByPrimaryKey(String fileId);

    int insert(UsFile record);

    int insertSelective(UsFile record);

    List<UsFile> selectByExample(UsFileExample example);

    UsFile selectByPrimaryKey(String fileId);

    int updateByPrimaryKeySelective(UsFile record);

    int updateByPrimaryKey(UsFile record);
}