public class duplicateNumber {
    static int findingDuplicate(int[] array, int N){
        int actualSum= 0;
        for(int number: array){
            actualSum+=number;
        }
        int totalSum= (N*(N+1))/2;
        int DuplicateNumber=actualSum-totalSum;
        return DuplicateNumber;
    }
    public static void main(String args[]){
        int[] arr= {1,2,3,4,4,5};
        int N=5;
        System.out.println(findingDuplicate(arr, N));
    }
}
