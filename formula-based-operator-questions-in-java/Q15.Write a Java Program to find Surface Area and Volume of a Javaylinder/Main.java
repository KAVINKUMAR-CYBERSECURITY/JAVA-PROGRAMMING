import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        double surfaceArea = 2 * Math.PI * radius * (height + radius);
        double volume = Math.PI * radius * radius * height;
        System.out.println("Surface Area of Cylinder = " + surfaceArea);
        System.out.println("Volume of Cylinder = " + volume);
    }
}
