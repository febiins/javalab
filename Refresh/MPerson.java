import java.util.*;

class Person{

	int age;
	String name;

	public Person(){
		name="";
		age=0;
	
	}

	public Person(String n, int a){

		name=n;
		age=a;

	}

	public void read(){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the age and name");
		name=sc.nextLine();
		age=sc.nextInt();
	}

	public void disp(){
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}

}


public class MPerson{

	public static void main(String args[]){

		Person p,q;
		p=new Person();
		q=new Person("Febin",21);
		p.disp();
		q.disp();
		p.read();
		p.disp();

	}

}