import java.util.Arrays;

public class maxsumnonadjasent{
    public static void main(String[] args) {
        int[] array={1,2,4};
        int n=array.length;
        int[] dp= new int[n];
        int ind=n-1;
        Arrays.fill(dp, -1);
        dp[0]=array[0];
        for(int i=1;i<array.length;i++){
            int pick= array[i];
            if(i-2>=0){
                pick= array[i]+dp[i-2];
            }
           int notpick=0+ dp[i-1];
            dp[i]=Math.max(pick, notpick);
        }
        System.out.println(dp[n-1]);
        System.out.println(maxsumnonadj(ind, dp, array));
    }
    static int maxsumnonadj(int ind, int[] dp, int[] array){
        if(ind==0){
            return dp[ind]=array[ind];
        }
        if(ind<0){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int pick= array[ind]+maxsumnonadj(ind-2, dp, array);
        int notpick= 0+ maxsumnonadj(ind-1, dp, array);
        return dp[ind]= Math.max(pick, notpick);
    }
}