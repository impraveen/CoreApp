package com.psr.app.service;

import com.psr.app.bean.WebPage;

public interface WebPageService {

	public WebPage getTilePageByID(Integer id);
	
	public WebPage addTilePage(WebPage page);
}
