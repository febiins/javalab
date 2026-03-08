package exam;
//implementing runtime polymorphishm using interfaces.
//compile and run three time.
//first time commenting the second memory allocation
//second time commenting the first memory allocation
//third run without commenting 

interface Animal{
    public void show();
}

class Dog implements Animal{
    public void show(){
        System.out.println("Dog barks...");
    }
}

class Lion implements Animal{
    public void show(){
        System.out.println("Lion roars...");
    }
}
public class Runtimepolymorphism {
    public static void main(String args[]){
        Animal obj;
        obj=new Dog();
        obj.show();
        obj=new Lion();
        obj.show();
    }
    
}
