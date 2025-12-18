import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char first = n.charAt(0);
        char last = n.charAt(n.length() - 1);
        System.out.println(last + n.substring(1, n.length() - 1) + first);
    }
}
