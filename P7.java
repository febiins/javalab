
import java.util.*;


public class P7{

	public int max(int a, int b){

		if(a>b){
			return a;
		}else{

			return b;
		}
	}

	public static void main(String args[]){
		int maximum,a1,b1,c1;
		P7 obj=new P7();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three numbers");
		a1=sc.nextInt();
		b1=sc.nextInt();
		c1=sc.nextInt();
		maximum=obj.max(obj.max(a1,b1),c1);
		System.out.println("Maximum number is: "+maximum);
		
	}


}