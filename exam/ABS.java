package exam;


abstract class Demo{
    abstract public void method1();
    public void show(){
        System.out.println("Function inside abstract class demo");
    }
    public void print(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}

class Show extends Demo{
    public void method1(){
        System.out.println("Abstract function used in this class");
        show();
        print(5);
    }
}
public class ABS {

    public static void main(String[] args) {
        new Show().method1();
    }
}
