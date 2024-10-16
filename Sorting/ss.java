public class ss{
    public static void main(String[] args) {
        int a[]={4,6,2,7,1,9,3};
        for(int i=0;i<a.length-1;i++){
            int min_idx=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min_idx]){
                    min_idx=j;
                }
            }
            int temp=a[i];
            a[i]=a[min_idx];
            a[min_idx]=temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}