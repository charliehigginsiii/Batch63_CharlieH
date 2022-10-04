package Questions;

public class ReverseString {
	public String reverseString(String s) {
		String[] stringarr=s.split(" ");
		String newString="";
		for(int i=stringarr.length-1;i>=0;i--) {
			newString+=stringarr[i]+" ";
		}
		return newString;
	}
	public static void main(String[]args) {
		ReverseString obj=new ReverseString();
		String s=obj.reverseString("Java is easy");
		System.out.println(s);
	}

}
