package com.us.dao;

import com.us.model.defaults.UsWidget;
import com.us.model.defaults.UsWidgetExample;
import java.util.List;

public interface UsWidgetMapper {
    int countByExample(UsWidgetExample example);

    int deleteByExample(UsWidgetExample example);

    int deleteByPrimaryKey(String widgetId);

    int insert(UsWidget record);

    int insertSelective(UsWidget record);

    List<UsWidget> selectByExample(UsWidgetExample example);

    UsWidget selectByPrimaryKey(String widgetId);

    int updateByPrimaryKeySelective(UsWidget record);

    int updateByPrimaryKey(UsWidget record);
}