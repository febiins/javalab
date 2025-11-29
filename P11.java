import java.util.*;

class Operation{

	int a,b,sum;
	Scanner sc = new Scanner(System.in);
	
	public void read(){
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the second number");
		b=sc.nextInt();
		
	}

	public Operation add(){
		Operation s;
		s=new Operation();
		s.a=this.a;
		s.b=this.b;
		s.sum=s.a+s.b;
		return s;
		
	
	}

	public Operation sub(){

		Operation s;
		s= new Operation();
		s.a=this.a;
		s.b=this.b;
		s.sum=s.b-s.a;
		return s;

	}

	public Operation mul(){

		Operation s;
		s=new Operation();
		s.a=this.a;
		s.b=this.b;
		s.sum=s.a * s.b;
		return s;
	}

	public Operation div(){

		Operation s;
		s=new Operation();
		s.a=this.a;
		s.b=this.b;
		s.sum=s.a/s.b;
		return s;
	}


	public void disp(){

		System.out.print(sum);
	}

	

}



public class P11{

	public static void main(String args[]){
		Operation obj,addition,substraction,multiplication,division;
		obj= new Operation();
		obj.read();
		
		addition=obj.add();
		System.out.print("Result of addition is ");
		addition.disp();
		System.out.println();

		substraction = obj.sub();
		System.out.print("Result of substraction is ");
		substraction.disp();
		System.out.println();

		multiplication = obj.mul();
		System.out.print("Result of multiplication is ");
		multiplication.disp();
		System.out.println();

		division = obj.div();
		System.out.print("Result of division is ");
		division.disp();
		System.out.println();



	}

}
