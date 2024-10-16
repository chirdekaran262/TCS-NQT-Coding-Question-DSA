package PYQ;

public class supermarket {
    public static void main(String[] args) {
        int num=5244;
        int res=1;
        while(num>0){
            int temp=num%10;
            res=res*temp;
            num/=10;
        }
        System.out.println("Price is: "+res);
    }
}
