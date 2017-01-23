package HoeWork2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		SumAndAverage 	saa = new SumAndAverage();
		Temperator 		tmp = new Temperator();
		BMI 			bmi = new BMI();
	
		int choose = 0;
		
		while(choose != 4){
			
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("Choose The Program(1. SumAndAverage / 2. Temperator / 3. BMI / 4. EXIT)");
			choose = input.nextInt();
			
			if(choose == 1){
				saa.operator();
			} else if(choose == 2){
				tmp.operator();
			} else if(choose == 3){
				bmi.operator();
			} else if(choose == 4){
				System.out.println("EXIT THE PROGRAM..");
				break;
			} else {
				System.out.println("WRONG INPUT!!(Input 1 ~ 4)");
				choose = 0;
			}
			
		}
			
		
		
	}
}
