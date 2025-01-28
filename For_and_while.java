//Code for the checking situation of the number is prime or not
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " "); // Use print instead of println for space-separated output
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) { // Check divisors up to sqrt(n)
            if (n % i == 0) {
                return false;
            }
        }
        return true; // Moved outside the loop
    }
}




//Code for the number to be the even divisor is apply or not
import java.util.Scanner;

public class EvenDigitDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int evenCount = 0;
        int temp = N;

        // Count the even digits in N
        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 == 0) {
                evenCount++;
            }
            temp /= 10;
        }

        if (evenCount == 0) {
            System.out.println("There are no even digits in the number.");
        } else if (N % evenCount == 0) {
            System.out.println("It is a divisor of the original number.");
        } else {
            System.out.println("It is not a divisor of the original number.");
        }
    }
}
//Simple code for checking the number is prime or not is above
