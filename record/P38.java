package record;
/*
Write a program to create a menu driven program for performing the following
operations.
a. Length of a given string
b. Compare for equality
c. Extract a substring from a string.
d. Convert to uppercase and lowercase
e. Reverse a string

@Febin Sunny
Roll No:27
  
 */


import java.util.Scanner;

public class P38 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- STRING OPERATIONS MENU -----");
            System.out.println("1. Length of a string");
            System.out.println("2. Compare two strings");
            System.out.println("3. Extract substring");
            System.out.println("4. Convert to Uppercase and Lowercase");
            System.out.println("5. Reverse a string");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter a string: ");
                    String str1 = sc.nextLine();
                    System.out.println("Length = " + str1.length());
                    break;

                case 2:
                    System.out.print("Enter first string: ");
                    String s1 = sc.nextLine();
                    System.out.print("Enter second string: ");
                    String s2 = sc.nextLine();

                    if (s1.equals(s2))
                        System.out.println("Strings are equal.");
                    else
                        System.out.println("Strings are not equal.");
                    break;

                case 3:
                    System.out.print("Enter a string: ");
                    String str2 = sc.nextLine();
                    System.out.print("Enter start index: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end index: ");
                    int end = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Substring = " + str2.substring(start, end));
                    break;

                case 4:
                    System.out.print("Enter a string: ");
                    String str3 = sc.nextLine();
                    System.out.println("Uppercase = " + str3.toUpperCase());
                    System.out.println("Lowercase = " + str3.toLowerCase());
                    break;

                case 5:
                    System.out.print("Enter a string: ");
                    String str4 = sc.nextLine();
                    String reverse = "";

                    for (int i = str4.length() - 1; i >= 0; i--) {
                        reverse += str4.charAt(i);
                    }

                    System.out.println("Reversed String = " + reverse);
                    break;

                case 6:
                    System.out.println("Exit...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        
    }
    
}
