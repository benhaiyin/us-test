package com.us.dao;

import com.us.model.defaults.UsWidgetUser;
import com.us.model.defaults.UsWidgetUserExample;
import java.util.List;

public interface UsWidgetUserMapper {
    int countByExample(UsWidgetUserExample example);

    int deleteByExample(UsWidgetUserExample example);

    int insert(UsWidgetUser record);

    int insertSelective(UsWidgetUser record);

    List<UsWidgetUser> selectByExample(UsWidgetUserExample example);
}