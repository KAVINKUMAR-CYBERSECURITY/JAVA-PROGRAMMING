import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        for (char d = '0'; d <= '9'; d++) {
            int count = 0;
            for (int i = 0; i < n.length(); i++)
                if (n.charAt(i) == d) count++;

            if (count > 0)
                System.out.println(d + " : " + count);
        }
    }
}
