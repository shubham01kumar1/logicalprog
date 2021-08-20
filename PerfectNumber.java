package logicalprog;
import java.util.Scanner;
//program to check wheather a number is a Perfect Number or not
public class PerfectNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number to check whether it is a perfect number or not");
        int number = scan.nextInt();
        perfectNum(number);
    }
    static void perfectNum(int number){
        int sum = 0;
        System.out.println("Factors of "+number+" are:");
        for(int i=1;i<number;i++){
            int remainder = number%i;
            if( remainder==0){
                System.out.print("  "+i+" ");
                sum+=i;
            }
        }
        if(sum==number){
            System.out.println("\nIt is a Perfect Number");
        }
        else System.out.println("\nIt is not a Perfect Number");
    }
}
