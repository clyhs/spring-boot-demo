package org.clyhs.module.demo.web;

import java.util.List;

import org.clyhs.module.demo.domain.Demo;
import org.clyhs.module.demo.mapper.DemoMapper;
import org.clyhs.module.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@Autowired
	private DemoMapper demoMapper;
	
	@Autowired
	private DemoService demoService;

	@RequestMapping("/module/demo/index")
	public String index(){
		return "hello world";
	}
	
	@RequestMapping(value="/module/demo/{id}", method = { RequestMethod.GET })
	public Demo getById(@PathVariable("id") Integer id){
		return demoMapper.findById(id);
	}
	
	
	
	
	@RequestMapping(value="/module/demo/getcache", method = { RequestMethod.GET })
	public Demo getDemo(){
		System.out.println("-----");
		return demoService.findDemo(1);
	}
	
	@RequestMapping(value="/module/demo/getallcache", method = { RequestMethod.GET })
	public List<Demo> getAllDemo(){
		System.out.println("-----");
		return demoService.getalldemo();
	}
	
	@RequestMapping(value="/module/demo/updatecache", method = { RequestMethod.GET })
	public String updateDemo(){
		System.out.println("****");
		Demo demo = new Demo(1,"454354534");
		demoService.updateDemo(demo);
		return "ok";
	}
	
	
	@RequestMapping(value="/module/demo/createcache", method = { RequestMethod.GET })
	public String createDemo(){
		System.out.println("**---*");
		demoService.create();
		return "ok";
	}
	
	
	
	
	
	
	
	@RequestMapping("/module/demo/hello")
	public String hello(){
		return "hello";
	}
}
