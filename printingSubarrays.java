import java.util.ArrayList;
import java.util.List;

public class printingSubarrays {
    public static void main(String[] args) {
        int[] array={3,1,2};
        int n=3;
        List<Integer> list1= new ArrayList<>();
        printsubarrays(array, n, list1, 0);
    }
    static void printsubarrays(int[] array, int n, List<Integer> ds, int ind){
        if(ind==n){
            for(int f:ds){
                System.out.print(f+" ");    
            }    
            if(ds.size()==0){
                System.out.println("{}");
            }
            System.out.println();
            return;
        }
        ds.add(array[ind]);
        printsubarrays(array, n, ds, ind+1);
        ds.remove(Integer.valueOf(array[ind]));
        printsubarrays(array, n, ds, ind+1);

    }
}
