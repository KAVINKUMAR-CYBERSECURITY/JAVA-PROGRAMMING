import java.util.Scanner;
public class Main{
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        int bought=s.nextInt();
        double price=s.nextDouble();
        int free = (bought / 5) * 2;          
        int toPay = bought - free;             
        double totalCost = toPay * price;      
        System.out.println("Pens to Pay For: "+toPay);
        System.out.println("Total Cost: "+totalCost);
    }
}
