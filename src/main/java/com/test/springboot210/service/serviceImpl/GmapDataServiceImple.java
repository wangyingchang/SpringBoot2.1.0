package com.test.springboot210.service.serviceImpl;

import com.test.springboot210.util.IdGenerator;
import com.test.springboot210.mapper.GmapDataMapper;
import com.test.springboot210.model.GmapData;
import com.test.springboot210.service.GmapDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Time
 * @date 2018-11-30 15:35
 */
@Service
public class GmapDataServiceImple implements GmapDataService {
    @Resource
    private GmapDataMapper gmapDataMapper;

    @Override
    public List<GmapData> getGmapData(){
        return gmapDataMapper.getGmapData();
    }

    @Override
    public int add(GmapData gmapData) {
        gmapData.setId(IdGenerator.getNewUserId());
        return gmapDataMapper.insert(gmapData);
    }
}
