/*  Program to implement the ISA and HASA relationship.
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
	public void dispPerson(){
		System.out.println("Name is "+name);
	}
		
}

class Teacher extends Person{
	String subject;

	public void input(){
		System.out.println("Enter your subject");
		subject = sc.nextLine();
	}

	public void dispTeacher(){

		System.out.println("Subject is "+subject);
	}

}

class Engine{

	public void start(){
		System.out.println("Engine is starting.....");
	}

}

class Car{
	Engine e;
	
	public Car(){
		e = new Engine();
	}
	
	public void move(){
		e.start();
		System.out.println("Car is moving....");
	}

}


public class P15{

	public static void main(String args[]){
		Teacher obj = new Teacher();
		Car obj2 = new Car();
		
		System.out.println("ISA");
		obj.read();
		obj.input();
		obj.dispPerson();
		obj.dispTeacher();
		
		System.out.println("HASA");
		obj2.move();
	}
}