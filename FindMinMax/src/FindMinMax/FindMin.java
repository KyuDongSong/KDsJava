package FindMinMax;

import java.util.Scanner;

public class FindMin {
	
	public void operator(){
		Scanner input = new Scanner(System.in);

		System.out.print("Please Input Number One: ");
		int numOne = input.nextInt();

		System.out.print("Please Input Number One: ");
		int numTwo = input.nextInt();

		System.out.print("Please Input Number One: ");
		int numThree = input.nextInt();
		
		findMin(numOne, numTwo, numThree);
		showMinNumber(findMin(numOne, numTwo, numThree));
	}
	
	public int findMin(int numOne, int numTwo, int numThree) {
		int min = numOne;
		
		// int smallNumber = (numOne < numTwo) ? numOn1 : numTwo;
		
		if(min > numTwo){
			min = numTwo;
			if(min > numThree){
				min = numThree;
			}
		}
		return min;
	}
	
	public void showMinNumber(int min){
		System.out.println("Minimun Number is " + min);
	}
}
