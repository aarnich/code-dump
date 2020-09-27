class binaryExponentiation {
    public long binExpModul(long base, long exponent, long mod) {
        long ans = 1;
        base %= mod;
        while (exponent > 0) {
            // System.out.println("Calculating...");
            if ((exponent & 1) == 1)
                ans = ans * base % mod;
            base = base * base % mod;
            exponent >>= 1;
        }
        return ans;
    }

    public long binExp(long base, long exponent) {
        long ans = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1)
                ans = ans * base;
            base = base * base;
            exponent >>= 1;
        }
        return ans;
    }
}