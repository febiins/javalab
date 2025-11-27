public class Q16{

	public static void main(String args[]){
		int [] a={10,6,3,5,2};
		
		for(int i=0;i<5;i++){
			for(int j=i+1;j<5;j++){

				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<5;i++){
			System.out.print(a[i]+"\t");
		}

	}
}