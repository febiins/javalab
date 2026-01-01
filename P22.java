/*
Write a program to implement a user-defined Exception.
@Febin Sunny
 Roll No: 27
 17-11-2025

*/
import  java.util.*;

class UserDefined extends Exception{

	public UserDefined(String msg){
		super(msg);
	}

}


class IUserDefined {

	String username = "febin";
	String uname;
	public void validate(){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter your username");
			uname = sc.nextLine();
		
			if(uname.equals(username)){
				int a,b;
				a=5;
				b=10;
				System.out.println("Sum  is : "+ (a+b));
			}else{
				throw new UserDefined("Username is invalid");
			}
		}catch(UserDefined e){

			System.out.println("Error : " + e.getMessage());
		}
	}
}

public class P22{

	public static void main(String args[]){
		IUserDefined obj = new IUserDefined();
		obj.validate();
		
	}
}