import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secret = 27;     // secret number between 20 and 30
        int guess;
        int attempts = 0;

        do {
            System.out.print("Guess a number between 20 and 30: ");
            guess = sc.nextInt();
            attempts++;

        } while (guess != secret);

        System.out.println("Correct! You guessed it in " + attempts + " attempts.");
    }
}
