import java.util.Arrays;
public class sortedSquares {
	public static int[] sortedSquresarray(int[] a){
		int length = a.length;
		int[] result= new int[length]; 
		int i=0;
		int j=a.length-1;
		int k=a.length-1;
		while(i<j){
			int s=a[i]*a[i];
			int t=a[j]*a[j];
			if(s<t){
				result[k]=t;
                j--;
			}else{
				result[k]=s;
                i++;
			}
			k--;
		}
		return result;
	}
	public static void main(String args[]){
		int[] a={-5, -3, -1, 2, 4};
		int[] result= sortedSquresarray(a);
		System.out.println(Arrays.toString(result));
	}
}
