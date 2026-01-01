
/*  Program to overcome function overriding in Java.
   @Febin Sunny
   Roll No: 27
   17-11-2025
*/

import  java.util.*;

class Person{
	String name;
	Scanner sc = new Scanner(System.in);
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

public class P16{

	public static void main(String args[]){
		Teacher obj = new Teacher();
		obj.read();
		obj.disp();
	}
}