public class mostWater {
    public static int mostWaterinContainer(int[] a){
		int result=0;
		int i=0;
		int j=a.length-1;
		int water=0;
		int height=0;
		int width=0;
		while(i<j){
			width=j-i;
			if(a[i]<a[j]){
				height=a[i];
				i++;
			}else{
				height=a[j];
				j--;
			}
			
			water=width*height;
			if(water>result){	
				result=water;
			}
		}
		return result;
	}
	public static void main(String args[]){
		int[] array={1, 8, 6};
		int result=mostWaterinContainer(array);
		System.out.println(result);
	}
}
