import java.util.*;

class SortingMethods {

    // ---------- Bubble Sort ----------
    public int[] bubblesort(int[] a) {
        int outer = 0, inner = 0, temp;
        for (int i = 0; i < a.length - 1; i++) {
            outer++;
            for (int j = 0; j < a.length - i - 1; j++) {
                inner++;
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return new int[]{outer, inner};
    }

    // ---------- Insertion Sort ----------
    public int[] insertionsort(int[] a) {
        int outer = 0, inner = 0;
        for (int i = 1; i < a.length; i++) {
            outer++;
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                inner++;
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
        return new int[]{outer, inner};
    }

    // ---------- Selection Sort ----------
    public int[] selectionsort(int[] a) {
        int outer = 0, inner = 0;
        for (int i = 0; i < a.length - 1; i++) {
            outer++;
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                inner++;
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        return new int[]{outer, inner};
    }
}

public class Sorting {
    public static void main(String args[]) {

        int[] best = {1, 2, 3, 4, 5};
        int[] avg = {5, 2, 4, 1, 3};
        int[] worst = {5, 4, 3, 2, 1};

        SortingMethods obj = new SortingMethods();

        System.out.println("BUBBLE SORT");
        display(obj.bubblesort(best.clone()), "Best");
        display(obj.bubblesort(avg.clone()), "Average");
        display(obj.bubblesort(worst.clone()), "Worst");

        System.out.println("\nINSERTION SORT");
        display(obj.insertionsort(best.clone()), "Best");
        display(obj.insertionsort(avg.clone()), "Average");
        display(obj.insertionsort(worst.clone()), "Worst");

        System.out.println("\nSELECTION SORT");
        display(obj.selectionsort(best.clone()), "Best");
        display(obj.selectionsort(avg.clone()), "Average");
        display(obj.selectionsort(worst.clone()), "Worst");
    }

    static void display(int[] c, String type) {
        System.out.println(type + " Case -> Outer Loop: " + c[0] + ", Inner Loop: " + c[1]);
    }
}
