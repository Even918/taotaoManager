package com.taotao.service;

import com.taotao.common.pojo.EUDateGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
	//商品id
	TbItem getItemById(long itemId);
	//商品列表
	EUDateGridResult getItemList(int page,int rows);
}
