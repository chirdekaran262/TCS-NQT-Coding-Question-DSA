package PYQ;

public class Risk {
    public static void main(String[] args) {
        int[] a={1,0,0,1,1,2,2,0,1};
        int czero=0,cone=0,ctwo=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==0){
                czero++;
            }
            else if (a[i]==1) {
                cone++;
            }
            else {
                ctwo++;
            }
        }
        int j=0;
        while(czero>0){
            a[j]=0;
            j++;
            czero--;
        }
        while (cone>0) {
            a[j]=1;
            j++;
            cone--;
        }
        while (ctwo>0) {
            a[j]=2;
            j++;
            ctwo--;
        }
        for (int i = 0; i < 9; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
