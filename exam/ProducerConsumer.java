package exam;
//Buffer is the shared memory
//empty=false the buffer is empty else it is filled
//producer waits if the buffer is not empty 
//consumer wait if the buffer is empty
import java.util.*;
import java.io.*;

class Buffer{
    int item;
    boolean empty=false;

    synchronized public void produce(int a){
        while(empty){
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        item=a;
        empty=true;
        System.out.println("Produced :"+item);
        notify();
    }

    synchronized public void consume(){
        while(!empty){
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Consumed :"+item);
        empty=false;
        notify();
    }
}

class Producer extends Thread{
    Buffer b;
    public Producer(Buffer b){
        this.b=b;
    }
    public void run(){
        try {
            for(int i=1;i<=5;i++){
                b.produce(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Consumer extends Thread{
    Buffer b;
    public Consumer(Buffer b){
        this.b=b;
    }
    public void run(){
        try {
            for(int i=1;i<=5;i++){
                b.consume();
            }
        } catch (Exception e) {
           System.out.println(e);
        }
    }

}
public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer b = new Buffer();
        Producer p = new Producer(b);
        Consumer c =  new Consumer(b);
        p.start();
        c.start();
    }
}
