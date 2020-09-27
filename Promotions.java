package com.java.promotionengine.promotions;

import com.java.promotionengine.sku.SKUId;

public class Promotions {
	private SKUId [] sKUId;
	private int [] numberOfSKUid;
	private int costForPromotion;
	
	public int getCostOfPromotion() {
		return costForPromotion;
	}

	public void setCostOfPromotion(int costOfPromotion) {
		this.costForPromotion = costOfPromotion;
	}

	public SKUId[] getsKUId() {
		return sKUId;
	}

	public void setsKUId(SKUId[] sKUId) {
		this.sKUId = sKUId;
	}

	public int[] getNumberOfSKUid() {
		return numberOfSKUid;
	}

	public void setNumberOfSKUid(int[] numberOfSKUid) {
		this.numberOfSKUid = numberOfSKUid;
	}
	
	public Promotions(SKUId[] sKUId, int[] numberOfSKUid, int costForPromotion) {
		this.sKUId = sKUId;
		this.numberOfSKUid = numberOfSKUid;
		this.costForPromotion = costForPromotion;
	}
	
}
