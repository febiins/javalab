public class Q17{

	public static void main(String args[]){
		int [][] a={
		    {1,2,3},
		    {2,1,1}
		};

		int rows=a.length;
		int cols=a[0].length;

		for(int i=0;i<rows;i++){
			int rowsum=0;
			for(int j=0;j<cols;j++){
				System.out.print(a[i][j] + " ");
				rowsum+=a[i][j];
			}
			System.out.println("| " + rowsum);
		}
		System.out.println("---------");
		for(int i=0;i<cols;i++){
			int colsum=0;
			for(int j=0;j<rows;j++){
				colsum+=a[j][i];	
			}
			System.out.print(colsum + " ");
		}
	}
}