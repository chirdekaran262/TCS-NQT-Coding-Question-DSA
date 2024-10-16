package PYQ;

public class countPrio {
    public static void main(String[] args) {
        int a[]={3,2,4,9,1,5,7,10,6,8};
        int count=1;
        int Prio=a[0];
        for (int i = 1; i < 10; i++) {
            if(Prio<a[i]){
                count++;
                Prio=a[i];
            }
        }
        System.out.println("Total Priority Element is: "+count);
    }
}
