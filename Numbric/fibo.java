public class fibo {
    public static void main(String[] args) {
        int a=100;
        int t1=1,t2=1;
        int t3=t1+t2;
        System.out.print("Fiboonaci series: ");
        System.out.print(t1+" "+t2);
        while(a>t3){
            System.out.print(" "+t3);
            t1=t2;
            t2=t3;
            t3=t1+t2;
        }
    }
}
