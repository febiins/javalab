import java.util.*;


class Person{

	int age;
	String name;
	
	public void read(){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name and age");
		name=sc.nextLine();
		age=sc.nextInt();
	}

	public void dispPerson(){

		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}


}

class Teacher extends Person{

	String subj;

	public void readTeacher(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the subject ");
		subj=sc.nextLine();
	}
	public void dispTeacher(){

		System.out.println("Subject:"+subj);
		
	}

}


public class MPT{

	public static void  main(String args[]){

		Person p=new Person();
		Teacher t = new Teacher();
		
		p.read();
		t.read();
		t.readTeacher();
		p.dispPerson();
		t.dispPerson();
		t.dispTeacher();
	}
}
