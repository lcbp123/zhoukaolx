package com.hezhuze.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hezhuze.bean.Goods;
import com.hezhuze.mapper.GoodsMapper;
@Service
public class GoodsServiceImpl implements GoodsService {

	@Resource
	private GoodsMapper mapper;
	
	public List<Goods> selectAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.selectAll(map);
	}

}
