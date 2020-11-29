package com.finzly.configclient.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finzly.configclient.model.MarginedRate;




/**
 * This is DAO for Margined Rates
 * 
 * @author Sharayu Yadav
 */
@Repository
public interface MarginedRateRepository extends JpaRepository<MarginedRate,Integer> {

}