public class Q15{

	public static void main(String args[]){

		int smallest,secondsmallest;
		
		int[] a={7,6,2,1,3};
		
		smallest=a[0];
		secondsmallest=a[0];
		
		for(int i=0;i<5;i++){
			if(a[i]<smallest){
				secondsmallest=smallest;
				smallest=a[i];
				
			}else if(a[i]<secondsmallest && a[i]!=smallest){

				secondsmallest = a[i];	
			}

		}
		System.out.println("Second smallest is "+secondsmallest);
	}

}