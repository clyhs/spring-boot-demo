package org.clyhs.module.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping("/module/demo/helloftl")
	public String hello(){
		return "hello";
	}
}
