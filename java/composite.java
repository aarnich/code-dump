public class composite {
    public Boolean isComposite(long base, long exponent, long mod, long s) {
        binaryExponentiation binpow = new binaryExponentiation();
        long x = binpow.binExpModul(exponent, mod, base);
        if (x == 1 || x == base - 1) {
            // System.out.println("not composite");
            return false;
        }
        for (long i = 1; i < s; i++) {
            x = x * x % base;
            if (x == base - 1) {
                // System.out.println("not composite");
                return false;
            }
        }
        // System.out.println("composite");
        return true;
    }

}
