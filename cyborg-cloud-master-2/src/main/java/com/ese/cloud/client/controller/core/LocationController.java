package com.ese.cloud.client.controller.core;

import com.alibaba.fastjson.JSON;
import com.ese.cloud.client.entity.MetricsInfo;
import com.ese.cloud.client.util.ReturnData;
import org.apache.log4j.Logger;
import org.apache.poi.util.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
@Controller
@RequestMapping("map")
public class LocationController {
    Logger logger=Logger.getLogger(LocationController.class);
    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String index(){
        return "map/index";
    }
}