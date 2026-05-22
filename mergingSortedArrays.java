import java.util.Arrays;
import java.util.Scanner;

public class mergingSortedArrays {
    public static void main(String args[]){
        System.out.println("Enter length of first Array: ");
        Scanner Sc = new Scanner(System.in);
        int length= Sc.nextInt();
        int[] input= new int[length];

        for(int i =0;i<input.length;i++){
            input[i]= Sc.nextInt();
        }
        System.out.println("Enter length of Second Array: ");
        int lengthSecond= Sc.nextInt();
        int[] inputSecond= new int[lengthSecond];

        for(int i =0;i<inputSecond.length;i++){
            inputSecond[i]= Sc.nextInt();
        }
       int[] merged = mergeArray(input, inputSecond);
System.out.println("Merged Array: " + Arrays.toString(merged));
        Sc.close();
    }
    public static int[] mergeArray(int[] a, int[] b){
        int[] result = new int[a.length+b.length];
        int i=0,j=0,location=0;
        while(i!=a.length && j!=b.length ){
            if(a[i]<b[j]){
                result[location]=a[i];
                i++;
                location++;
            }else{
                result[location]=b[j];
                j++;
                location++;
            }
        }
        while(i!=a.length){
            result[location]=a[i];
            location++;
            i++;
        }
        while (j!=b.length) {
            result[location]=b[j];
            location++;
            j++;
        }
        return result;
    }
}
