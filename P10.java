

public class P10{

	public void print(int n){

		if(n==0){
			return;
		}
		System.out.print(n+" ");
		print(n-1);

	}

	public void print2(int n){
		if(n==0){
			return;			
		}
		print2(n-1);
		System.out.print(n+" ");
	}


	public static void main(String args[]){

		P10 obj = new P10();
		System.out.print("n-1: ");
		obj.print(3);
		System.out.println();

		System.out.print("1-n: ");
        	obj.print2(3); 
		System.out.println();

	}


}