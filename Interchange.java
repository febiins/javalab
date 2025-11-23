

class Logic{
	int temp,a,b;
	void logic1(int a,int b){
		
		this.a=a;
		this.b=b;
		
		System.out.println("a before swapping is"+a);
		System.out.println("b before swapping is"+b);
	
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("a after swapping is"+a);
		System.out.println("b after swapping is"+b);

		
	}

	void logic2(int a,int b){
		
		this.a=a;
		this.b=b;
		
		System.out.println("a before swapping is"+a);
		System.out.println("b before swapping is"+b);
	
		temp=a+b;
		a=temp-a;
		b=temp;
		
		System.out.println("a after swapping is"+a);
		System.out.println("b after swapping is"+b);

		
	}

	void logic3(int a,int b){
		
		this.a=a;
		this.b=b;
		
		System.out.println("a before swapping is"+a);
		System.out.println("b before swapping is"+b);
	
		temp=a*b;
		a=temp/a;
		b=temp/b;
		
		System.out.println("a after swapping is"+a);
		System.out.println("b after swapping is"+b);

		
	}
}

public class Interchange{

	public static void main(String args[]){
		Logic obj =new Logic();
		obj.logic1(2,3);
		obj.logic2(2,3);
		obj.logic3(2,3);
	}
}