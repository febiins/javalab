import java.util.*;
public class Prime{

	void primenumber(){
		int n;
		boolean prime=true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		
		if(n==1){
			prime=true;
		}else{
			for(int i=2;i<n/2;i++){
				if(n%i==0){
					prime=false;
				}
			}
		}
		if(prime==true){
			System.out.println("Number is prime");
		} else{
			System.out.println("Number is not prime");
		}
	}

	public static void main(String args[]){
		new Prime().primenumber();
	}
}