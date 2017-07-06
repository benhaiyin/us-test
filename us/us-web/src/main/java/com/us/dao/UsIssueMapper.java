package com.us.dao;

import com.us.model.defaults.UsIssue;
import com.us.model.defaults.UsIssueExample;
import java.util.List;

public interface UsIssueMapper {
    int countByExample(UsIssueExample example);

    int deleteByExample(UsIssueExample example);

    int deleteByPrimaryKey(String issueId);

    int insert(UsIssue record);

    int insertSelective(UsIssue record);

    List<UsIssue> selectByExample(UsIssueExample example);

    UsIssue selectByPrimaryKey(String issueId);

    int updateByPrimaryKeySelective(UsIssue record);

    int updateByPrimaryKey(UsIssue record);
}