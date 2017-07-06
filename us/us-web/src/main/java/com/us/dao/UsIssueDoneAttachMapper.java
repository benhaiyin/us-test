package com.us.dao;

import com.us.model.defaults.UsIssueDoneAttach;
import com.us.model.defaults.UsIssueDoneAttachExample;
import com.us.model.defaults.UsIssueDoneAttachKey;
import java.util.List;

public interface UsIssueDoneAttachMapper {
    int countByExample(UsIssueDoneAttachExample example);

    int deleteByExample(UsIssueDoneAttachExample example);

    int deleteByPrimaryKey(UsIssueDoneAttachKey key);

    int insert(UsIssueDoneAttach record);

    int insertSelective(UsIssueDoneAttach record);

    List<UsIssueDoneAttach> selectByExample(UsIssueDoneAttachExample example);

    UsIssueDoneAttach selectByPrimaryKey(UsIssueDoneAttachKey key);

    int updateByPrimaryKeySelective(UsIssueDoneAttach record);

    int updateByPrimaryKey(UsIssueDoneAttach record);
}