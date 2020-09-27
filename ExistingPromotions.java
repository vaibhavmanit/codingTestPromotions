package com.java.promotionengine.promotions;

import java.util.ArrayList;
import java.util.List;

import com.java.promotionengine.sku.SKUId;

public class ExistingPromotions {
	List<Promotions> existingPromotions;

	public ExistingPromotions() {
		existingPromotions = new ArrayList<Promotions>();
		Promotions promotionA = new Promotions(new SKUId[] {SKUId.A}, new int [] {3});
		existingPromotions.add(promotionA);
		
		Promotions promotionB = new Promotions(new SKUId[] {SKUId.B}, new int [] {2});
		existingPromotions.add(promotionB);
		
		Promotions promotionCD = new Promotions(new SKUId[] {SKUId.C,SKUId.D}, new int [] {1,1});
		existingPromotions.add(promotionCD);
		
	}
	
	public List<Promotions> getExistingPromotions() {
		return existingPromotions;
	}

	public void setExistingPromotions(List<Promotions> existingPromotions) {
		this.existingPromotions = existingPromotions;
	}
	
	public void addPromotion(SKUId []sKUId, int []number){
		existingPromotions.add(new Promotions(sKUId, number));
		
	}
	
	public void deletePromotion(int promotionToBeRemoved){
		
		existingPromotions.remove(promotionToBeRemoved);
		
	}
}
