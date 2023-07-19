package day19;

import java.util.Scanner;
class RecursionPowerMultiple {
	
    static int findPower(int num, int pow) {
        if (pow == 0) {
            return 1;
        } else {
            return num * findPower(num, pow - 1);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        int val = findPower(num, pow);
        
        System.out.println("The value of " + num + " raised to the power " + pow + " is " + val);
    }
}
