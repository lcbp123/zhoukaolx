package com.hezhuze.mapper;

import java.util.List;
import java.util.Map;

import com.hezhuze.bean.Goods;

public interface GoodsMapper {
//  添加数据
	public int insertGoods(Goods goods);
//	查询集合
	public List<Goods> selectAll(Map<String,Object> map);
 }
