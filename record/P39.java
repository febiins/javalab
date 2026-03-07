package record;

/*
Program to implement StringBuffer class.

@Febin Sunny
Roll No:27
  
 */

import java.util.Scanner;

public class P39 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial string: ");
        String input = sc.nextLine();

        StringBuffer sb = new StringBuffer(input);
        int choice;

        do {
            System.out.println("\n----- STRINGBUFFER MENU -----");
            System.out.println("1. Append");
            System.out.println("2. Insert");
            System.out.println("3. Replace");
            System.out.println("4. Delete");
            System.out.println("5. Reverse");
            System.out.println("6. Length");
            System.out.println("7. Capacity");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter string to append: ");
                    String appendStr = sc.nextLine();
                    sb.append(appendStr);
                    System.out.println("Updated String: " + sb);
                    break;

                case 2:
                    System.out.print("Enter position to insert: ");
                    int pos = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter string to insert: ");
                    String insertStr = sc.nextLine();
                    sb.insert(pos, insertStr);
                    System.out.println("Updated String: " + sb);
                    break;

                case 3:
                    System.out.print("Enter start index: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end index: ");
                    int end = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter replacement string: ");
                    String rep = sc.nextLine();
                    sb.replace(start, end, rep);
                    System.out.println("Updated String: " + sb);
                    break;

                case 4:
                    System.out.print("Enter start index: ");
                    int dstart = sc.nextInt();
                    System.out.print("Enter end index: ");
                    int dend = sc.nextInt();
                    sb.delete(dstart, dend);
                    System.out.println("Updated String: " + sb);
                    break;

                case 5:
                    sb.reverse();
                    System.out.println("Reversed String: " + sb);
                    break;

                case 6:
                    System.out.println("Length: " + sb.length());
                    break;

                case 7:
                    System.out.println("Capacity: " + sb.capacity());
                    break;

                case 8:
                    System.out.println("Exit...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 8);

        
    }
}
