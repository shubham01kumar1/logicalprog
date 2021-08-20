package logicalprog;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        System.out.println("Enter the number to reverse:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int revNum = reverse(num);
        System.out.println("reverse number is:" + revNum);
    }
    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            int remainder = num % 10;
            num /= 10;
            rev = rev * 10 + remainder;
        }
        return rev;
    }
}
