import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("Greatest number is: " + a);
        } else if (b > a) {
            System.out.println("Greatest number is: " + b);
        } else {
            System.out.println("Both numbers are equal");
        }
        sc.close();
    }
}
