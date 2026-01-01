/*
Program to implement run-time polymorphism in Java(interface).
@Febin Sunny
 Roll No: 27
 17-11-2025

*/

import java.util.*;

interface  Calculate{

	public void result();
}


class Addition implements Calculate{
	int  a, b;
	public Addition(int  a, int b){
		this.a = a;
		this.b = b;
	}
	public void result(){
		System.out.println("Sum is "+ (a+b));
	}
}

class Substraction implements Calculate{
	int  a, b;
	public Substraction(int  a, int b){
		this.a = a;
		this.b = b;
	}
	public void result(){
		System.out.println("Difference  is "+ (a-b));
	}
}



public class P19{
	public static void main(String args[]){
		Calculate obj;
		 obj = new Addition(5,5);
		 obj.result();
		 obj = new Substraction(5,5);
		obj.result();
	}
}