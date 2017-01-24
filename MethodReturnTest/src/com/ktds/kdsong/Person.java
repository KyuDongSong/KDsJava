package com.ktds.kdsong;

public class Person {

	private String name;
	private String job;

	/**
	 * Person의 Default 생성자 
	 * --------------------- 
	 * 멤버변수 값 초기화
	 * ---------------------
	 * 메소드 오버로딩
	 * -> 이름은 같으나 파라미터의 개수나 종류가 다를 경우 다른 메소드로 간주
	 * 생성자 오버로딩
	 * -> 하나의 클래스에 여러개의 생성자를 만들어서 각기 다른 객체로 사용
	 * -> 기본 생성자에 파라미터를 추가하여 데이터를 초기화한다.
	 */
	public Person(String name, String job) {
		System.out.println("Person Constructor Is Running!!");
		setName(name);
		setJob(job);
	}

	public Person() {
		System.out.println("Default Person Constructor Is Running!!");
		setName(name);
		setJob(job);
	}

	public void introduce() {
		System.out.println("이름: " + name + " 직업: " + job);
	}
	/**
	 * public 가져올 멤버변수 타입 get가져올_멤버변수_명(){
	 * 		return 가져올_멤버변수;
	 * }
	 * @return
	 */
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}
}
