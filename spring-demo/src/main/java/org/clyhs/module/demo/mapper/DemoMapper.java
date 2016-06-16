package org.clyhs.module.demo.mapper;

import org.clyhs.module.demo.domain.Demo;



public interface DemoMapper {

	Demo findById(Integer id);

	void insert(String name, int id);
	
	void update(Demo demo);
}
