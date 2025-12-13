import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        double perimeter = 4 * side;
        System.out.println("Perimeter of the square = " + perimeter);
    }
}

