package coprimes;

import coprimes.CoprimeAlgorithm;

import java.util.Scanner;

public class UI {
    public static void InputHandler(int input) {
        Scanner kb2 = new Scanner(System.in);
        switch (input) {
            case 4:
                clearScreen();
                DisplayUI();
            case 5:
                System.out.println(
                        " +-------------------------------------------------------------------------------------------+\n"
                                + " |                                                                                           |\n"
                                + "|+    +----------------------------------------------------------------------------------+   |\n"
                                + "||   +-|                                                                                ||   |\n"
                                + "||   |-|                     THANKS FOR USING SPENDING TIME WITH US                     ||   |\n"
                                + "||   |-|                                                                                ||   |\n"
                                + "||   |-|                                SEE YOU AROUND!                                 ||   |\n"
                                + "||   |-|                                                                                ||   |\n"
                                + "||   |-----------------------------------------------------------------------------------+   |\n"
                                + "+-------------------------------------------------------------------------------------------+");
                return;
            default:
                clearScreen();
                System.out.println("Invalid input");
                int backup = kb2.nextInt();
                InputHandler(backup);
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void DisplayUI() {
        boolean valid = false;
        System.out.println(
                " +-------------------------------------------------------------------------------------------+\n"
                        + " |                                                                                           |\n"
                        + "|+    +----------------------------------------------------------------------------------+   |\n"
                        + "||   +-|                                                                                ||   |\n"
                        + "||   |-|                            Welcome to Coprime.java!                            ||   |\n"
                        + "||   |-|                                                                                ||   |\n"
                        + "||   |-|                           What would you like to do?                           ||   |\n"
                        + "||   |-|                                                                                ||   |\n"
                        + "||   |-----------------------------------------------------------------------------------+   |\n"
                        + "||   +----------------------------------------------------------------------------------+    |\n"
                        + "||                      +----------------------------------------------+                     |\n"
                        + "||                      |1. Determine whether two integers are coprimes|                     |\n"
                        + "||                      +----------------------------------------------+                     |\n"
                        + "||                      +----------------------------------------------+                     |\n"
                        + "||                      |2. Determine all coprimes from within a range |                     |\n"
                        + "||                      +----------------------------------------------+                     |\n"
                        + "||                                  +----------------------+                                 |\n"
                        + "||                                  |3. What are coprimes? |                                 |\n"
                        + "||                                  +----------------------+                                 |\n"
                        + "|| (press 4 to go back || press 5 to exit)                                                   |\n"
                        + "|--------------------------------------------------------------------------------------------+\n"
                        + "+-------------------------------------------------------------------------------------------+");
        Scanner kb = new Scanner(System.in);
        int choice = kb.nextInt();
        int num1, num2, nextChoice;
        switch (choice) {
            case 1:
                System.out.println(
                        " +-------------------------------------------------------------------------------------------+\n"
                                + " |                                                                                           |\n"
                                + "|+    +----------------------------------------------------------------------------------+   |\n"
                                + "||   +-|                                                                                ||   |\n"
                                + "||   |-|                           Are your numbers coprimes?                           ||   |\n"
                                + "||   |-|                                                                                ||   |\n"
                                + "||   |-|                                 LET'S FIND OUT                                 ||   |\n"
                                + "||   |-|                                                                                ||   |\n"
                                + "||   |-----------------------------------------------------------------------------------+   |\n"
                                + "+-------------------------------------------------------------------------------------------+");
                System.out.println("Enter two integers: ");
                num1 = kb.nextInt();
                num2 = kb.nextInt();
                CoprimeAlgorithm.IsCoprime(num1, num2);
                nextChoice = kb.nextInt();
                InputHandler(nextChoice);
                break;
            case 2:
                System.out.println(
                        " +-------------------------------------------------------------------------------------------+\n"
                                + " |                                                                                           |\n"
                                + "|+    +----------------------------------------------------------------------------------+   |\n"
                                + "||   +-|                                                                                ||   |\n"
                                + "||   |-|                        LET'S FIND ALL THE COPRIME PAIRS!                       ||   |\n"
                                + "||   |-|                                                                                ||   |\n"
                                + "||   |-|                                 LET'S FIND OUT                                 ||   |\n"
                                + "||   |-|                                                                                ||   |\n"
                                + "||   |-----------------------------------------------------------------------------------+   |\n"
                                + "+-------------------------------------------------------------------------------------------+");
                System.out.println("Enter range[X, Y]");
                num1 = kb.nextInt();
                num2 = kb.nextInt();
                CoprimeAlgorithm.IsCoprimeRange(num1, num2);
                nextChoice = kb.nextInt();
                InputHandler(nextChoice);
                break;
            case 3:
                System.out.println("In number theory, two integers a and b are said to be relatively prime /n");
                System.out.println(
                        "mutually prime, or coprime if the only positive integer that evenly divides both of them is 1.");
                nextChoice = kb.nextInt();
                InputHandler(nextChoice);
                break;
            default:
                InputHandler(choice);
        }
    }
}