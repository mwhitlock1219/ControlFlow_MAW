
public class AsciiChars {
    public static void printNumbers() {
        int i;
        for (i = 48; i <= 57; i++) {
            System.out.println("The ASCII value of " + (char) i + " = " + i);
        }
    }

    public static void printLowerCaseLetters() {
        int i;
        for (i = 97; i <= 122; i++) {
            System.out.println("The ASCII value of " + (char) i + " = " + i);
        }
    }

    public static void printUpperCaseLetters() {
        int i;
        for (i = 65; i <= 90; i++) {
            System.out.println("The ASCII value of " + (char) i + " = " + i);
        }
    }
}