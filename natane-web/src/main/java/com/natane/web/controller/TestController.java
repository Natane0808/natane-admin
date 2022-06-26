package com.natane.web.controller;

import com.alibaba.fastjson2.JSON;
import com.ejlchina.searcher.MapSearcher;
import com.ejlchina.searcher.SearchResult;
import com.natane.common.asserts.BusinessAssert;
import com.natane.entity.Orderhistory;
import com.natane.web.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {


    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private MapSearcher mapSearcher;

    @Autowired
    private TestService testService;

    @GetMapping("/getName")
    public String getName(String name) {
        return "Your name is " + name;
    }

    @GetMapping("/getBeeData")
    public String getBeeData(Integer id) {
        logger.info("输入的id为{}", id);
        SearchResult<Orderhistory> testInfo = testService.getTestInfo(id);
        BusinessAssert.getAssert(testInfo).isTrue(SearchResult::getDataList, 666, "aaa");
        return JSON.toJSONString(testInfo);
    }
}
