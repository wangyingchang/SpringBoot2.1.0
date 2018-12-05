package com.test.springboot210.mapper;

import com.test.springboot210.common.MyMapper;
import com.test.springboot210.model.GmapData;

import java.util.List;

/**
 * @author Time
 * @date 2018-11-30 15:25
 */
public interface GmapDataMapper extends MyMapper<GmapData> {
    List<GmapData> getGmapData();

}
