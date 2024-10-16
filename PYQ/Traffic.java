package PYQ;

public class Traffic {
    public static void main(String[] args) {
        int N=5;
        int regNo[]={2,5,1,6,8};
        int D=3;
        int fine=300;
        int totalFine=0;
        for(int i=0;i<N;i++){
            if(D%2==0){
                if(regNo[i]%2!=0){
                    totalFine+=fine;
                }
            }
            else if(D%2!=0){
                if(regNo[i]%2==0){
                    totalFine+=fine;
                }
            }
        }
        System.out.println("Total Fine collected from vechicle is: "+totalFine);
    }
}
