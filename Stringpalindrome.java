public class Stringpalindrome {
    static boolean isPalindrom(String args){
        String valur=args.toLowerCase();
        char[] array= valur.toCharArray();
        int i=0,j=array.length-1;
        while(i<j){
            if(array[i]!=array[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String arg = "Suraj";
        System.out.println(isPalindrom(arg));
    }
}
