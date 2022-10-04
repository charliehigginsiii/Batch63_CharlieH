package Questions;

public class Person {
	String pid;
	String pname;
	Person[] persons=new Person[10];
	public Person() {
		
	}
	public Person(String pid,String pname) {
		this.pid=pid;
		this.pname=pname;
	}
	public void printNames(Person[]arr) {
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i].pname.charAt(0)=='A'||arr[i].pname.charAt(0)=='a'||arr[i].pname.charAt(0)=='J'||arr[i].pname.charAt(0)=='j') {
				System.out.println("Person Name: "+arr[i].pname+", Person Id: "+arr[i].pid);
			}
		}
	}
	public static void main(String[]args) {
		Person obj=new Person();
		Person p1=new Person("101","Jim");
		Person p2=new Person("102","Jack");
		Person p3=new Person("103","Joe");
		Person p4=new Person("104","Carlos");
		Person p5=new Person("105","Kathy");
		Person p6=new Person("106","Sam");
		Person p7=new Person("107","Jean");
		Person p8=new Person("108","Vladimir");
		Person p9=new Person("109","Jackie");
		Person p10=new Person("110","Alex");
		obj.persons[0]=p1;
		obj.persons[1]=p2;
		obj.persons[2]=p3;
		obj.persons[3]=p4;
		obj.persons[4]=p5;
		obj.persons[5]=p6;
		obj.persons[6]=p7;
		obj.persons[7]=p8;
		obj.persons[8]=p9;
		obj.persons[9]=p10;
		obj.printNames(obj.persons);
		
		
		
	}

}
