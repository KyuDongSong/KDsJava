package com.ktds.skd.fruitMarket;

import com.ktds.skd.fruitMarket.buyer.Buyer;
import com.ktds.skd.fruitMarket.seller.Seller;

public class Market {
	public void start(){		
		Buyer buyer = new Buyer(0, 5000000);
		Seller seller = new Seller(100, 50000000);
		
		buyer.buy(seller);
		
		System.out.println(buyer);
		System.out.println(seller);
	}
	public static void main(String[] args) {
		new Market().start();
	}
}
