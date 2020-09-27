package com.java.promotionengine.promotions;

import java.util.ArrayList;
import java.util.List;

import com.java.promotionengine.sku.SKUId;

public class ExistingPromotions {
	private List<Promotions> existingPromotions;
	

	public ExistingPromotions() {
		existingPromotions = new ArrayList<Promotions>();
		Promotions promotionA = new Promotions(new SKUId[] {SKUId.A}, new int [] {3}, 130);
		existingPromotions.add(promotionA);
		
		Promotions promotionB = new Promotions(new SKUId[] {SKUId.B}, new int [] {2}, 45);
		existingPromotions.add(promotionB);
		
		Promotions promotionCD = new Promotions(new SKUId[] {SKUId.C,SKUId.D}, new int [] {1,1}, 20);
		existingPromotions.add(promotionCD);
		
	}
	
	public List<Promotions> getExistingPromotions() {
		return existingPromotions;
	}

	public void setExistingPromotions(List<Promotions> existingPromotions) {
		this.existingPromotions = existingPromotions;
	}
	
	public void addPromotion(SKUId []sKUId, int []number, int costForPromotion){
		existingPromotions.add(new Promotions(sKUId, number,costForPromotion));
		
	}
	
	public void activePromotions(ExistingPromotions existPromo) {
		
		for(Promotions promotion: existPromo.getExistingPromotions()) {
			for(int count = 0; count< promotion.getsKUId().length ; count++) {
				if(count+1==promotion.getsKUId().length) {
					System.out.println(promotion.getNumberOfSKUid()[count] + " of " + promotion.getsKUId()[count]
						+ "'s for " + promotion.getCostOfPromotion());
					System.out.println();
				}else {
					System.out.print(promotion.getNumberOfSKUid()[count] + " of " + promotion.getsKUId()[count]
							+ "'s and ");
				}
			}
		}
	}
	
	public void deletePromotion(int promotionToBeRemoved){
		
		existingPromotions.remove(promotionToBeRemoved);
		
	}
	
}
