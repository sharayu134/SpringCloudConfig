package com.finzly.configclient.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.finzly.configclient.dao.MarginedRateRepository;
import com.finzly.configclient.model.MarginedRate;

/**
 * This a writer component for step which writes marginedRates to database using marginedRate's Repository
 * 
 * @author Sharayu Yadav.
 */
@Component
public class DataBaseWriter implements ItemWriter<MarginedRate> {

    @Autowired
    private MarginedRateRepository marginedRateRepository;

    @Override
    public void write(List<? extends MarginedRate> marginedRates) throws Exception {

        marginedRateRepository.saveAll(marginedRates);
    }
}
