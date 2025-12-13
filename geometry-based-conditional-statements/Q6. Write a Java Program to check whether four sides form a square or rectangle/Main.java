import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        if (a == b && b == c && c == d) {
            System.out.println("The sides form a Square.");
        } else if (a == c && b == d) {
            System.out.println("The sides form a Rectangle.");
        } else {
            System.out.println("The sides do not form a Square or Rectangle.");
        }
        sc.close();
    }
}
