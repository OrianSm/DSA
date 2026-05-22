import java.util.*;
public class addition {
    public static int sumOfTwo(int a, int b){
        int c = a + b;
        return c;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(sumOfTwo(n, y));
        sc.close();
    }
}
