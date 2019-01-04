package com.github.ontio.dao;

import com.github.ontio.model.DailySummary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component(value = "DailySummaryMapper")
public interface DailySummaryMapper {
    int deleteByPrimaryKey(Integer time);

    int insert(DailySummary record);

    int insertSelective(DailySummary record);

    DailySummary selectByPrimaryKey(Integer time);

    int updateByPrimaryKeySelective(DailySummary record);

    int updateByPrimaryKey(DailySummary record);

    Integer selectMaxTime();

    List<Map> selectDailyInfo(Map<String, Object> paramMap);

    Map selectAddressAndOntIdCount(Integer startTime);
}