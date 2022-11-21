package ProblemSet1;

public class Problem6 {
	public void isConsonant(char letter) {
		if(letter=='a'||letter=='o'||letter=='e'||letter=='i'||letter=='u') {
			System.out.println("Letter is a vowel.");
		}else {
			System.out.println("Letter is a consonant.");
		}
	}
	public static void main(String[]args) {
		new Problem6().isConsonant('o');
	}

}
