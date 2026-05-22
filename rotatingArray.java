public class rotatingArray {
    public static void rotate(int[] nums, int k) {
        k=k%nums.length;
        int i=0,j=nums.length-1,temp;
        while(i<j){
            temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            i++;
            j--;
        }
        int t=k-1;
        for(int s=0;s<k;s++){
            temp=nums[s];
            nums[s]=nums[t];
            nums[t]=temp;
            t--;
        }
        int start=k, end=nums.length-1;
        while(start<end){
            temp=nums[start];
            nums[start]=nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        for (int l : nums) {
            System.out.print(l+" ");
        }
    }
    public static void main(String[] args) {
        int[] array ={1,2,4,5,6,4,6,7};
        int N=3;
        rotate(array,N);
    }
}

