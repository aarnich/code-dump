public class primality {
    Boolean MillerRabin(long n) {
        composite checker = new composite();
        long iterator = 5;
        if (n < 4)
            switch ((int) n) {
                case 1:
                    return false;
                case 2:
                case 3:
                    return true;
            }
        long s = 0;
        long d = n - 1;
        while ((d & 1) == 0) {
            d >>= 1;
            s++;
        }
        for (long i = 0; i < iterator; i++) {
            long a = 2 + ((long) Math.random() % (n - 3));
            if (checker.isComposite(n, a, d, s))
                return false;
        }
        return true;
    }
}
