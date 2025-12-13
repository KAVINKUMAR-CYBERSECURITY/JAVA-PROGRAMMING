import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); 
        int asciiValue = (int) ch; 
        if (asciiValue % 2 == 0) {
            System.out.println("The ASCII value of '" + ch + "' (" + asciiValue + ") is even.");
        } else {
            System.out.println("The ASCII value of '" + ch + "' (" + asciiValue + ") is odd.");
        }
    }
}
