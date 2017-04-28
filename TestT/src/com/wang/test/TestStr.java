package com.wang.test;

import java.util.List;
import java.util.ArrayList;

public class TestStr {

	public static void main(String[] args) {
		System.out.println("你是个什么玩意儿");
		//插入十万个随机数
		long startTimeStamp = System.currentTimeMillis();
		List<Double> randoms = new ArrayList<>();
		for(int i =0;i< 10000000;i++)
			randoms.add(Math.random());
		System.out.println("耗时: "+(System.currentTimeMillis() - startTimeStamp) + "毫秒");
		String aa = "T_2.4.6";
		System.out.println(aa.substring(2));

	}

}
