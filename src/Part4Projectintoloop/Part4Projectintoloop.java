package Part4Projectintoloop;

import java.util.Scanner;

public class Part4Projectintoloop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continueConversation = true;

        while (continueConversation) {
            System.out.println("Hey, how's it going?");
            String mood = in.nextLine();

            System.out.println(mood + "." + " All right.");

            System.out.print("May I know your name? ");
            String name = in.nextLine();

            System.out.print("Hello, " + name + "! How old are you? ");
            int age = in.nextInt();

            in.nextLine();
            System.out.print("What is your favorite book genre? ");
            String genre = in.nextLine();

            String recommendation;

            if (age >= 13 && age <= 16) {
                recommendation = "Stuart Turton: 'The Seven Deaths of Evelina Hardcastle'.";
            } else if (age >= 17 && age <= 25) {
                recommendation = "'The Right Stuff' by Tom Wolf.";
            } else if (age >= 18 && age <= 35) {
                recommendation = "'Harry Potter and the Sorcerer's Stone' by J.K. Rowling.";
            } else if (age >= 30 && age <= 45) {
                recommendation = "'Gone Girl' by Gillian Flynn.";
            } else if (age >= 40 && age <= 60) {
                recommendation = "'Dune' by Frank Herbert.";
            } else if (age >= 60) {
                recommendation = "'Mind Games' by Sylvia Nazar.";
            } else {
                System.out.println("I'm sorry, I don't have a specific recommendation for your input.");
                return;
            }

            System.out.println(genre + "." + " Okay. I can also recommend you:");
            System.out.println(recommendation);

            System.out.print("Do you want to continue? (Y/N): ");
            String continueInput = in.nextLine();

            if (!continueInput.equalsIgnoreCase("Y")) {
                continueConversation = false;
            }
        }

        System.out.println("Goodbye!");
        in.close();

    }
}
