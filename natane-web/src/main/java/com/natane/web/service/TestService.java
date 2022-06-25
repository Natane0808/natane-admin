package com.natane.web.service;

import com.ejlchina.searcher.BeanSearcher;
import com.ejlchina.searcher.SearchResult;
import com.ejlchina.searcher.util.MapUtils;
import com.natane.common.annotation.DataSource;
import com.natane.common.enums.DataSourceType;
import com.natane.entity.Orderhistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author natane
 * @date 2022/6/25
 */
@Service
public class TestService {
    @Autowired
    private BeanSearcher beanSearcher;

    @DataSource(DataSourceType.MASTER)
    public SearchResult<Orderhistory> getTestInfo(Integer id) {
        return beanSearcher.search(Orderhistory.class, MapUtils.builder()
                .field(Orderhistory::getId, id)
                .build());
    }
}
