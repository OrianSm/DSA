public class removeDuplicate {
    public static int duplicateremoval(int[] a){
		int i=1;
		int j=i+1;
		int length=0;
		while(j!=a.length){
			if(a[i]==a[j]){
				j++;
			}
			else if(a[i]!=a[j]){
				i++;
				length++;
				j++;
			}
		}
		return length;
	}
	public static void main(String args[]){
		int[] s={1,1,2,3,3,4,4,4,5};
		System.out.println(duplicateremoval(s));
	}
}
