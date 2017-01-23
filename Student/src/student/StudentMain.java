package student;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Student kd = new Student();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int choice = 0;
		
		//kd.name = "송규동";
		kd.setName("송규동");

		kd.introduce();
		while (choice != 6) {
			System.out.println("할일을 선택하세요.(1. 소개, 2. 공부, 3. 운동, 4. 밥먹기, 5. 잠자기, 6. 현재상태 출력 및 종료)");
			choice = input.nextInt();

			if (choice == 1) {
				kd.state();
			} else if (choice == 2) {
				kd.study();
			} else if (choice == 3) {
				kd.play();
			} else if (choice == 4) {
				kd.eat();
			} else if (choice == 5) {
				kd.sleep();
			} else if (choice == 6) {
				kd.state();
				break;
			} else {
				System.out.println("잘못된 입력(입력은 1 ~ 6)");
				choice = 0;
			}
		}
	}
}
