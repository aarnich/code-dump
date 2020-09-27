
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

class goldbach {
    public static void main(final String[] args) {
        // Declaration of Hashmap used to acquire Goldbach Pairs
        HashMap<Long, Long> BachPairs = new HashMap<Long, Long>();
        GoldbachHash BachPairGenerator = new GoldbachHash();
        System.out.println("Input GoldBach Limit: ");
        Scanner kb = new Scanner(System.in);
        // Class to create txt files that store Goldbach Pairs
        CreateFile newFile = new CreateFile();
        // Assignment of Goldbach limit
        long GoldBachLimit = kb.nextLong();
        BachPairs = BachPairGenerator.PrimePairs(GoldBachLimit);
        kb.close();
        // File Generation for Goldbach Pairs and Goldbach N
        System.out.println("Encoding Prime Pairs...");
        String FileName = "GoldbachProofsFor" + GoldBachLimit;
        newFile.NewFile(FileName);
        newFile.WriteToFile(GoldBachLimit, FileName, BachPairs);
    }
}