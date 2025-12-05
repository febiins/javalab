import java.util.*;


public class P6{

	int a[][],b[][],c[][],r1,r2,c1,c2;
	Scanner sc = new Scanner(System.in);

	public void read(){
		System.out.println("Enter the number of rows and columns of first matrix");
		r1=sc.nextInt();
		c1=sc.nextInt();
		a=new int[r1][c1];
		
		System.out.println("Enter the number of rows and columns of second matrix");
		r2=sc.nextInt();
		c2=sc.nextInt();
		b=new int[r2][c2];


		System.out.println("Enter the elements of first matrix");

		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				a[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("The first matrix is");
		
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				System.out.print(a[i][j]+"\t");

			}
			System.out.println("");
			
		}

		System.out.println("Enter the elements of second matrix");

		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				b[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("The second matrix is");
		
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				System.out.print(b[i][j]+"\t");

			}
			System.out.println("");
		}
			
	}

	public void add(){
		

		if(r1!=r2 && c1!=c2){
			System.out.println("Addition is not possible");
		}else{
			c= new int [r1][c1];
			for(int i=0;i<r1;i++){
				for(int j=0;j<c1;j++){
					c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("The added matrix is");
		
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				System.out.print(c[i][j]+"\t");

			}
			System.out.println("");
		}
		
	}
}


	public void multiply(){

		if(r1!=c2){
			System.out.println("Multiplication is not possible");

		}else{
			c = new int[r1][c2];
			for(int i=0;i<r1;i++){
				for(int j=0;j<c2;j++){

					c[i][j]=0;
					for(int k=0;k<c1;k++){
						c[i][j]+=a[i][k]*b[k][j];

					}
				}
			}
			System.out.println("The resultant matrix is");
		
			for(int i=0;i<r1;i++){
				for(int j=0;j<c2;j++){
					System.out.print(c[i][j]+"\t");

				}
				System.out.println("");
			}

			
		}

		
	}


	public void choice(){
	
		System.out.println("Do you want to use the same matrix which is used for addition for multiply Y(Yes) or N(No)");
		char ch;
		ch=sc.next().charAt(0);
		if(ch=='y'||ch=='Y'){

			multiply();
		}else{
			read();
			multiply();
		}
		
	}


	public static void main(String args[]){
		P6 obj = new P6();

		obj.read();

		try{
			obj.add();
		}catch(Exception e){}
		
		obj.choice();
		
	}

}