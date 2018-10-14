package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //页面跳转
public class PageController {
	/**
	 * 打开首页-->逻辑视图名
	 * @return
	 */
	@RequestMapping("/")
	public String showIndex(){
		return "index";
	}
	/**
	 * 展示其他页面
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
}
