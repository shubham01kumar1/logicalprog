package logicalprog;
import java.util.Scanner;
//Program to check whether a number is a Prime number
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();
        PrimeNo(number);
    }
    static void PrimeNo(int number) {
        boolean flag = false;
        for (int i = 2; i <= number/2; i++) {
            int prime = number % i;
            if (prime == 0) {
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("It is not a prime number");
        }
        else
            System.out.println("It is a Prime Number ");
    }
}
