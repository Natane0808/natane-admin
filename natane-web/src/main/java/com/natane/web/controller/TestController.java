package com.natane.web.controller;

import com.natane.common.annotation.DataSource;
import com.natane.common.entity.Result;
import com.natane.common.enums.DataSourceType;
import com.natane.entity.Orderhistory;
import com.natane.web.service.OrderhistoryService;
import jakarta.servlet.http.HttpServletResponse;
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
    private OrderhistoryService orderhistoryService;


    @GetMapping("/getName")
    public String getName(String name) {
        return "Your name is " + name;
    }

    @GetMapping("/findById")
    public Result getBeeData(Long id) {
        logger.info("输入的id为{}", id);
        Orderhistory byId = orderhistoryService.findById(id);

        return Result.success(byId);
    }

}
