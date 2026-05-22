import java.util.ArrayList;
import java.util.List;

public class rearrangepositiveNeg{
    public static void main(String[] args) {
        int[] array= {-2,45,23,-1,23,45,3,2,1,-1};
        rearranged(array);
    }

    static void rearranged(int[] array){
        List<Integer> positiveINts= new ArrayList<>();
        List<Integer> negativeINts= new ArrayList<>();
        for(int i = 0; i<array.length; i++){
            if(array[i]>=0){
                positiveINts.add(array[i]);
            }
            else{
                negativeINts.add(array[i]);
            }
        }
        int i=0,j=0,currentPointer=0;

        while (i<positiveINts.size() && j<negativeINts.size()) {
            array[currentPointer++]=positiveINts.get(i++);
            array[currentPointer++]=negativeINts.get(j++);
        }
        while(i<positiveINts.size()){
            array[currentPointer++]=positiveINts.get(i++);
        }
        while (j<negativeINts.size()) {
            array[currentPointer++]=negativeINts.get(j);
        }
        for (int integer : array) {
            System.out.print(integer+" ");
        }
    }
}