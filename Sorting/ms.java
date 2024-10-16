public class qs{
    public static void mergeSort(int a[],int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
    public static void merge(int a[],int low,int mid,int high){
        int temp[]=new int[a.length];
        int i=low,j=mid+1,k=low;
        while(i<=mid&&j<=high){
            if(a[i]<=a[j]){
                temp[k]=a[i];
                i++;
                k++;
            }
            else{
                temp[k]=a[j];
                j++;
                k++;
            }
        }
        while (i<=mid) {
            temp[k]=a[i];
            i++;
            k++;
        }
        while(j<=high){
            temp[k]=a[j];
            j++;
            k++;
        }
        for(int l=0;i<k;k++){
            a[l]=temp[l];
        }
    }
    public static void main(String[] args) {
        int a[]={5,3,7,2,1,6,4};
        mergeSort(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}