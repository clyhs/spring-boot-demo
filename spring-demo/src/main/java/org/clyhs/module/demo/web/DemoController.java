package org.clyhs.module.demo.web;

import org.clyhs.module.demo.domain.Demo;
import org.clyhs.module.demo.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	private DemoMapper demoMapper;

	@RequestMapping("/module/demo/index")
	public String index(){
		return "hello world";
	}
	
	@RequestMapping(value="/module/demo/{id}", method = { RequestMethod.GET })
	public Demo getById(@PathVariable("id") Integer id){
		return demoMapper.findById(id);
	}
}
