/*  . Create a class for a student having (sno, sname, sprogram) [example sno-1,sname 
sanjay,sprogram-MCA]. Provide functions for reading and displaying the same 
information. Also provide a function for comparing two student objects for equality.
   @Febin Sunny
   Roll No: 27
   30-11-2025
*/
import java.util.*;
class Student{
	int sno;
	String sname,sprogram;
	Scanner sc = new Scanner(System.in);
	public void read(){

		System.out.println("Enter the sno ");
		sno= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the sname ");
		sname= sc.nextLine();
		System.out.println("Enter the sprogram ");
		sprogram= sc.nextLine();
	}

	public void disp(){
		System.out.println("Sno : "+sno);
		System.out.println("Sname : "+sname);
		System.out.println("Sprogram : "+sprogram);
	}
	public boolean check(Student s){
		return this.sno==s.sno && this.sname.equals(s.sname) && this.sprogram.equals(s.sprogram);
	}
}

public class P14{
	public static void main(String args[]){

		Student obj1 = new Student();
		Student obj2 = new Student();
		obj1.read();
		System.out.println(" ");
		obj1.disp();
		System.out.println(" ");
		obj2.read();
		System.out.println(" ");
		obj2.disp();
		if(obj1.check(obj2)){
			System.out.println("The students are matching");
		}else{
			System.out.println("The students are not same");
		}
	}

}

