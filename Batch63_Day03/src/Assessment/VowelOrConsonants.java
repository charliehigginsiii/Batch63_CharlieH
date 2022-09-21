package Assessment;

public class VowelOrConsonants {
	public String vowelorconsonant(char a) {
		String typeofletter="Consonant";
		char[] chararray= {'a','e','o','i','u'};
		for(int i=0;i<chararray.length;i++) {
			if(a==chararray[i]) {
				typeofletter="Vowel";
			}
		}
		return typeofletter;
	}
	public static void main(String[]args) {
		char a='a';
		System.out.println(new VowelOrConsonants().vowelorconsonant(a));
	}
}
