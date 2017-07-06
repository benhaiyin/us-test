package com.us.dao;

import com.us.model.defaults.UsComment;
import com.us.model.defaults.UsCommentExample;
import java.util.List;

public interface UsCommentMapper {
    int countByExample(UsCommentExample example);

    int deleteByExample(UsCommentExample example);

    int deleteByPrimaryKey(String commentId);

    int insert(UsComment record);

    int insertSelective(UsComment record);

    List<UsComment> selectByExample(UsCommentExample example);

    UsComment selectByPrimaryKey(String commentId);

    int updateByPrimaryKeySelective(UsComment record);

    int updateByPrimaryKey(UsComment record);
}