package coprimes;

public class CoprimeAlgorithm {

    public static Boolean IsCoprime(int num1, int num2) {
        if (FindGCD(num1, num2) == 1) {
            System.out.println(num1 + " and " + num2 + " are COPRIMES! YOU GET A COOKIE!");
            return true;
        } else
            System.out.println(num1 + " and " + num2 + " are NOT coprimes, go home and cry");
        return false;
    }

    public static void IsCoprimeRange(int starting, int ending) {
        System.out.println("Coprime pairs from " + starting + " and " + ending);
        int PairCount = (ending - starting) + 1;
        if (PairCount < 1) {
            System.out.println("Unfortunately, the range does not have coprime pairs :(");
        }
        System.out.println("Pair count: " + PairCount);
        System.out.println("Here are your coprime pairs! ");
        for (int i = starting; i <= ending; i++) {
            for (int j = starting; j <= ending; j++) {
                if (FindGCD(i, j) == 1) {
                    System.out.println(String.format("(%1$d, %2$d)", i, j));
                }
            }
        }
    }

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
}