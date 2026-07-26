import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println(number + " is a Positive Number");
        } else if (number < 0) {
            System.out.println(number + " is a Negative Number");
        } else {
            System.out.println("The number is Zero");
        }

        sc.close();
    }
}