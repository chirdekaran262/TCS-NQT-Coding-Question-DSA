
import java.util.Scanner;

public class hexa_TO_Decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Hexadecimal Number: ");
        String o=sc.next();
        // USING JAVA METHOD 
        int d=Integer.parseInt(o,16);
        System.out.println("Decimal: "+d);

        System.out.print("Enter decimal Number: ");
        int d1=sc.nextInt();
        // USING JAVA METHOD 
        String h1=Integer.toHexString(d1);
        System.out.println("Decimal: "+h1);


    }
}
