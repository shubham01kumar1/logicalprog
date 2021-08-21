package logicalprog;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.HashSet;

public class CouponNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of Unique Coupons to Generate :");
        int num=scan.nextInt();
        couponGenerator(num);
    }
    static void couponGenerator(int num) {
        HashSet<Integer> list= new HashSet<Integer>();
        int origin=10000000;
        int bound=99999999;
        int totalCoupons=bound-origin;
        if(num>=(totalCoupons)){
            System.out.println("Sorry number of unique coupons to generate is very large");
            return;
        }
        while(num>0 && num<totalCoupons) {
            int couponNumber = ThreadLocalRandom.current().nextInt(origin,bound);
            if(!list.contains(couponNumber)) {
                list.add(couponNumber);
                num--;
            }
        }
        int countCoupons=0;
        for (int coupons:list) {
            System.out.println("unique coupon:"+coupons);
            countCoupons++;
        }
        System.out.println(countCoupons);
    }
}
