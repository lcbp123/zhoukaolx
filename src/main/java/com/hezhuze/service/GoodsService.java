package com.hezhuze.service;

import java.util.List;
import java.util.Map;

import com.hezhuze.bean.Goods;

public interface GoodsService {
//	查询集合
	public List<Goods> selectAll(Map<String,Object> map);
 }
