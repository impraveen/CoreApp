package com.psr.app.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psr.app.bean.WebPage;

@Repository
public interface WebPageDao extends JpaRepository<WebPage, Integer> {

}
