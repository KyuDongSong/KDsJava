package com.ktds.kdsong;

public class ArmyMain {
	public static void main(String[] args) {
		Army army = new Army();

		Person kdj = army.makeArmy("DJ.Kim");
		System.out.println(kdj.getName());
		System.out.println(kdj.getJob());

		Person jsm = army.makeArmy("SM.Jo");
		System.out.println(jsm.getName());
		System.out.println(jsm.getJob());
	}
}
