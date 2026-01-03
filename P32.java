
class Buffer{
    int item;
    boolean available = false;

    synchronized public void produce(int a){
        while(available){
            try{
                wait();
            }catch(Exception e){}
        }
            item = a;
            available = true;
            System.out.println("Produced: " + item);
            notify();
        
    }
    synchronized public void consume(){
        while(!available){
            try {
                wait();

            } catch (Exception e) {}
        }    

            System.out.println("Consumed: " + item);
            available = false;
            notify();
        }
    
}

class Producer extends Thread{
    Buffer b;
    public Producer(Buffer b){
        this.b = b;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            b.produce(i);
        }
    }
}

class Consumer extends Thread{
    Buffer b;
    public Consumer(Buffer b){
        this.b = b;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            b.consume();
        }
    }
}

public class P32 {
    public static void main(String[] args) {
        Buffer obj = new Buffer();
        Producer p = new Producer(obj);
        Consumer c = new Consumer(obj);

        p.start();
        c.start();
    }
    
}
