package com.ktds.kds;

public class Stand {
	private String button = "Switch";
	private String lamp = "Lamp";
	private String eletric = "Eletric";

	private int light = 0;

	public void on() {
		System.out.printf("%s가 들어옵니다.\n", eletric);

		System.out.println("Turn On Stand");

		light = 5;
		String message = String.format("%s를 눌러서 %s를 켠다", button, lamp);
		System.out.println(message);

		message = String.format("밝기는 %d 입니다.\n", light);
	}

	public void off() {
		System.out.println("Turn Off Stand");

		light = 0;
		String message = String.format("%s를 눌러서 %s를 끈다", button, lamp);
		System.out.println(message);

		message = String.format("밝기는 %d 입니다.", light);
	}

	public void brightnessControlUp() {
		if (light > 0) {
			light++;
			System.out.printf("밝기 조절. 밝기는 %d\n", light);
		} else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}

	public void brightnessControlDown() {
		if (light > 0) {
			light--;
			System.out.printf("밝기 조절. 밝기는 %d\n", light);
		} else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
}
