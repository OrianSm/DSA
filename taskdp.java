public class taskdp {
    public static void main(String[] args) {
        int[][] array={{10,20,30},{10,50,60},{20,30,80}};
        
    }
    static int taskdone(int day,int task, int[] dp,int[][] array){
        int maxi=0;
        if( day==0){
            for(int i=0;i<=0;i++){
                for(int j=0;j<array[i].length;j++){
                    if(j!=task){
                        maxi=Math.max(maxi, array[i][j]);
                    }
                    return maxi;
                }
            }
        }
        
    }
}
