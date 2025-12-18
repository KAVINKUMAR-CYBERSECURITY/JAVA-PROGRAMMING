import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int square = num * num;
        int temp = num;
        while (temp > 0) {
            if (temp % 10 != square % 10) {
                System.out.println(num + " is not an Automorphic Number.");
                return;
            }
            temp /= 10;
            square /= 10;
        }

        System.out.println(num + " is an Automorphic Number.");
    }
}
