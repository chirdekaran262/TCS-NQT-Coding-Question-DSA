public class primeRange {
    public static boolean isPrime(int p){
        for(int i=2;i<Math.sqrt(p);i++){
            if(p%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a=5,b=30;
        System.out.println("Prime Number is : ");
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
