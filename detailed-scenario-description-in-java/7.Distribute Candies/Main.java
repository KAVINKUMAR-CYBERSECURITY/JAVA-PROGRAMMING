import java.util.Scanner;
public class Main{
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        int candies=s.nextInt();
        int students=s.nextInt();
        System.out.println("Each gets: "+(candies/students));
        System.out.println("Remaining: "+(candies%students));
    }
}
