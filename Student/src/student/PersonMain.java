package student;

public class PersonMain {
	public static void main(String[] args) {
		Person skd = new Person();
		skd.setName("KD.Song");
		skd.setJob("Programmer");
		skd.introduce();

		Person nym = new Person();
		nym.setName("YM.Nam ");
		nym.setJob("무직");
		nym.introduce();

		Person skb = new Person();
		skb.setName("KB.Song");
		skb.setJob("SamSungMan");
		skb.introduce();

		Person unknown = new Person();
		unknown.introduce();
		
		Person abc = new Person("에이비씨", "알파벳");
		abc.introduce();

	}
}
