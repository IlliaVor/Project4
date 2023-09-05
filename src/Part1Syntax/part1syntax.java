package Part1Syntax;

public class part1syntax {
    public static void main(String[] args) {
        System.out.println("Hey!I'm going to demonstrate my coding skills)");

        int num = 0;

        while (num <= 10) {
            System.out.println(num + " ");
            num++;
        }
        System.out.println();
        System.out.println("Do-while loop:");
        int num2 = 10;
        do {
            System.out.print(num2 + " ");
            num2--;
        } while (num2 >= 0);
        System.out.println();


        System.out.println("for loop:");
        for (int num3 = 0; num3 <= 10; num3++) {
            System.out.print(num3 + " ");
        }
        System.out.println();
        System.out.println("Iterating through a String:");
        String text = "Java code";
        for (int index = 0; index < text.length(); index++) {
            System.out.println(text.charAt(index));
        }


        System.out.println("Demonstrating nested loops:");
        for (int num3 = 1; num3 <= 10; num3++) {
            System.out.println();
            for (int num4 = 1; num4 <= num3; num4++) {
                System.out.print("* ");

            }
        }
    }
}