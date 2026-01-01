/*
Create a class for an employee having eno, ename and esal as data members. Provide
functions for reading, displaying, and comparing by eno. Accept n employees'
information in the main function, display the same, and search for an employee whose
eno is given.

 @Febin Sunny
  Roll No: 27
  17-11-2025

*/
import java.util.*;

class Employee{

	int eno,esal;
	String ename;
	Scanner sc = new Scanner(System.in);

	public void read(){
		System.out.println("Enter your employee number");
		eno=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter your employee name");
		ename=sc.nextLine();

		System.out.println("Enter your employee salary");
		esal=sc.nextInt();
		
	}

	public void display(){
		System.out.println(eno + "\t" + ename + "\t" + esal);
	}

	public boolean compare(int no){
		return eno == no;
	}
}

public class P18{

	public static void main(String args[]){
		int n,key;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of empoyees");
		n=sc.nextInt();
		Employee [] obj = new Employee[n];

		for(int i=0;i<n;i++){

			obj[i] = new Employee();
			System.out.println("\nEnter details of employee " + (i + 1));
			obj[i].read();
		}

		System.out.println("Enter the empoyee number to search");
		key = sc.nextInt();
		
		boolean found = false;

		for(int i =0;i<n;i++){
			if(obj[i].compare(key)){
				System.out.println("\nEmployee Found:");
                		System.out.println("Eno\tEname\tEsal");
				obj[i].display();
				found = true;
				break;
			}

	        }

		if(!found){
			System.out.println("Employee is not found");
		}
	}
}