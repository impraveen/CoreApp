package com.psr.app.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psr.app.bean.TilePage;

@Repository
public interface TilePageDao extends JpaRepository<TilePage, Integer> {

}
