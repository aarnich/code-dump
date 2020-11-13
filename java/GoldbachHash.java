import java.util.Scanner;
import java.util.HashMap;

public class GoldbachHash {
    public HashMap<Long, Long> PrimePairs(long n) {
        primality checker = new primality();
        HashMap<Long, Long> Pairs = new HashMap<Long, Long>();
        int x = 2;
        Scanner kb = new Scanner(System.in);
        while (x == 2) {
            if (n % 2 == 1 || n < 2) {
                System.out.println("Please enter an even integer greater than 2: ");
                n = kb.nextLong();
            } else
                x = 1;
            kb.close();
        }
        for (long i = 2; i <= n; i++) {
            if (checker.MillerRabin(i)) {
                // Primes.add(i);
                System.out.println("UPDATE: Adding " + i);
                long ValueToBeChecked = i;
                if (!(Pairs.containsKey(ValueToBeChecked)) && !(Pairs.containsValue(ValueToBeChecked))) {
                    long PotentialPrime = n - ValueToBeChecked;
                    if (checker.MillerRabin(PotentialPrime)) {
                        Pairs.put(ValueToBeChecked, PotentialPrime);
                    }
                }

                // for (int i = 0; i < Primes.size(); i++) {
            }
        }
        // }
        return Pairs;

    }
}
