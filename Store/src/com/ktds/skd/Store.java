package com.ktds.skd;

import com.ktds.skd.buyer.Buyer;
import com.ktds.skd.seller.Seller;

public class Store {
	public void start() {

		/*
		 * Buyer ljs = new Buyer(0, 5000000); Buyer jgu = ljs;
		 * 
		 * ljs.buy();
		 * 
		 * System.out.println(ljs); System.out.println(jgu);
		 */
		
		Buyer lyj = new Buyer(0, 50000);
		Seller nym = new Seller(500, 50000);
		
		lyj.buy(nym); // 구매자가 판매자에게 구매한다.
		
		System.out.println(lyj);
		System.out.println(nym);

		/*
		 * System.out.println("Welcome to Market Place!!");
		 * 
		 * Buyer jjh = new Buyer(0, 500000); Seller mjk = new Seller(100,
		 * 5000000);
		 * 
		 * System.out.
		 * println("Buyer: Shut up and take my money!! Give me 1 product!!");
		 * mjk.sell(); jjh.buy();
		 * 
		 * System.out.println("Seller: 2500Won"); jjh.pay(2500);
		 * 
		 * System.out.println(mjk); System.out.println(jjh);
		 */

	}

	public static void main(String[] args) {

		new Store().start();
	}
}
