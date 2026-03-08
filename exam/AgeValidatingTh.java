package exam;
//user defined exception hadleling using throws

class UDE extends Exception{
    public UDE(String msg){
        super(msg);
    }
}

class Ages{
    int a;
    public Ages(int a){
        this.a=a;
    }
    public void verify() throws UDE {
       
            if(a<18){
                throw new UDE("Invlaid age");
            }
            else{
                System.out.println("Valid age");
            }
    }
    
    
}

public class AgeValidatingTh {
    public static void main(String[] args) {
        try {
            Ages  obj = new Ages(17);
            obj.verify();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
