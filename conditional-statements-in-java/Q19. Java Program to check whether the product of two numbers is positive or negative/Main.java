import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int product = num1 * num2;
        if (product > 0) {
            System.out.println("The product of " + num1 + " and " + num2 + " is positive.");
        } else if (product < 0) {
            System.out.println("The product of " + num1 + " and " + num2 + " is negative.");
        } else {
            System.out.println("The product of " + num1 + " and " + num2 + " is zero.");
        }
    }
}

