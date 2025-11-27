

import java.util.*;

public class Q3 {

	public static void main(String args[]){

		int secretnumber=25;
		int guess,count=0;
		Scanner sc = new Scanner(System.in);

		do{
			System.out.println("Guess the number between 20 and 30");
			guess=sc.nextInt();
			count++;
					
		}while(guess!=secretnumber);
		
		System.out.println("The number of attempts you have taken is: "+count);

	}
}