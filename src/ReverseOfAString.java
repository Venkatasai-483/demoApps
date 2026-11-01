import java.util.Scanner;

public class ReverseOfAString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        StringBuilder reverse = new StringBuilder();


        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }

        System.out.println("Reversed string: " + reverse);
        scanner.close();
    }
}