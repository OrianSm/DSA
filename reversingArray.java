import java.util.Arrays;
public class reversingArray {
    public static int[] reversedArray(int[] a){
		int i=0;
		int j=a.length-1;
		while(i<j){
			int temp;
			temp=a[j];
			a[j]=a[i];
			a[i]=temp;
			i++;
			j--;
		}
		return a;
	}
	public static void main(String args[]){
		int[] a = {2,3,4,5,6,7,8,9};
		int[] result=reversedArray(a);
		System.out.println(Arrays.toString(result));
	}
}
