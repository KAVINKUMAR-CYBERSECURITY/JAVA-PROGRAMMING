import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sqrt = (int) Math.sqrt(num);
        if (sqrt * sqrt == num) {
            System.out.println(num + " is a Perfect Square.");
        } else {
            System.out.println(num + " is not a Perfect Square.");
        }
    }
}
