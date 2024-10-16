package PYQ;

class praking{
    public static void main(String[] args) {
        int[][] park={{1,0,1},{1,1,0},{0,0,1},{1,0,0},{1,1,1}};
        int sum=0;
        int row=0;
        for(int i=0;i<park.length;i++){
            int temp=0;
            for(int j=0;j<park[0].length;j++){
                if(park[i][j]==1){
                    temp++;
                }
            }
            if(temp>sum){
                sum=temp;
                row=i;
            }
        }
        System.out.println("Row is: "+row);
    }
}