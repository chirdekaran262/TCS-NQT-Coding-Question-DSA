package Array;
public class Equi {
    public static void main(String[] args) {
        int[] a={2,6,5,8};
        int totalsum=0;
        for(int i=0;i<a.length;i++){
            totalsum+=a[i];
        }
        int leftsum=0,rightsum=totalsum;
        for(int i=0;i<a.length;i++){
            rightsum-=a[i];
            if(rightsum==leftsum){
                System.out.println("Equilibrium is "+a[i]+ " of position is "+i);
                return ;
            }
            leftsum+=a[i];
            if(leftsum==totalsum){
                System.out.println("No Equilibrium point in this array");
                return;
            }
        }
    }

}
