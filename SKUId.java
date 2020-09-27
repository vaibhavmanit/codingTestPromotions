package com.java.promotionengine.sku;

public enum SKUId {
	A(50),
	B(30),
	C(20),
	D(15);
	int unitPrice;
	private SKUId(int price){
		this.unitPrice = price;
	}
}
