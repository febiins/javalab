/*
Write a program to implement a Generic method.
@Febin Sunny
Roll No:27
  
 */

public class P36 {
    public static <E> void print(E[] e){
        for(int i =0;i<e.length;i++){
            System.out.println(e[i]);
        }
    }
    public static void main(String[] args){
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        print(intArray);  
        System.out.println("Array doubleArray contains:");
        print(doubleArray);
        System.out.println("Array characterArray contains:");
        print(charArray);
}

    }
