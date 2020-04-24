package com.hezhuze.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hezhuze.bean.Goods;
import com.hezhuze.service.GoodsService;

@Controller
public class GoodsController {

	@Resource
	private GoodsService str;
	
	@RequestMapping("list")
	public String sayList(@RequestParam(defaultValue = "1")Integer pageNum,
				Model model,Integer min,Integer max,Integer smin,
				Integer smax,String column,String orders){
		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("min", min);
		map.put("max", max);
		map.put("smin", smin);
		map.put("smax", smax);
		map.put("column", column);
		map.put("orders", orders);
		PageHelper.startPage(pageNum, 3);
		List<Goods> list = str.selectAll(map);
		PageInfo<Goods> plist = new PageInfo<Goods>(list);
		model.addAttribute("plist", plist);
		return "list";
	}
}
