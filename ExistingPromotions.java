package com.java.promotionengine.promotions;

import java.util.List;

import com.java.promotionengine.sku.SKUId;

public class ExistingPromotions {
	List<Promotions> existingPromotions;

	public ExistingPromotions() {
		
	}
	
	public List<Promotions> getExistingPromotions() {
		return existingPromotions;
	}

	public void setExistingPromotions(List<Promotions> existingPromotions) {
		this.existingPromotions = existingPromotions;
	}
	
	public void addPromotion(SKUId sKUId, int number){
		existingPromotions.add(new Promotions(sKUId, number));
		
	}
	
	public void deletePromotion(int promotionToBeRemoved){
		
		existingPromotions.remove(promotionToBeRemoved);
		
	}
}
