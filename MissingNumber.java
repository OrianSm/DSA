public class MissingNumber {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,10,12};
        int N= 12;
System.out.println(findingNumber(arr, N));
    }
    static int findingNumber(int[] array,int N){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        int Expected= (N*(N+1))/2;
        int missingnumber= Expected-sum;
        return missingnumber;
    }
}
