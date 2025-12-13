import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x > 0 && y > 0) {
            System.out.println("Point is in Quadrant 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Point is in Quadrant 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Point is in Quadrant 3");
        } else if (x > 0 && y < 0) {
            System.out.println("Point is in Quadrant 4");
        } else if (x == 0 && y == 0) {
            System.out.println("Point is at the Origin");
        } else if (x == 0) {
            System.out.println("Point is on the Y-axis");
        } else {
            System.out.println("Point is on the X-axis");
        }

        sc.close();
    }
}
