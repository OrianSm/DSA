public class majorityBoyermooreElement {
    static int majorityElementBM(int[] array){
        int votes=0;
        int candidate=0;
        for(int i =0;i<array.length;i++){
            if(votes==0){
                candidate=array[i];
                votes=1;
            }
            else if(array[i]==candidate){
                votes++;
            }
            else{
                votes--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] array= {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElementBM(array));
    }
}
