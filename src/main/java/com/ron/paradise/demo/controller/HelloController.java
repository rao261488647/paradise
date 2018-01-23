package com.ron.paradise.demo.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ron.paradise.demo.entity.TUser;
import com.ron.paradise.demo.mapper.DemoMapper;


@Controller
public class HelloController {
	private Logger logger = LoggerFactory.getLogger(HelloController.class);

	@Autowired
	private DemoMapper demoMapper;
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello(Model model) {
		logger.debug("hello方法执行！");
		model.addAttribute("name", "ron");
		return "/hello";
	}
	@RequestMapping("/helloHtml")
	public String helloHtml(Map<String,Object> map){
		TUser user = demoMapper.getUserByConditions("饶鹏");
		map.put("hello","我是"+user.getName()+"，我的密码是："+user.getPwd());
		return"/helloHtml";
	}

}
