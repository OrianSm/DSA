import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class mergingSquaredArray {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the length of the String: ");
        int length=Sc.nextInt();
        int[] array= new int[length];
        for(int i =0; i<length;i++){
            System.out.println("Enter the number: ");
            array[i]=Sc.nextInt();
        }
        int[] result= SquaredArray(array);
        System.out.print("Result "+Arrays.toString(result));
        Sc.close();
    }
    public static int[] SquaredArray(int[] array){
       int[] result = new int[array.length];
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for(int i=0; i<array.length; i++){
            if(array[i]<0){
                a.add(array[i]);
            }else{
                b.add(array[i]);
            }
        }
        if(a.isEmpty()){
            for(int i=0;i<b.size();i++){
              b.set(i, b.get(i) * b.get(i));
              result[i]=b.get(i);
            }
            return result;
        }
        if(b.isEmpty()){
            for(int i=0;i<a.size();i++){
                a.set(i,a.get(i)*a.get(i));
            }
            Collections.reverse(a);
            for(int i =0;i<a.size();i++){
                result[i]= a.get(i);
            }
            return result;
        }
        for(int i=0;i<a.size();i++){
            a.set(i,a.get(i)*a.get(i));
        }
        for(int i=0;i<b.size();i++){
            b.set(i,b.get(i)*b.get(i));
        }
        Collections.reverse(a);
        int i=0,j=0,location=0;
        while(i<a.size() && j<b.size()){
            if(a.get(i)<b.get(j)){
                result[location]= a.get(i);
                location++;
                i++;
            }else{
                result[location]=b.get(j);
                location++;
                j++;
            }
        }
        while (i<a.size()) {
            result[location]=a.get(i);
            location++;
            i++;
        }
        while (j<b.size()) {
            result[location]=b.get(j);
            location++;
            j++;
        }
        
        return result;
    }
}