package com.wang.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		List<String> vars = new ArrayList<>();
		vars.add("? (27.148.151.214) at <incomplete>  on pub_eth1");
		vars.add("? (192.168.17.7) at 78:4f:43:64:9a:21 [ether]  on br0");
		vars.add("? (192.168.17.1) at <incomplete>  on pub_eth1");
		vars.add("? (123.56.97.234) at <incomplete>  on br0");
		vars.add("? (192.168.17.1) at <incomplete>  on pub_eth2");
		vars.add("? (123.56.97.234) at <incomplete>  on pub_eth2");
		vars.add("? (123.56.97.234) at <incomplete>  on pub_eth1");
		vars.add("? (192.168.17.2) at c6:58:d6:3b:2a:b5 [ether]  on br0");
		vars.add("? (192.168.17.21) at <incomplete>  on br0");
		vars.add("? (27.148.151.214) at <incomplete>  on pub_eth1");
		vars.add("? (192.168.17.7) at 78:4f:43:64:9a:21 [ether]  on br0");
		vars.add("? (192.168.17.1) at <incomplete>  on pub_eth1");
		vars.add("? (123.56.97.234) at <incomplete>  on br0");
		vars.add("? (192.168.17.1) at <incomplete>  on pub_eth2");
		vars.add("? (123.56.97.234) at <incomplete>  on pub_eth2");
		vars.add("? (123.56.97.234) at <incomplete>  on pub_eth1");
		vars.add("? (192.168.17.2) at c6:58:d6:3b:2a:b5 [ether]  on br0");
		vars.add("? (192.168.17.21) at <incomplete>  on br0");
		vars.add("? (27.148.151.214) at <incomplete>  on pub_eth1");
		vars.add("? (192.168.17.7) at 78:4f:43:64:9a:21 [ether]  on br0");
		vars.add("? (192.168.17.1) at <incomplete>  on pub_eth1");
		vars.add("? (123.56.97.234) at <incomplete>  on br0");
		vars.add("? (192.168.17.1) at <incomplete>  on pub_eth2");
		vars.add("? (123.56.97.234) at <incomplete>  on pub_eth2");
		vars.add("? (123.56.97.234) at <incomplete>  on pub_eth1");
		vars.add("? (192.168.17.2) at c6:58:d6:3b:2a:b5 [ether]  on br0");
		vars.add("? (192.168.17.21) at 58:7f:57:4c:d2:8f [ether]  on br0");
		vars.add("? (1.0.0.1) at f0:de:b9:03:28:fc [ether]  on eth0");
		vars.add("? (192.168.0.12) at 58:7f:57:4c:d2:8f [ether]  on eth0.1");
		vars.add("? (192.168.0.11) at 78:4f:43:64:9a:21 [ether]  on eth0.1");
		vars.add("? (1.0.0.5) at f0:de:b9:03:28:fc [ether]  on eth0.9");
		vars.add("10.127.11.225            ether   02:50:f3:00:00:00   C                     ppp1");
		vars.add("192.168.0.43             ether   78:4f:43:64:9a:21   C                     br-wlan1");
		vars.add("192.168.0.57             ether   58:7f:57:4c:d2:8f   C                     br-wlan1");
		
		for(String var : vars){
			if(var.contains("(") && var.contains("")){
				var = var.substring(var.indexOf("(") + "(".length(), var.indexOf(")"));
				System.out.println(var);
			}else{
				System.out.println(var.split("\\s+")[0]);
			}
		}
//		
//		432413413
//		Map<String, int[]> maps = new HashMap<>();
//		maps.put("apks", new int[2]);
//		maps.get("apks")[0] += 10;
//		System.out.println(maps.get("apks")[0]);
		
		
		BigDecimal bd = new BigDecimal("1.489549355E12");
		System.out.println(bd.toPlainString());
	}

}
