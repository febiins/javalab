import java.util.Scanner;

class Search extends Thread {

    int start, end, key;
    int[] arr;

    public Search(int[] arr, int start, int end, int key) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.key = key;
    }

    public void run() {
        for (int i = start; i < end && i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position " + i);
            }
        }
    }
}

public class P28 {

    public static void main(String args[]) {

        int n, size, key, index;
        int[] arr;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of the array");
        n = sc.nextInt();

        arr = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
	System.out.println("Enter the element to search");
        key = sc.nextInt();

        size = n / 5;
        index = 0;

        for (int i = 0; i < 5; i++) {
	    int end;
            if(i==4){
	      end = n;
	    }else{
		end = index + size;
	     }
            Search obj = new Search(arr, index, end, key);
            obj.start();
            index = end;
        }
    }
}
