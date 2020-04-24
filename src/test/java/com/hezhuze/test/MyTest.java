package com.hezhuze.test;

import java.text.ParseException;

import com.hezhuze.utils.DateUtil;
import com.hezhuze.utils.StringUtil;

public class MyTest {

	public static void main(String[] args) throws Exception {
//		有没有值
//		boolean empty = StringUtil.isEmpty("");
//		boolean empty2 = StringUtil.isEmpty("1");
//		System.out.println(empty);
//		System.out.println(empty2);
		
//		整数,小数
//		boolean b = StringUtil.isFloat("111");
//		boolean c = StringUtil.isFloat("1.2");
//		System.out.println(b);
//		System.out.println(c);
		
		int i = DateUtil.getAge("1997-09-02");
		System.out.println(i);
		
	}
}
