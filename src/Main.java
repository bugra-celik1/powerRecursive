import java.util.Scanner;
public class Main {
   static int power(int a,int b){
       if( b == 1){
         return a;
     }

       return a * power(a,b-1);

   }
   public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
       System.out.print("Taban değerini giriniz:");
       int base = scan.nextInt();
       System.out.print("Üst değerini giriniz:");
       int exp = scan.nextInt();
       System.out.println(power(base,exp));
   }
}