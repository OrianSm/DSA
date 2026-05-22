import java.util.*;

public class tripletSum {
    public static List<int[]> tripletsum(int[] array){
        List<int[]> tripletVal= new ArrayList<>();
        Arrays.sort(array);
        for(int i=0;i<array.length-2;i++){
            if(i>0 && array[i]==array[i-1]){
                continue;
            }
            int value= -array[i];
            int j=i+1,k=array.length-1;
            while(j<k){
                if(array[j]+array[k]==value){
                    tripletVal.add(new int[]{array[i],array[j],array[k]});
                    j++;
                    k--;
                    while(j<k && array[j]==array[j-1]){
                        j++;
                    }
                    while(k>j && array[k]==array[k+1]){
                        k--;
                    }
                }
                else if(array[j]+array[k]<value){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return tripletVal;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int size= Sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=Sc.nextInt();
        }
        List<int[]> Result = tripletsum(array);

    System.out.println("Triplets found:");
    for (int[] triplet : Result) {
        System.out.println(Arrays.toString(triplet));
    }
        Sc.close();
    }
}
