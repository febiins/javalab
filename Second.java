/* Program 2: Performing mathematical operations using switch case
   @Febin Sunny
   Roll No: 27
   19/11/2025
*/

import java.io.*;

public class Second{

	public static void main(String args[]){
		

		if (args.length != 3) {
			System.out.println("Usage: java Second <a> <b> <operation>");
                        System.out.println("operation: 0=+, 1=-, 2=*, 3=/, 4=%");
                        return;
                }

		int a,b,c,d;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		
		switch(c){

			case 0:
			  d=a+b;
			  System.out.println("Sum is "+d);
			  break;
			case 1:
			  d=a-b;
			  System.out.println("Difference is "+d);
			  break;
			case 2:
			  d=a*b;
			  System.out.println("Product is "+d);
			  break;
			case 3:
			  if(b==0){
			     System.out.println("Division by Zero is not possible");
			     return;	
			  }
			  d=a/b;
			  System.out.println("Division is "+d);
			  break;
			case 4:
			   if(b==0){
			     System.out.println("Modulus by Zero is not possible");
			     return;	
			  }

			  d=a%b;
			  System.out.println("Modulus is "+d);
			  break;
			default:
			  System.out.println("Invalid number");	
		}	
	}
	
}