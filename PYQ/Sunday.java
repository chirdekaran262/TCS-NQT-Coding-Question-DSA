package PYQ;

public class Sunday {
    public static void main(String[] args) {
        int n=13;
        String str="mon";
        String arr[]={"mon","tue","wens","thurs","fri","sat","sun"};
        int i=0;
        for(i=0;i<arr.length;i++){
            if(arr[i].equals(str)){
                break;
            }
        }
        int res=1;
        int rem=6-i;
        n=n-rem;
        if(n>7){
            res+=n/7;
        }
        System.out.println("Remaining days: "+res);
    }
}
