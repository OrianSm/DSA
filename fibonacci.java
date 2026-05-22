import java.util.Scanner;

public class fibonacci {
    public static void main(String args[]){
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= Sc.nextInt();
        seriese(n);
        Sc.close();
    }
    public static void seriese(int a){
        int previous=0;
        int current=1;
        if(a==previous){
            System.out.println("Please enter Valid Number......");
        }else if(a==current){
        System.out.println(previous);}
        else if(a==2){
        System.out.println(current);}
        else{
            int temp=0;
            for(int i=0; i<a-2;i++){
                temp= current;
                current+=previous;
                previous=temp;
                System.out.println(current);
            }
        }
    }
}
