import java.util.*;

class Password extends Exception{

	String err;
	
	public Password(String s){
		err=s;
	}

	public String show(){
		return err;
	}
}

class PCreation{

	String passw;
	Scanner sc = new Scanner(System.in);
	public void readvalidate(){
		 boolean hasUpper = false;
           	 boolean hasLower = false;
            	 boolean hasDigit = false;
           	 boolean hasSpecial = false;
		System.out.println("Enter your password");
		try{
			passw=sc.nextLine();
			for(int i=0;i<passw.length()-1;i++){
				if(passw.charAt(i)==passw.charAt(i+1)){
					throw new Password("Consicutive repition is not allowed");
				}
			}
			if(passw.length()<8){
				throw new Password("Atleast 8 charaters is needed");
			}
			for(int i=0;i<passw.length();i++){

				char c = passw.charAt(i);
				if(Character.isUpperCase(c)){
					hasUpper = true;
				}else if(Character.isLowerCase(c)){
					hasLower = true;
				}else if(Character.isDigit(c)){
					hasDigit = true;
				}else{
					hasSpecial = true;
				}
			}
			 if (!hasUpper || !hasLower || !hasDigit || !hasSpecial) {
                		throw new Password("Password must contain uppercase, lowercase, digit and special character");
            		}
	
		}catch(Password e){
		System.out.println("Error :"+ e.show());
	}
	

}

}

public class Create{

	public static void main(String args[]){

		PCreation obj = new PCreation();
		obj.readvalidate();
	}
}