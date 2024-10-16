public class bs{
public static void main(String[] args){
	int a[]={3,5,2,6,7,9,1};
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a.length-1;j++){
			if(a[j]>a[j+1]){
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
	for(int k=0;k<a.length;k++){
		System.out.print(a[k]+" ");
	}
	}
}