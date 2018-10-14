package com.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.pojo.TbItemExample.Criteria;
import com.taotao.service.ItemService;

@Service //商品管理service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;
	@Override
	public TbItem getItemById(long itemId) {
//		System.out.println(itemMapper.selectByPrimaryKey(itemId));
		TbItemExample example = new TbItemExample();
		//添加查询条件
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(itemId);
		List<TbItem> list = itemMapper.selectByExample(example);
		if(list!=null && list.size()>0){
			TbItem tbItem = list.get(0);
			return tbItem;
		}
		System.out.println("调用了service类中的getItemById方法");
		return null;
	}
	
	/*TbItemExample example = new TbItemExample();
	//添加查询条件
	Criteria criteria = example.createCriteria();
	criteria.andIdEqualTo(itemId);
	List<TbItem> list = itemMapper.selectByExample(example);
	if(list!=null && list.size()>0){
		TbItem tbItem = list.get(0);
		return tbItem;
	}*/
}
