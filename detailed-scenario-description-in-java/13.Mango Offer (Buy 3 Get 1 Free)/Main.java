import java.util.Scanner;
public class Main{
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        int purchased=s.nextInt();
        double price=s.nextDouble();

        int free = purchased / 3;               
        int total = purchased + free;           
        double amount = purchased * price;      
        System.out.println("Total Mangoes: "+total);
        System.out.println("Amount to Pay: "+amount);
    }
}
