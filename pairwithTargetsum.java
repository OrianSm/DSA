import java.util.Arrays;
public class pairwithTargetsum{
	public static int[] targetResolution(int[] a){
		int i=0;
		int j=a.length-1;
		int target=10;
		while(i<j){
			if(a[i]+a[j]==target){
				return new int[]{i,j};
			}
			else if(a[i]+a[j]<target){
				i++;
			}
			else if(a[i]+a[j]>target){
				j--;
			}
		}
		return new int[]{-1,-1};
	}

	public static void main(String args[]){
		int[] a ={1, 2, 3, 4, 6};
		int[] result =targetResolution(a);
		System.out.println(Arrays.toString(result));
	}
	
}