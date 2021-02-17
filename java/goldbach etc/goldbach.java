
import java.util.HashMap;
import java.util.Scanner;

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
        long GoldBachLimit = Long.parseLong(kb.nextLine());
        String save = kb.next();
        BachPairs = BachPairGenerator.PrimePairs((GoldBachLimit));
        // File Generation for Goldbach Pairs and Goldbach N
        System.out.println("Encoding Prime Pairs...");
        String FileName = "GoldbachProofsFor" + GoldBachLimit;
        newFile.NewFile(FileName);
        newFile.WriteToFile(GoldBachLimit, FileName, BachPairs);
        System.out.println(save);
        Boolean doSave = true;
        SQLDatabaseConnection saver = new SQLDatabaseConnection();
        saver.SQLConnect(GoldBachLimit, BachPairs);
        System.out.println("Saved to database: iACADEMY, table: GoldbachDataset");
        kb.close();
        System.out.println(doSave);
    }
}
