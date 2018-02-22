package com.psr.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psr.app.bean.WebPage;
import com.psr.app.dao.WebPageDao;
import com.psr.app.service.WebPageService;

@Service
public class WebPageServiceImpl implements WebPageService {

	@Autowired
	private WebPageDao jpaDao;
	
	@Override
	public WebPage getTilePageByID(Integer id) {
		return jpaDao.findOne(id);
	}

	@Override
	public WebPage addTilePage(WebPage page) {
		return jpaDao.saveAndFlush(page);
	}
}
