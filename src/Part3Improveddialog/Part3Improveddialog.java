package Part3Improveddialog;

import java.util.Scanner;

public class Part3Improveddialog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hey!");

        while (true) {
            System.out.println("Please,write down something you want to share.");
            String userinput = in.nextLine();
            String reversedstring = "";
            for (int num = userinput.length() - 1; num >= 0; num--) {
                reversedstring += userinput.charAt(num);
            }

            System.out.println("Reversed string: " + reversedstring);

            System.out.print("Do you want to continue? (Y/N): ");
            String continueInput = in.nextLine();

            if (!continueInput.equalsIgnoreCase("Y")) {
                break;
            }
        }

        in.close();
    }

}

