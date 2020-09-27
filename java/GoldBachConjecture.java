import java.util.Scanner;
import java.util.ArrayList;

public class GoldBachConjecture {

    public ArrayList<ArrayList<Long>> GoldbachProof(long n) {
        long x = 1;
        Scanner kb = new Scanner(System.in);
        primality checker = new primality();
        ArrayList<Long> primeNumbers = new ArrayList<Long>();
        while (x == 1) {
            if (n <= 2) {
                System.out.println("Please enter an integer greater than 2");
                n = kb.nextInt();
            } else if (n % 2 == 1) {
                System.out.println("Please enter an even integer");
                n = kb.nextInt();
            } else
                x = 2;
        }
        kb.close();
        for (long i = 1; i <= n; i++) {
            if (checker.MillerRabin(i)) {
                System.out.println("adding " + i);
                primeNumbers.add(i);
            }
        }
        ArrayList<ArrayList<Long>> PrimePairs = new ArrayList<ArrayList<Long>>();
        ArrayList<Long> Added = new ArrayList<Long>();
        Boolean duplicate = false;
        for (int j = 0; j < (primeNumbers.size() - 1); j++) {
            long num = primeNumbers.get(j);
            for (int k = 0; k < primeNumbers.size(); k++) {
                if (num + primeNumbers.get((int) k) > n) {
                    break;
                }
                // if (Added.size() >= 2) {
                // for (int iterator = 0; iterator < Added.size(); iterator++) {
                // if (num == Added.get(iterator)) {
                // duplicate = true;
                // } else {
                // duplicate = false;
                // }
                // }
                // }
                // if (!duplicate) {
                if (num + primeNumbers.get(k) == n) {
                    ArrayList<Long> ToBeAdded = new ArrayList<Long>();
                    ToBeAdded.add(num);
                    ToBeAdded.add(primeNumbers.get(k));
                    Added.add(num);
                    Added.add(primeNumbers.get(k));
                    PrimePairs.add(ToBeAdded);
                    System.out.println("Adding " + num + " " + primeNumbers.get(k));
                }
                // }
            }
        }
        return PrimePairs;
    }
}
