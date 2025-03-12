package com.jspider.Number;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
	public static void main(String[] args) {
		int a[]= {10,20,30,10,20,10};
		HashMap<Integer, Integer> m=new HashMap<Integer, Integer>();

		for(int i=0;i<=a.length-1;i++) {
			if(m.containsKey(a[i])) {
				m.put(a[i], m.get(a[i])+1);
			}else {
				m.put(i, 1);
			}
		}
		int maxcount=0,max=0;
		for(Map.Entry<Integer, Integer> m1:m.entrySet()) {
			if(m1.getValue()>maxcount) {
				maxcount=m1.getValue();
				max=m1.getKey();
			}
		}
		System.out.println(max);

	}

}
