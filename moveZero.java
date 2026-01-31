import java.util.Arrays;
public class moveZero {
    public static int[] movingZero(int[] a){
		int i = 0;
		int j= i+1;
		while(j<a.length){
			if(a[i]!=0){
				i++;
				j++;
			}
			else if(a[j]!=0){
				a[i]=a[j];
				a[j]=0;
				i++;
				j++;
			}
			else{
				j++;
			}
		}
		return a;
	}
	public static void main(String args[]){
		int[] a = {0, 1, 0, 3, 12};
		int[] result= movingZero(a);
		System.out.println(Arrays.toString(result));
	}
}
