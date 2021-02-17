package ProblemSetLesson30;

public class Main {
    public static void main(String[] args) {
        int[] x = { 23, 56, 67, 89, 44, 11, 29, 78, 34, 90, 45, 88 };

        CountPrimes(x);
        System.out.println(Primality(23));
    }

    public static void LessThan50(int[] x) {
        int counter = 0;
        for (int num : x) {
            if (num > 50) {
                counter += 1;
            }
        }
        System.out.println("More than 50: " + counter);
        System.out.println("Less than or equal to 50 " + (x.length - counter));
    }

    public static void OddOrEven(int[] x) {
        int oddCount = 0;
        for (int num : x) {
            if (num % 2 == 0) {
                oddCount += 1;
            }
        }
        System.out.println("Even: " + (x.length - oddCount));
        System.out.println("Odd: " + oddCount);
    }

    public static Boolean Primality(int x) {
        int divisors = 0;
        for (int i = 1; i <= (x / 2) + 1; i++) {
            if (x % i == 0) {
                divisors += 1;
            }
        }
        if (divisors > 2) {
            return false;
        }
        return true;
    }

    public static void CountPrimes(int[] x) {
        int primeCount = 0;
        for (int num : x) {
            if (Primality(num)) {
                System.out.println("Prime: " + num);
                primeCount += 1;
            }
        }
        System.out.println("Number of primes: " + primeCount);
    }
}
