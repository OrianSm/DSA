import java.util.Scanner;

public class palindrom{public static void main(String args[]){
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter Input: ");
        String string= Sc.nextLine();
        System.out.println(IsPalindrome(string));
        Sc.close();
    }
    public static Boolean IsPalindrome(String args){
        Boolean result;
        int l=0;
        int right=args.length()-1;
        result = true;
        while(l<right){
            if(args.charAt(l)!=args.charAt(right)){
                result=false;
                return result;
            }
            else{
                l++;
                right--;
            }
        }
        return result;
    }
}