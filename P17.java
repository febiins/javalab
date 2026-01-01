
/* Demonstrate the use of a super keyword
a. To overcome function overriding
b. Passing arguments to the base class constructor
   @Febin Sunny
   Roll No: 27
   17-11-2025
*/


import  java.util.*;

class Person{
	String name;
	Scanner sc = new Scanner(System.in);
	public Person(String s){

		name=s;
	}
	public void read(){

		System.out.println("Enter your name");
		name=sc.nextLine();
	}
	public void disp(){
		System.out.println("Name is "+name);
	}
		
}

class Teacher extends Person{
	String subject;
	public Teacher(String s1,String s2){
		super(s1);
		subject=s2;

	}

	public void read(){
		super.read();
		System.out.println("Enter your subject");
		subject = sc.nextLine();
	}

	public void disp(){
		super.disp();
		System.out.println("Subject is "+subject);
	}

}

public class P17{

	public static void main(String args[]){
		Teacher obj = new Teacher("Sunny","c++");
		obj.disp();
		obj.read();
		obj.disp();
	}
}