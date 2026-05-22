import java.util.Arrays;

public class knapsackproblem{
    public static void main(String[] args) {
        int value[]={2,3,4,5};
        int size[]={1,2,3,4};
        int length=value.length;
        int bag=3;
        int dp[]=new int[length];
        Arrays.fill(dp, -1);
        System.out.print(knapsack(bag, dp, size, bag, value));
    }
    static int knapsack(int bag,int[] dp,int[] size,int ind,int[] value){
        if(ind==0){
            if(size[ind]<=bag){
                return dp[ind]=value[ind];
            }
            return dp[ind]=0;
        }
        if(ind!=-1){
            return dp[ind];
        }
        int notPick= 0+knapsack(bag,dp, size, ind-1, value);
        int pick=Integer.MIN_VALUE;
        if(size[ind]<=bag){

            pick= value[ind]+knapsack(bag-size[ind], dp, size, ind-1, value);
        }
        return dp[ind]=Math.max(pick, notPick);
    }
}