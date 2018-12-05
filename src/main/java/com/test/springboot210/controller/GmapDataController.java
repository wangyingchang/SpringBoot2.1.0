package com.test.springboot210.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.springboot210.model.GmapData;
import com.test.springboot210.service.GmapDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Time
 * @date 2018-11-30 15:29
 */
@RestController
public class GmapDataController {
    @Autowired
    private GmapDataService gmapDataService;

    @GetMapping("/gmap")
    public PageInfo<GmapData> list(@RequestParam(defaultValue = "1")int pageCode,
                                   @RequestParam(defaultValue = "3")int pageSize){
        PageHelper.startPage(pageCode,pageSize);
        List<GmapData> list=gmapDataService.getGmapData();
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }

    @GetMapping("/gmap/all")
    public List<GmapData> list(){
        List<GmapData> list=gmapDataService.getGmapData();
        return list;
    }

    @PostMapping("/gmap")
    public int add(@RequestBody GmapData gmapData){
        return gmapDataService.add(gmapData);
    }

}
