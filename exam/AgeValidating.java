package exam;
//user defined exception hadleling 

class UserDefinedException extends Exception{
    public UserDefinedException(String msg){
        super(msg);
    }
}

class Age{
    int a;
    public Age(int a){
        this.a=a;
    }
    public void verify(){
        try{
            if(a<18){
                throw new UserDefinedException("Invlaid age");
            }
            else{
                System.out.println("Valid age");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
}
public class AgeValidating {
    public static void main(String[] args) {
        Age  obj = new Age(17);
        obj.verify();
    }
}
