package com.java.promotionengine.calculation;

import java.util.List;
import java.util.Map;

import com.java.promotionengine.promotions.ExistingPromotions;
import com.java.promotionengine.promotions.Promotions;
import com.java.promotionengine.sku.SKUId;

public class CalculationOrderValue {

	private Map<SKUId,Integer> productQuantitiesMap;
	
	public Map<SKUId, Integer> getProductQuantitiesMap() {
		return productQuantitiesMap;
	}

	public void setProductQuantitiesMap(Map<SKUId, Integer> productQuantitiesMap) {
		this.productQuantitiesMap = productQuantitiesMap;
	}
	
	public int calculate(){
		int cost = 0;
		ExistingPromotions existPromo = new ExistingPromotions(); 
		List<Promotions> ar = existPromo.getExistingPromotions();
		boolean cPlusD = false;
		int numberOfC = 0;
		
		for(Map.Entry<SKUId,Integer> entry : productQuantitiesMap.entrySet()) {
			switch(entry.getKey()) {
				case A:
					
					if(ar.contains(SKUId.A) && (entry.getValue() < 3)) {
						
						cost += entry.getValue()*(entry.getKey().valueOf(entry.getKey()));
						
					}else {
						
						cost += (entry.getValue()/3)*130;
						cost += (entry.getValue()%3)*(entry.getKey().valueOf(entry.getKey()));
					}
					
				break;
				
				case B: 
					if(ar.contains(SKUId.B) && (entry.getValue() < 2)) {
						
						cost += entry.getValue()*(entry.getKey().valueOf(entry.getKey()));
						
					}else {
						
						cost += (entry.getValue()/2)*45;
						cost += (entry.getValue()%2)*(entry.getKey().valueOf(entry.getKey()));
					}
					break;
				case C:
					cPlusD = true;				
					cost += entry.getValue()*(entry.getKey().valueOf(entry.getKey()));
					numberOfC = entry.getValue();
					break;
						
				case D: 
					if(cPlusD) {
						cost += entry.getValue()*(entry.getKey().valueOf(entry.getKey())) - 5*Math.min(entry.getValue(), numberOfC);
					}else {
						cost += entry.getValue()*(entry.getKey().valueOf(entry.getKey()));
					}
					
			}
			
			/*if() {
				
			}else if(){
				
			}else {
				cost += entry.getValue()*(entry.getKey().valueOf(entry.getKey()));
			}*/
//			System.out.println(entry.getValue() + " :entry.getValue()");
//			System.out.println(entry.getKey().valueOf(entry.getKey()) + " :entry.getKey().valueOf(entry.getKey())");
//			System.out.println("Number of Items" + ar.get(ar.indexOf(SKUId.A)).getNumberOfSKUid()[ar.indexOf(SKUId.A)]);
			
			
//			cost += entry.getValue()*(entry.getKey().valueOf(entry.getKey()));
		}
		
		return cost;
	}
	
}
