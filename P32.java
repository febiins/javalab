
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
class SharedMemory{

	int data;
	boolean f = false;
	public synchronized void write(int a){
        while(f){
            try {
                wait();
            } catch (Exception e) {}
        }
			data = a;
			System.out.println("WRITE :"+data);
			f = true;
			notifyAll();
		
	}


public  synchronized void read(){
    while(!f){
        try{
            wait();
        }catch(Exception e){}
    }
	    System.out.println("READ :"+data);
		f = false;
		notifyAll();
	
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

class Writer extends Thread{
    SharedMemory sm;
    public Writer(SharedMemory sm){
        this.sm=sm;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            sm.write(i);
        }
    }
}

class Reader extends Thread{
    SharedMemory sm;
    public Reader(SharedMemory sm){
        this.sm=sm;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            sm.read();
        }
    }
}
public class P32 {
    public static void main(String[] args) {
        Buffer obj = new Buffer();
        SharedMemory sm = new SharedMemory();
        Producer p = new Producer(obj);
        Consumer c = new Consumer(obj);
        Reader r = new Reader(sm);
        Writer w = new Writer(sm);

        p.start();
        c.start();
        w.start();
        r.start();
    }
    
}
