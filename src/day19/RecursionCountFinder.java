package day19;

import java.util.Scanner;

public class RecursionCountFinder {

	public static int countFinder(int num, int count) {

		if (num > 0) {
			count++;
			return countFinder(num / 10, count);

		}
		return count;

	}

	public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int num = 43342;
       int count =  0;
       int result = countFinder(num, count);
       System.out.println(result);
    }

}
