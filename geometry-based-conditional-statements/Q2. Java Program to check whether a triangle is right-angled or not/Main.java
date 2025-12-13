import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side: ");
        double a = sc.nextDouble();
        System.out.print("Enter second side: ");
        double b = sc.nextDouble();
        System.out.print("Enter third side: ");
        double c = sc.nextDouble();
        double max = Math.max(a, Math.max(b, c));
        double side1, side2;
        if (max == a) {
            side1 = b;
            side2 = c;
        } else if (max == b) {
            side1 = a;
            side2 = c;
        } else {
            side1 = a;
            side2 = b;
        }
        if (Math.abs(max * max - (side1 * side1 + side2 * side2)) < 1e-9) {
            System.out.println("The triangle is right-angled.");
        } else {
            System.out.println("The triangle is not right-angled.");
        }

        sc.close();
    }
}
