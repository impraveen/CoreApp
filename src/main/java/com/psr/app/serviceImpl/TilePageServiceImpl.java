package com.psr.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psr.app.bean.TilePage;
import com.psr.app.dao.TilePageDao;
import com.psr.app.service.TilePageService;

@Service
public class TilePageServiceImpl implements TilePageService {

	@Autowired
	private TilePageDao jpaDao;
	
	@Override
	public TilePage getTilePageByID(Integer id) {
		return jpaDao.findOne(id);
	}

	@Override
	public TilePage addTilePage(TilePage page) {
		return jpaDao.saveAndFlush(page);
	}
}
