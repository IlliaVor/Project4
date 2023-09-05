package Part2SimpleDialog;

import java.util.Scanner;

public class part2simpledialog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello!");
        while (true) {
            System.out.print("Please,write down something you want to share. ");
            String userinput = in.nextLine();
            String uppercasedInput = userinput.toUpperCase();
            System.out.println("Uppercased string: " + uppercasedInput);

            System.out.print("Do you want to continue? (Y/N): ");
            String continueInput = in.nextLine();

            if (!continueInput.equalsIgnoreCase("Y")) {
                break;
            }
        }

        in.close();


    }
}
