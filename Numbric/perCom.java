public class perCom {
    public static int fact(int n){
        if(n==1||n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static int per(int n,int r){
        return fact(n)/fact(r);
    }
    public static int com(int n,int r){
        
        return fact(n)/fact(r)*fact(n-r);
    }
    public static void main(String[] args) {
        int n=6,r=4;
        System.out.print("Permutation of "+n+"P"+r+" is "+per(n,r));
        System.out.print("\nCombination of "+n+"C"+r+" is "+com(n,r));
    }
}
