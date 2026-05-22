import java.util.*;

public class smallerSum {
    
    public static int TripletwithSmallerSum(int n, int sum, int[] arr) {
        int result=0;
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length - 2; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] < sum) {
                    // FIX: Because the array is sorted, if arr[k] is valid, 
                    // everything between j and k is also valid. Add them all!
                    for (int x = j + 1; x <= k; x++) {
                        result++;
                    }
                    j++; // Move j forward after collecting all combinations
                } else {
                    k--; // The sum is too big, move the right pointer down
                }
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Enter Array Size: ");
        int n = Sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        
        System.out.println("Enter the Sum value: ");
        int Sum = Sc.nextInt();
        
       int triplets = TripletwithSmallerSum(n, Sum, arr);
        
        System.out.println("Valid Triplets: "+triplets);
        Sc.close();
    }
}