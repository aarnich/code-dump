package varargs;

import java.util.stream.IntStream;

public class DisplayContents {
    public static void displayContents(double... x) {
        for (double num : x) {

            System.out.println(
                    num + " at index: " + IntStream.range(0, x.length).filter(i -> x[i] == num).findFirst().orElse(-1));
        }
    }

    public static void displayContents(int... x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + "at index: " + i);
        }
    }

    public static void displayContents(float... x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}
