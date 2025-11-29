import java.util.*;

class Complex{

	int real,imaginary;
	Scanner sc = new Scanner(System.in);

	public void read(){
		real=sc.nextInt();
		imaginary=sc.nextInt();	
	}

	public Complex add( Complex t){

		Complex c;
		c= new Complex();
		
		c.real=this.real + t.real;
		c.imaginary=this.imaginary + t.imaginary;
		return c;

	}

	public Complex mul(Complex t){

		Complex c;
		c=new Complex();
		

		c.real= this.real * t.real + this.real * t.imaginary;
		c.imaginary=this.imaginary * t.real + this. imaginary * t.imaginary; 
		return c;
	}

	
	public void disp(){

		System.out.println(real+"+"+imaginary+"i");
	}

	public void disp2(){
		System.out.println(real+"+"+imaginary+"i^2");


	}

}



public class P12{

	public static void main(String args[]){
		Complex obj,obj2,ad,ml; 
		obj = new Complex();
		obj2 = new Complex();
		System.out.println("Enter the first real and imaginary number");
		obj.read();
		obj.disp();

		System.out.println("Enter the second real and imaginary number");
		obj2.read();
		obj2.disp();

		ad=obj.add(obj2);
		System.out.println("Result of addtion is");
		ad.disp();
		
		ml=obj.mul(obj2);
		System.out.println("Result of multiplication is");
		ml.disp2();

	}

}