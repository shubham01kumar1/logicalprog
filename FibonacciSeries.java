package logicalprog;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the term till that you want fibonacci series.");
        int N= sc.nextInt();
        int a=0;
        int b=1;
        if (N==1){
            System.out.print(a+" ");
        }
        else {
            System.out.print(a+" ");
            System.out.print(b+" ");
            for (int i = 3; i <=N; i++) {
                int nth = a + b;
                System.out.print(nth + " ");
                a = b;
                b = nth;
            }
        }
    }
}
