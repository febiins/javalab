import java.util.*;

class UserValidation extends Exception{
	String err;
	public UserValidation(String s){
		err=s;
	}
	public String show(){
		return err;
	}
}


class Validation{

	String username="febin";
	String uname;
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	public void oper(){
		System.out.println("Enter the username");
		uname=sc.nextLine();
		try{
			if(uname.equals(username)){
				System.out.println("Enter two number for operations");
				a=sc.nextInt();
				b=sc.nextInt();
				c=a+b;
				System.out.println(c);
			}else{
				throw new UserValidation("Username is invalid");
			}
		}catch(UserValidation e){
			System.out.println(e.show());
		}
	}
}

public class UValidation{

	public static void main(String args[]){
		Validation obj = new Validation();
		obj.oper();
	}
}