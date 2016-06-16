package org.clyhs.module.demo.service;


import java.util.ArrayList;
import java.util.List;

import org.clyhs.module.demo.domain.Demo;
import org.clyhs.module.demo.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	
	
	@Autowired
	private DemoMapper demoMapper;
	
	
    @Cacheable(value = "demoCache" ,key = "#id+'_demo'")
    public Demo findDemo(Integer id){
        System.out.println("无缓存的时候调用这里");
        return demoMapper.findById(id);
    }
    
    @CachePut(value="demoCache",key = "#demo.getId()+'_demo'")
    public Demo updateDemo(Demo demo){
    	demoMapper.update(demo);
    	return demo;
    }
    
    
    @CacheEvict(value="demoCache" )
    public void create(){
    	
    }
    
    @Cacheable(value = "demoCache" ,keyGenerator  = "baseKeyGenerator")
    public List<Demo> getalldemo(){
    	System.out.println("无缓存的时候调用这里");
    	List<Demo> demos = new ArrayList<Demo>();
    	demos.add(demoMapper.findById(1));
    	return demos;
    }
    
}
