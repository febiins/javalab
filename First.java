/* Program 1: Displaying 2 numbers received as command-line arguments and display their sum
   @Febin Sunny
   Roll No: 27
   17-11-2025
*/


import java.io.*;
public class First{

	public static void main(String args[]){

		if(args.length!=2){
		
			System.out.println("Enter exactly two arguments");
			return;
		}
		
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=a+b;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("Sum = "+c);
	}
}