package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EUDateGridResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;


@Controller //商品管理controller   
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable long itemId){
		return itemService.getItemById(itemId);
		
	}
	
	@RequestMapping("item/list")
	@ResponseBody
	public EUDateGridResult getItemList(Integer page,Integer rows){
		return itemService.getItemList(page, rows);
	}
	
}
