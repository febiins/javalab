/*
Create an interface ishape having two prototypes draw and mov, create two classes
circle and rectangle which implements the above interface. In the main function only
a reference object of ishape is created, depends on the choice entered by the user , it
points to the respective memory location.

@Febin Sunny
 Roll No: 27
 17-11-2025

*/

import java.util.*;

interface IShape{

	public void draw();
	public void move();
}


class Circle implements IShape{

	public void draw(){

		System.out.println("Circle is drawing");
	}

	public void move(){

		System.out.println("Circle is moving");
	}
}

class Rectangle implements IShape{

	public void draw(){

		System.out.println("Rectangle is drawing");
	}

	public void move(){

		System.out.println("Rectangle is moving");
	}
}

public class P20{

	public static void main(String args[]){

			IShape obj=null;
			int choice;
			Scanner sc = new Scanner(System.in);
			do {
            			System.out.println("1. Circle");
            			System.out.println("2. Rectangle");
            			System.out.println("3. Exit");
            			System.out.print("Enter your choice: ");

           			 choice = sc.nextInt();

            			switch (choice) {
                			case 1:
                  	  			obj = new Circle();
                   				 break;

                			case 2:
                   				obj = new Rectangle();
                    				break;

                			case 3:
                    				System.out.println("Exiting...");
						obj = null; 
                    				break;

                			default:
                    				System.out.println("Invalid option");
                    				obj = null;
            			}

           			 if (obj != null) {
                			obj.draw();
                			obj.move();
           			 }

        		} while (choice != 3);
	}
}
