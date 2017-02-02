package com.ktds.skd;

import com.ktds.skd.exceptions.MissingValueException;
import com.ktds.skd.exceptions.MissmatchValueException;

public class Student {

	public void start() {
		try { // 에러가 발생할 경우 에러 밑에 있는 코드는 실행되지 않는다.
			registNewStudent();
		} catch (MissingValueException e) {
			System.out.println(e.getMessage());
		} finally { // 예외처리가 되던 말던 일단 실행
			System.out.println("처리완료");
		}
		
		// try - catch - finally => 완벽한 예외처리
		// try - finally => 한번 해 보고 예외 발생하기 전에 finally 한번 실행 해보자

		System.out.println("clear~");

	}

	public void registNewStudent() throws MissingValueException {
		String name = "";
		String school = "KTds";

		// Exception 이기 때문에 throws를 반드시 적어줘야 한다.
		if (name == null) {
			throw new MissingValueException("Name 은 필수 입력 값 입니다!ㅅㅂ!!");
		}

		// RuntimeExcepion 이기 때문에 throws 필요 x
		// 위에 throws는 exception 때문에 쓴거임
		// 만약 둘다 Exception 이라면 ,로 여러개로 동시에 throws 가능
		if (!school.equals("KTds")) {
			throw new MissmatchValueException("학교 이름이 잘못 되었습니다!!ㅅㅂ!!");
		}

	}

	public static void main(String[] args) throws MissingValueException {
		new Student().start();
	}
}
