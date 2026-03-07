package exam;

class Engine{
    public void start(){
        System.out.println("Engine has started");
    }
}
class Car{
    Engine obj;
    public Car(Engine e){
        obj=e;
    }
    public void move(){
        obj.start();
        System.out.println("Car is moving");
    }
}
public class HASA {
    public static void main(String[] args) {
        Engine ee = new Engine();
        Car obj= new Car(ee);
        obj.move();
    }
    
}
