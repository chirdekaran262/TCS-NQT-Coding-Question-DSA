package PYQ;

public class IG {
    public static void main(String[] args) {
        int N=1234;
        int R=2;
        int res=0;
        int num=N;
        while(num>0){
            int temp=num%10;
            res+=temp;
            num/=10;
        }
        res*=R;
        int res1=res;
        res=0;
        while(res1>0){
            int t=res1%10;
            res+=t;
            res1/=10;
        }
        System.out.println("Single Digit Number is: "+res);
    }
}
