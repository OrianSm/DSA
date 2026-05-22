public class secondLargest {
    static int secondLargestNumber(int[] array){
        if(array.length==1){
            return -1;
        }
        int Largest=Integer.MIN_VALUE;
        int secondLargestNum=Integer.MIN_VALUE;
        
        for(int i =0; i<array.length;i++){
            if(array[i]>Largest){
                secondLargestNum=Largest;
                Largest=array[i];
            }
            else if(array[i]>secondLargestNum && array[i]!=Largest){
                secondLargestNum=array[i+1];
            }
        }
        return secondLargestNum;
    }
    public static void main(String[] args){
        int[] array={10, 20};
        System.out.println(secondLargestNumber(array));
    }
}
