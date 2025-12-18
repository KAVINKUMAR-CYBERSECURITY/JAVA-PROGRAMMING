import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());

        int max = 0;

        while (n > 0) {
            int d = n % 10;
            if (d > max) max = d;
            n /= 10;
        }

        System.out.println("Largest digit: " + max);
    }
}
