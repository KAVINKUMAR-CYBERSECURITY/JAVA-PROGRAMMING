import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int[] freq = new int[10]; 
        num = Math.abs(num);      
        if (num == 0) {
            freq[0] = 1;
        } else {
            while (num > 0) {
                int digit = (int)(num % 10);
                freq[digit]++;
                num = num / 10;
            }
        }
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " : " + freq[i]);
            }
        }

        sc.close();
    }
}
