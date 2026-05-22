public class movingZero {
    static void moveZero(int arr[]){
        int insertPosition=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[insertPosition]=arr[i];
                insertPosition++;
            }
        }
        for(int i=insertPosition;i<arr.length;i++){
            arr[i]=0;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String args[]){
        int[] arr={1,2,3,0,5,0,3,0,0,0,6,0};
        moveZero(arr);
    }
}
