import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a > 0 && b > 0 && c > 0 && 
            a + b > c && b + c > a && c + a > b) {
            System.out.println("The sides form a valid triangle.");
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }

        sc.close();
    }
}

