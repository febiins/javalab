
import java.util.*;

public class P4{
	int key,temp;
	int a[],n;
	
	Scanner sc = new Scanner(System.in);

	public void read(){

		System.out.println("Enter the number of elements in the array");
		n=sc.nextInt();
		a=new int[n];

		System.out.println("Enter the elements of the array");

		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("The array is");
		
		for(int i=0;i<n;i++){
			System.out.print(a[i]+"\t");
		}


	}
	public void search(){
		System.out.println("Enter the element to search");
		key=sc.nextInt();

		for(int i=0;i<n;i++){
			if(a[i]==key){
				System.out.println("The element is found at position: "+i);	
			}
		}

	}

	public void sort(){
		for(int i=0;i<n-1;i++){

			for(int j=0;j<n-i-1;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

		System.out.println("The sorted array is");

		for(int i=0;i<n;i++){
			System.out.print(a[i]+"\t");
		}
		

	}

	public static void main(String args[]){
		P4 obj = new P4();
        	int ch;

        	do {
            	System.out.println("\nEnter your choice:");
            	System.out.println("1. Read elements");
            	System.out.println("2. Search");
            	System.out.println("3. Sort");
            	System.out.println("4. Exit");

            	ch = obj.sc.nextInt();

           	 switch (ch) {
               	 	case 1:
                    	 obj.read();
                    	 break;
                	case 2:
                    	 obj.search();
                    	 break;
               		case 3:
                   	 obj.sort();
                    	 break;
                	case 4:
                    	 System.out.println("Exiting...");
                         break;
                	default:
                    	  System.out.println("Invalid choice");
            		}

       	 	} while (ch != 4);
		
	}

}