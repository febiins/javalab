import java.util.*;

public class MToN{


	public static void main(String args[]){

		int m,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower bound");
		m=sc.nextInt();
		System.out.println("Enter the upper bound");
		n=sc.nextInt();
		while(m<=n){
			System.out.print(m+"\t");
			m++;

		}
	}

}