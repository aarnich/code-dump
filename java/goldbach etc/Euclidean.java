
public class Euclidean {
    public static int FindGCD(int bigger, int smaller) {
        if (bigger == 0 || smaller == 0)
            return 1;
        if (bigger < smaller) {
            int temp = bigger;
            bigger = smaller;
            smaller = temp;
        }
        int remainder = bigger % smaller;
        if (remainder == 0)
            return smaller;
        else
            return FindGCD(smaller, remainder);
    }

    public static void main(String[] args) {
        System.out.println("GCD: " + FindGCD(21000, 545));
    }
}
