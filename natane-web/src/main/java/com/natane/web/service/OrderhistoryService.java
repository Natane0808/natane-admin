package com.natane.web.service;

import com.natane.entity.Orderhistory;
import io.mybatis.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * @author natane
 * @date 2022/6/25
 */
@Service
public interface OrderhistoryService extends BaseService<Orderhistory, Long> {
}
