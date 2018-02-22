package com.psr.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.psr.app.bean.TilePage;
import com.psr.app.service.TilePageService;

@Controller
@RequestMapping(value = "/page")
public class TilePageController {

	@Autowired
	private TilePageService service;
	
	@RequestMapping(value="/get/{id}", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody TilePage getTilePageById(@PathVariable("id") Integer id) {
	    return service.getTilePageByID(id);
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ResponseEntity <String> addTilePage(@RequestBody TilePage page) {
		if(service.addTilePage(page) != null)
			return ResponseEntity.status(HttpStatus.CREATED).build();
		return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
			
	}
}
