import java.util.*;

class SortingMethods{

	public int bubblesort(int[] a){
		int count=0,temp;
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-i-1;j++){
				count++;
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;	
				}
			}		
		}
		return count;
	}
	public int insertionsort(int[] a) {
        int count = 0;
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0) {
                count++; 
                if (a[j] > key) {
                    a[j + 1] = a[j];
                    j--;
                } else {
                    break;
                }
            }
            a[j + 1] = key;
        }
        return count;
    }
    public int selectionsort(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                count++; // comparison counted
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        return count;
    }
}





public class Sorting{
	public static void main(String args[]){
		int[] best = {1, 2, 3, 4, 5};
        	int[] avg = {5, 2, 4, 1, 3};
        	int[] worst = {5, 4, 3, 2, 1};
		SortingMethods obj = new SortingMethods();
		System.out.println("Bubble Sort");
		System.out.println("-------------------------");
		System.out.println("Best case:"+obj.bubblesort(best.clone()));
		System.out.println("Average case:"+obj.bubblesort(avg.clone()));
		System.out.println("Worst case:"+obj.bubblesort(worst.clone()));
		System.out.println("-------------------------");
		System.out.println("Insertion Sort");
		System.out.println("-------------------------");
		System.out.println("Best case:"+obj.insertionsort(best.clone()));
		System.out.println("Average case:"+obj.insertionsort(avg.clone()));
		System.out.println("Worst case:"+obj.insertionsort(worst.clone()));
		System.out.println("-------------------------");
		System.out.println("Selection Sort");
		System.out.println("-------------------------");
		System.out.println("Best case:"+obj.selectionsort(best.clone()));
		System.out.println("Average case:"+obj.selectionsort(avg.clone()));
		System.out.println("Worst case:"+obj.selectionsort(worst.clone()));
		System.out.println("-------------------------");
	}
}