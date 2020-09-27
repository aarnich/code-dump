public class powerfunc {
    public int power(int base, int exponent) {
        int ans = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                ans *= base;
            }
            base *= base;
            exponent /= 2;
        }
        return ans;
    }
}