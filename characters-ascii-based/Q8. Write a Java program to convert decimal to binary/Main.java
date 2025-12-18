import java .util.Scanner;
public class Main{
    public static void main(String srgs[]){
        int decimal = 25;
         String binary = "";
         while(decimal > 0) {
             int remainder = decimal % 2;
              binary = remainder + binary;
               decimal = decimal / 2;
         }
         System.out.println("Binary: " + binary);
    }
}