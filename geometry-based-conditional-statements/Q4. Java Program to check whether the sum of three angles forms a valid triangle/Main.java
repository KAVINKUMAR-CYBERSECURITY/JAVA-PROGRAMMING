import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();
        int sum = angle1 + angle2 + angle3;
        if (angle1 > 0 && angle2 > 0 && angle3 > 0 && sum == 180) {
            System.out.println("The angles form a valid triangle.");
        } else {
            System.out.println("The angles do not form a valid triangle.");
        }

        sc.close();
    }
}
