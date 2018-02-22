package com.psr.app.service;

import com.psr.app.bean.TilePage;

public interface TilePageService {

	public TilePage getTilePageByID(Integer id);
	
	public TilePage addTilePage(TilePage page);
}
