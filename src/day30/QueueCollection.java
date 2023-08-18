package day30;

import java.util.LinkedList;
import java.util.Scanner;

import day11.Queue;

public class QueueCollection {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.close();

		java.util.Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}

		System.out.println(queue);

		System.out.println("Even numbers:");
		while (!queue.isEmpty()) {
			int number = queue.poll();
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}
	}

}
