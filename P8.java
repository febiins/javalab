
import java.util.*;


public class P8{
		
	public int rev(int n){
		int num=n;
		int rev=0;
		int digit;
		
		while(num>0){
			digit=num % 10;
			rev=rev * 10 + digit;
			num=num / 10;
		}
		return rev;
	}

	public boolean palindrome(int rev,int number){

		return(number==rev);
	}


	public static void main(String args[]){
		int numb;
		P8 obj = new P8();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		numb=sc.nextInt();
		
		boolean istrue=obj.palindrome(obj.rev(numb),numb);
		if(istrue){

			System.out.println("The number is palindrome");
		}else{

			System.out.println("The number is not palindrome");
		}
	}

}
