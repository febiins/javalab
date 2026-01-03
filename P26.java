/*
Write a Java program to create threads using the Runnable interface.
@Febin Sunny
 Roll No: 27
 17-11-2025
*/

class NewThread implements Runnable{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
}



public class P26 {
    public static void main(String[] args) {
        NewThread obj1 = new NewThread();
        NewThread obj2 = new NewThread();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
    
}
