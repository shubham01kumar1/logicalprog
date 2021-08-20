package logicalprog;
import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("press any key and enter to start stop watch");
        String start =sc.next();
        long startTime = System.currentTimeMillis();
        System.out.println("press any key and enter to stop the timer");
        String end =sc.next();
        long stopTime =System.currentTimeMillis();
        long elapseTime=stopTime-startTime;
        System.out.println("Elapsed Time in millisecond is :"+elapseTime);
    }
}
