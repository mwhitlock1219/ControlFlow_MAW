import java.util.Scanner;
import java.util.Random;

public class MainFile {
    public static void main(String[] args) {
        // // System.out.println("Hello World");

        // // AsciiChars.printNumbers();
        // // AsciiChars.printUpperCaseLetters();
        // // AsciiChars.printLowerCaseLetters();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String username = scanner.next();

        System.out.println(String.format("Hello %s", username));

        System.out.print("Do you wish to continue to the interactive portion:(yes/no)  ");
        String nextInteractivePortion = scanner.next();

        if (nextInteractivePortion.equalsIgnoreCase("yes") || (nextInteractivePortion.equalsIgnoreCase("y"))) {
            System.out.println("Please continue by answering the following questions:");
        } else {
            System.out.println("Please return later to complete the survey.");
            System.exit(0);
        }

        // Overall re-ask Questions:
        String reDoAll;
        // First time asking Questions:
        do {
            String set;
            String petName;
            int petAge;
            int luckyNumber;
            int jerseyNumber;
            int modelYear;
            String firstName;
            int randomNumber;

            do {
                System.out.print("What is the name of your favorite pet?  ");
                petName = scanner.next();

                System.out.print("What is the age of your favorite pet?  ");
                petAge = scanner.nextInt();

                System.out.print("What is your lucky number?  ");
                luckyNumber = scanner.nextInt();

                System.out.print("Do you have a favorite quarterback? (yes/no)  ");
                String favoriteQB = scanner.next();

                if (favoriteQB.equalsIgnoreCase("yes") || (favoriteQB.equalsIgnoreCase("y"))) {
                    System.out.println("What is their jersey number?  ");
                    jerseyNumber = scanner.nextInt();
                }

                System.out.print("What is the two-digit model year of your car?  ");
                modelYear = scanner.nextInt();

                System.out.print("What is the first name of the your favorite actor or actress?  ");
                firstName = scanner.next();

                System.out.print("Enter a random number between 1 and 50:  ");
                randomNumber = scanner.nextInt();

                System.out.print("Would you like to generate another set of numbers?  ");
                set = scanner.next();
            } while (set.equalsIgnoreCase("yes") || (set.equalsIgnoreCase("y")));

            // Generating Random Numbers:
            Random rand = new Random();

            int rand_int1 = rand.nextInt(75);
            int rand_int2 = rand.nextInt(65);

            // System.out.println(rand_int1);
            // System.out.println(rand_int2);

            // Magic Ball Number:
            int magicNumber = rand_int1 * luckyNumber;

            while (magicNumber > 75) {
                magicNumber = magicNumber - 75;
            }

            System.out.println("Magic Ball: " + magicNumber);

            // Lottery Numbers:
            int lotteryNum1 = 42; // - Use the value 42.
            int lotteryNum2 = petAge + modelYear; // - Use the age of their favorite pet + their car model year.
            if (lotteryNum2 > 65) {
                lotteryNum2 = lotteryNum2 - 65;
            }
            int lotteryNum3 = modelYear + luckyNumber; // - Use the two digit model year of their car and add their
                                                       // lucky
                                                       // number to it.
            if (lotteryNum3 > 65) {
                lotteryNum3 = lotteryNum3 - 65;
            }
            int lotteryNum4 = randomNumber - rand_int2; // - Use the random number between 1 and 50, subtracting one of
                                                        // the
                                                        // generated random numbers.
            if (lotteryNum4 < 1) {
                lotteryNum4 = lotteryNum4 + 65;
            }
            int lotteryNum5 = firstName.charAt(0); // - Convert the first letter of their favorite actor/actress to an
                                                   // integer and use that value.
            while (lotteryNum5 > 65) {
                lotteryNum5 = lotteryNum5 - 65;
            }
            // EXTRA Pratice
            int lotteryNum6 = petName.charAt(2); // - Find the 3rd letter of their favorite pet. Convert that character
                                                 // value to an integer value.
            while (lotteryNum6 > 65) {
                lotteryNum6 = lotteryNum6 - 65;
            }
            int lotteryNum7 = firstName.charAt(firstName.length() - 1); // - Convert the last letter of their favorate
                                                                        // actor/actress to an integer and use that
                                                                        // value.
            while (lotteryNum7 > 65) {
                lotteryNum7 = lotteryNum7 - 65;
            }
            // int lotteryNum8 = jerseyNumber + petAge + luckyNumber; // - Favorite
            // quarterback number + age of pet + lucky
            // // number.
            // while (lotteryNum7 > 65) {
            // lotteryNum7 = lotteryNum7 - 65;
            // }

            System.out.println("Lottery Numbers: " + lotteryNum1 + ", " + lotteryNum2 + ", " + lotteryNum3 + ", "
                    + lotteryNum4 + ", " + lotteryNum5);

            System.out.println("Would you like to answer questions to generate another set of numbers?  (yes/no)  ");
            reDoAll = scanner.next();
        } while (reDoAll.equalsIgnoreCase("yes") || (reDoAll.equalsIgnoreCase("y")));

        System.out.println("Thank you and Goodbye!");
        System.exit(0);

        scanner.close();
    }
}
