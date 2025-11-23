public class Min{

	void minimum(int a, int b, int c){
		int min=(a<b)?((a<c)?a:c):((b<c)?b:c);
		System.out.println("Minimum value is "+min);
	}

	public static void main(String args[]){
		Min obj = new Min();
		obj.minimum(3,1,9);
		
	}
}