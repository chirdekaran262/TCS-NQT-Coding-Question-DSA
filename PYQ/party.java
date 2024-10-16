package PYQ;

public class party {
    public static void main(String[] args) {
        int E[]={7,0,5,1,3};
        int L[]={1,2,1,3,4};
        int maxGuest=0;
        int temp=0;
        for (int i = 0; i < E.length; i++) {
            temp=temp+E[i];
            temp=temp-L[i];
            if(temp>maxGuest){
                maxGuest=temp;
            }
        }
        System.out.println("Max Guest at party at some time: "+maxGuest);
    }
}
