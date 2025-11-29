import java.util.*;


class CString{

	String s1;
	Scanner sc = new Scanner(System.in);
	public void read(){
		s1=sc.nextLine();

	} 

	public void disp(){
		System.out.println(s1);
	}

	public boolean compare(CString c){
		
		return this.s1.equals(c.s1);
	}

	public CString join(CString c){

		CString temp = new CString();
		temp.s1 = this.s1 + c.s1;
		return temp;
	}

	public int add(CString c) {
        int num1 = Integer.parseInt(this.s1);
        int num2 = Integer.parseInt(c.s1);
        return num1 + num2;
    }


}




public class P13{

	public static void main(String args[]){

		CString obj1 = new CString();
		CString obj2 = new CString();
		CString obj3;
		System.out.println("Read first string:");
		obj1.read();
		System.out.println("First string: ");
		obj1.disp();

		System.out.println("Read second string:");
		obj2.read();
		System.out.println("Second string: ");
		obj2.disp();

		boolean a=obj1.compare(obj2);
		
		if(a){
			System.out.println("Strings are equal");	
		}else{

			System.out.println("Strings are not equal");
		}

		obj3=obj1.join(obj2);
		System.out.print("Concatenated string: ");
		obj3.disp();

		try {
           	 System.out.println("\nAddition of numeric values: " + obj1.add(obj2));
       		} catch (Exception e) {
           		System.out.println("\nCannot perform addition — Strings are not numeric");
       		   }
		

	}

}