package Array;
public class GCD {
    public static void main(String[] args) {
        int a=10,b=35;
        int a1=a,b1=b;
        int gcd=1;
        while(a1>0&&b1>0){
            if(a1>b1){
                a1=a1%b1;
            }
            else{
                b1=b1%a1;
            }
            if(a1==0){
                gcd=b1;
                break;
            }
            else if(b1==0){
                gcd=a1;
break;            }
        }
        System.out.println("GCD is : "+gcd);

        //LCM FIND ALSO IN SAME PROGRAM 
        //USING GCD;
        int lcm=(a*b)/gcd;
        System.out.println("LCM IS: "+lcm);
    }
}
