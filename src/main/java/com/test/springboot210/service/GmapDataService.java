package com.test.springboot210.service;

import com.test.springboot210.model.GmapData;

import java.util.List;

/**
 * @author Time
 * @date 2018-11-30 15:27
 */
public interface GmapDataService {
     List<GmapData> getGmapData();

    int add(GmapData gmapData);
}
