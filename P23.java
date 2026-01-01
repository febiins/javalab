/*
Write a program to implement re-throw and finally.
@Febin Sunny
 Roll No: 27
 17-11-2025

*/
import java.util.*;

class Division{
	
	int a,b;
	public Division(int a,int b){
		this.a = a;
		this.b = b;
	}
	public void operation(){

		try{
			int c =a/b;
			System.out.println("The result is : "+c);
		}catch(ArithmeticException e){
			System.out.println("Error is : "+e);
			throw e;
		}
		finally{
			System.out.println("Operation is finished");
		}
	}
}

public class P23{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.println("Enter two numbers:");
		x=sc.nextInt();
		y=sc.nextInt();
		Division obj = new Division(x,y);
		try{
			obj.operation();
		}catch(ArithmeticException e){
			System.out.println("Error is :"+e);
		}
		finally{
			System.out.println("Exception is handled");
		}
	}
}