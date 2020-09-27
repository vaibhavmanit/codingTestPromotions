package com.java.promotionengine.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import com.java.promotionengine.calculation.CalculationOrderValue;
import com.java.promotionengine.promotions.ExistingPromotions;
import com.java.promotionengine.sku.SKUId;

public class TestPromotionEngine {

	public static void main(String[] args) {
		
		System.out.println("Welcome to promotion engine");
		System.out.println();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTestCases = 3;

		System.out.println("Following are Active Promotions: " );
		ExistingPromotions existPromo = new ExistingPromotions(); 
		existPromo.activePromotions(existPromo);
		
		
		//Test case 1: 1*A, 1*B, 1*C
		CalculationOrderValue calcOrderVal1 = new CalculationOrderValue();
		Map <SKUId,Integer>calcOrderValMap1 = new HashMap<SKUId,Integer>();
		calcOrderValMap1.put(SKUId.A,1);
		calcOrderValMap1.put(SKUId.B,1);
		calcOrderValMap1.put(SKUId.C,1);
		calcOrderVal1.setProductQuantitiesMap(calcOrderValMap1);
			
		System.out.println("Cost for Scenario 1 :" + calcOrderVal1.calculate());
		
		//Test case 2: 5*A, 5*B, 1*C
		CalculationOrderValue calcOrderVal2 = new CalculationOrderValue();
		Map <SKUId,Integer>calcOrderValMap2 = new HashMap<SKUId,Integer>();
		calcOrderValMap2.put(SKUId.A,5);
		calcOrderValMap2.put(SKUId.B,5);
		calcOrderValMap2.put(SKUId.C,1);
		calcOrderVal2.setProductQuantitiesMap(calcOrderValMap2);
			
		System.out.println("Cost for Scenario 2 :" + calcOrderVal2.calculate());
		
		//Test case 2: 3*A, 5*B, 1*C, 1*D
		CalculationOrderValue calcOrderVal3 = new CalculationOrderValue();
		Map <SKUId,Integer>calcOrderValMap3 = new HashMap<SKUId,Integer>();
		calcOrderValMap3.put(SKUId.A,3);
		calcOrderValMap3.put(SKUId.B,5);
		calcOrderValMap3.put(SKUId.C,1);
		calcOrderValMap3.put(SKUId.D,1);
		calcOrderVal3.setProductQuantitiesMap(calcOrderValMap3);
			
		System.out.println("Cost for Scenario 3 :" + calcOrderVal3.calculate());

	}

}
