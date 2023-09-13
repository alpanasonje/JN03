package com.tnsif.dayeleven;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class PriceListDemo {

	public static void main(String[] args) {
		List<Float> priceList=new ArrayList<Float>();
		priceList.add(56.78f);
		priceList.add(956.50f);
		priceList.add(50f);
		priceList.add(546.28f);
		priceList.add(300.70f);
		System.out.println(priceList);
		
		Collections.sort(priceList);
		System.out.println(priceList);
	}

}
