/*
Implement threading by inheriting Thread class.
@Febin Sunny
 Roll No: 27
 17-11-2025
*/
class MyThread extends Thread{

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}

public class P25{
    public static void main(String args[]){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}