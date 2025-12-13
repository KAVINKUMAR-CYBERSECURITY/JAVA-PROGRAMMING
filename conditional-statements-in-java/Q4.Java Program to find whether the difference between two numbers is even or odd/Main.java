import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int diff = Math.abs(a - b);   
        if (diff % 2 == 0) {
            System.out.println("The difference (" + diff + ") is Even");
        } else {
            System.out.println("The difference (" + diff + ") is Odd");
        }
        sc.close();
    }
}
