package student;

public class Student {

	public String name = "KyuDongSong";
	public int height = 170;
	public int weight = 70;

	private int score = 0;
	private int tired = 0;
	
	// name instance field 갱신
	public void setName(String name){
		this.name = name;
	}

	public void introduce() {
		System.out.println("제 이름은 " + name + " 입니다.");
	}

	public void study() {
		System.out.println(name + "은 공부를 합니다.");
		score += 10;
		tired += 10;
		System.out.println("성적은: " + score + "입니다.");
		System.out.println("피로도는: " + tired + "입니다.");
	}

	public void play() {
		System.out.println(name + "은 운동을 합니다.");
		weight--;
		tired += 10;
		System.out.println("몸무게는: " + weight + "입니다.");
		System.out.println("피로도는: " + tired + "입니다.");
	}

	public void eat() {
		System.out.println(name + "은 밥을 먹습니다.");
		weight++;
		System.out.println("몸무게는: " + weight + "입니다.");
	}

	public void sleep() {
		System.out.println(name + "은 잠을 잡니다.");
		tired = 0;
		height++;
		System.out.println("키는: " + height + "입니다.");
		System.out.println("피로도는: " + tired + "입니다.");
	}

	public void state() {
		System.out.println("이름은: " + name);
		System.out.println("키는: " + height);
		System.out.println("몸무게는: " + weight);
		System.out.println("점수는: " + score);
		System.out.println("피로도는: " + tired);
	}

}
