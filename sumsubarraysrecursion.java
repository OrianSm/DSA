import java.util.ArrayList;
import java.util.List;

public class sumsubarraysrecursion {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int n= 5;
        int sum = 6;
        List<Integer> ds= new ArrayList<>();
        printF(array, 0, sum, ds, 0, n);
    }
    static void printF(int[] array, int result, int sum, List<Integer> ds, int ind, int n){
        if(ind==n){
            if(result==sum){
                for (Integer integer : ds) {
                    System.out.print(integer+" ");
                }
                System.out.println();
               
            }
            return;
        }
        ds.add(array[ind]);
        result+=array[ind];
        printF(array, result, sum, ds, ind+1, n);
        ds.remove(Integer.valueOf(array[ind]));
        result-=array[ind];
        printF(array, result, sum, ds, ind+1, n);
    }
}
