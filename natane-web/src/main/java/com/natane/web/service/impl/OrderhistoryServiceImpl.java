package com.natane.web.service.impl;

import com.natane.common.annotation.DataSource;
import com.natane.common.enums.DataSourceType;
import com.natane.entity.Orderhistory;
import com.natane.mapper.OrderhistoryMapper;
import com.natane.web.service.OrderhistoryService;
import io.mybatis.service.AbstractService;
import org.springframework.stereotype.Service;

/**
 * @author natane
 * @date 2022/6/30
 */
@Service
@DataSource(DataSourceType.MASTER)
public class OrderhistoryServiceImpl extends AbstractService<Orderhistory, Long, OrderhistoryMapper> implements OrderhistoryService {


}
