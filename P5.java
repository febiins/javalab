import java.util.*;

public class P5{

void display(int[] a){

	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"\t");
	}
}

int [] array(){
	int n;
	int [] a;
	System.out.println("Enter the size of array");
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	a=new int[n]; 
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	return a;
}


public static void main(String args[]){
		int[] a={1,2,3,4};
		P5 obj = new P5();
		obj.display(a);
		System.out.println("");
		int []arr=obj.array();
		for(int x : arr){
			System.out.print(x+"\t");
		}
		
	}
}