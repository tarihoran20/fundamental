package com.truSeven;

import java.util.ArrayList;
import java.util.Collection;
public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> collect = new ArrayList<String>();
		Collection<String> dataCollect = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			collect.add("content" + i);
			dataCollect.add("collect " + i);
		}
		
		Class1 dataList = new Class1();
		
//		for (int i = 0; i < dataList.data.size(); i++) {
//			System.out.println();
//		}
//		
		//System.out.println(buah);
	}

}
