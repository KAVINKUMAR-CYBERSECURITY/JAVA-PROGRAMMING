import java.util.Scanner;
public class Main{
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        int cakesPerHour=s.nextInt();
        int hours=s.nextInt();
        System.out.println("Total Cakes: "+(cakesPerHour*hours));
    }
}
