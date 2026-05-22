public class kadanesAlgo {
    public static void main(String args[]){
        int[] arr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        largestsubarray(arr);
    }
    static int largestsubarray(int[] array){
        int bestStart=0;
        int bestEnd=0;
        int currentStart=0;
        int largestsum=array[0];
        int sum=array[0];
        for(int i =1;i<array.length;i++){
            if(sum+array[i]<array[i]){
                sum=array[i];
                currentStart=i;
            }else{
                sum+=array[i];
            }

            if(largestsum<sum){
                bestStart=currentStart;
                bestEnd=i;
                largestsum=sum;
            }
        }
        
        for(int i=bestStart ; i<=bestEnd;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("Largest Sum possible: "+largestsum);
        return largestsum;
    }
}
