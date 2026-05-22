import java.util.Scanner;

public class countingDigit{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the NUmeber: ");
        int a = Sc.nextInt();
        System.out.println(digitCount(a));
        Sc.close();
    }
    static int digitCount(int a){
        int count=0;
        if(a==0){
            return 1;
        }
        while(a>0){
            a/=10;
            count++;
        }
        return count;
    }
}