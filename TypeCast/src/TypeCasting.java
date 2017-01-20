
public class TypeCasting {
	public static void main(String[] args) {
		/*
		 * int 4byte
		 * long 8byte
		 * float 4byte
		 * double 8byte
		 * 
		 * 4byte + 4byte = 4byte
		 * 8byte + 4byte = 8byte
		 * 4byte + 8byte = 8byte
		 * 8byte + 8byte = 8byte
		 * */
		
		//4byte + 4byte
		int numberOne = 10; // 4byte
		int numberTwo = 30; // 4byte
		
		// 4byte = 4byte + 4byte	
		// 4byte = 2byte + 4byte
		// 4byte = 1byte + 4byte
		int result = numberOne + numberTwo;
		System.out.println("result: " + result);
		
		float result2 = 50 + 50.0F;
		System.out.println("result: " + result2);
		
		//명시적 캐스팅
		//int number2 = 10 + 10.6;
		// -> int number2 = (int) (10+10.6);
		int number2 = (int) (10+10.6);
		
		double floatingNumber = 50.12355;
		int number3 = 10000;
		
		int number4 = number3 + (int)floatingNumber;
		
	}
}
