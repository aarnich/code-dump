package varargs;

import java.util.stream.IntStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double[] temperature = { 33.1, 55.1, 44.1, 631.2, 4123.1 };
        DisplayContents.displayContents(4123.1, 33.1);
        DisplayContents.displayContents(temperature);
        ArrayList<Integer> numCollect = new ArrayList<Integer>();
        IntStream.range(0, 100);
    }

}