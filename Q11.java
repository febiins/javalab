
import java.util.Scanner;

public class Q11{

	public static void main(String args[]){
		int n;
		int current=0;
		int total=0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
			current=current+i;
			total=total+current;
		}
		System.out.println("sum is "+total);
	}

}

