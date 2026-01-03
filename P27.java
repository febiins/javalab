/*
Write a Java program to create two threads, one to display odd numbers and another
to display even numbers up to N.
@Febin Sunny
 Roll No: 27
 17-11-2025
*/

import java.util.Scanner;

class Odd extends Thread{
    int n;
    public Odd(int n){
        this.n = n;
    }
    public void run(){
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println("Odd: "+i);
            }
        }
    }
}

class Even extends Thread{
    int n;
    public Even(int n){
        this.n = n;
    }
    public void run(){
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println("Even: "+i);
            }
        }
    }
}



public class P27 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your limit");
        n=sc.nextInt();

        Odd obj1 = new Odd(n);
        Even obj2 = new Even(n);
        
        obj1.start();
        obj2.start();
        
    }    
}
