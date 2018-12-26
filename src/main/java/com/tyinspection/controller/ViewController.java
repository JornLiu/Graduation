package com.tyinspection.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tyinspection.entity.ElecComponents;
import com.tyinspection.entity.Resource;

@Controller
//@RequestMapping("/view")
public class ViewController {
	@Autowired
	private Resource resource;
	@RequestMapping("/index")
	public String hello(){
		return "index";
	}
	@RequestMapping("/get")
	@ResponseBody
	public ElecComponents getCompants(){
		ElecComponents ec =new ElecComponents();
		ec.setId(1);
		ec.setMaterialName("电阻");
		ec.setInspectNum(60);
		ec.setDapNum(5);
		ec.setInspectCondition("IV");
		return ec;
	}
	@RequestMapping("/getResource")
	@ResponseBody
	public Resource getResource(){
		Resource bean =new Resource();
		BeanUtils.copyProperties(resource, bean);
		return bean;
	}

}
