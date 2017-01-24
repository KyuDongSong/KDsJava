package com.ktds.kdsong;

public class Calculator {
	public void printComputeResult() {
		int result = 1 + 1;
		System.out.println(result);
	}

	/**
	 * printComputeResult method over loading 
	 * 메소드의 이름은 같지만 파라미터의 종류나 개수가 다른 메소드
	 *
	 * @param numberOne
	 * @param numberTwo
	 */
	public int printComputeResult(int numberOne, int numberTwo) {
		int result = numberOne + numberTwo;
		System.out.println(result);
		
		return result;
	}
	/**
	 * 숫자 두 개를 전달 받아 곱한 뒤 출력하고 반환
	 * @param numberOne : 첫번째 입력되는 숫자
	 * @param numberTwo : 두번째 입력되는 숫자
	 * @return result : 결과 값
	 */
	public int getAndPrintMultpulicationResult(int numberOne, int numberTwo) {
		int result = numberOne * numberTwo;
		System.out.println(result);

		return result;
	}
}
