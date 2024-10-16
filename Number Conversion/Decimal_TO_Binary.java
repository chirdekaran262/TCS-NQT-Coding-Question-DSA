import java.util.*;

public class Decimal_TO_Binary{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the DECIMAL to convert into BINARY: ");
        int d=sc.nextInt();
        String str="";
        int d1=d;
        // USING JAVA METHOD 
        // str=Integer.toBinaryString(d);

        while(d1>0){
            int temp=(d1&1);
            str=temp+str;
            d1=d1>>1;
        }
        System.out.println("Binary Number "+str);

    }
}