/*
Develop a program to compute square and cube of a given number using two
separate threads.
@Febin Sunny
 Roll No: 27
 17-11-2025
*/

import java.util.Scanner;

class Power extends Thread{
    int n;
    String type;
    public Power(int n , String type){
        this.n = n;
        this.type = type;
    }

    public void run(){
        if(type.equals("square")){
            int c = n * n;
            System.out.println("Square of "+ n + " is: "+c);
        }else if(type.equals("cube")){
            int d = n * n * n;
            System.out.println("Cube of "+ n + " is: "+d);
        }
    }
}



public class P29 {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        n = sc.nextInt();

        Power p1 = new Power(n, "square");
        Power p2 = new Power(n, "cube");

        p1.start();
        p2.start();
    }    
}
