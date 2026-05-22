import java.util.Arrays;
import java.util.Scanner;

public class dutchNationalFlag {
    static int[] rearranged(int[] arr){
        int low=0, mid=0, high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp= arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int Size= Sc.nextInt();
        int[] array= new int[Size];
        for(int i=0;i<Size;i++){
            array[i]=Sc.nextInt();
        }
        Sc.close();
        System.out.println(Arrays.toString(rearranged(array)));
    }
}
