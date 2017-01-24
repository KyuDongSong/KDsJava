package com.ktds.kdsong;

public class CalculatorMain {
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		calc.printComputeResult();
		calc.printComputeResult(10, 50);
		calc.getAndPrintMultpulicationResult(10, 50);
		
		int result = calc.getAndPrintMultpulicationResult(40, 50);
		
		System.out.println(calc.printComputeResult(10, 7));
		
	}
}
