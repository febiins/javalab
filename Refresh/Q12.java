public class Q12 {

     void findSum(int n) {
        int sum = 0;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
                fact *= i;
		sum += i / fact;       
 	}

        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
              new Q12().findSum(5);     
	}
}
