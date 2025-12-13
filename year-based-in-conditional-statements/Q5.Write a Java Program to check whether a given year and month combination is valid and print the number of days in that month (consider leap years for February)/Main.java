import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        if (m < 1 || m > 12) {
            System.out.println("Invalid month");
        } else if (m == 2) {
            System.out.println(
                ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) ? 29 : 28
            );
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            System.out.println(30);
        } else {
            System.out.println(31);
        }
        sc.close();
    }
}
