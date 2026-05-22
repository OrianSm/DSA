public class isSorted {
    public static void main(String args[]){
        int[] array= {2,3,2,5,1,7,8};
        System.out.println(checkArray(array));
    }
    static boolean checkArray(int[] array){
       for(int i =0;i<array.length-2;i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }
}
