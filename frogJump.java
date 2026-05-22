import java.util.Arrays;

public class frogJump {
    public static void main(String[] args) {
        int[] array={10,20,30,10};
        int n=array.length;
        int[] dp= new int[n];
        Arrays.fill(dp, -1); 
        dp[0]=0;
        for(int i=1;i<n;i++){
            int fp=dp[i-1]+ Math.abs(array[i]-array[i-1]);
            int sp=Integer.MAX_VALUE;
            if(i>1){
                sp=dp[i-2]+Math.abs(array[i]-array[i-2]);
            }
            dp[i]=Math.min(fp, sp);
        }
        System.out.println(dp[n-1]);
    }
    
    static int frogjumps(int ind, int[] array, int[] dp){
        if(ind==0){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int right=Integer.MAX_VALUE;
        int left= (frogjumps(ind-1, array, dp))+ Math.abs(array[ind]-array[ind-1]);
        if(ind>1){
            right= (frogjumps(ind-2, array, dp)+Math.abs(array[ind]-array[ind-2]));
            
        }
       return dp[ind]=Math.min(right, left);
   }
}
