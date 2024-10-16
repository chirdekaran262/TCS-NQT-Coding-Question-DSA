package PYQ;

import java.math.BigInteger;

public class ArrangeSeat {
    public static BigInteger fact(int num){
        BigInteger res=BigInteger.ONE;
        for(int i=num;i>0;i--){
            res=res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    public static void main(String[] args) {
        int n=10;
        BigInteger res=fact(n-1);
        System.out.println(res.multiply(BigInteger.valueOf(2)));
    }
}
