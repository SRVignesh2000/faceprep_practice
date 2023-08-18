package day30;

import java.util.*;

class Card {
	String symbol;
	int number;

	public Card(String symbol, int number) {
		this.symbol = symbol;
		this.number = number;
	}

	@Override
	public String toString() {
		return symbol + " " + number;
	}
}

public class CollectAndGroupCards{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		Map<String, List<Card>> cardMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String symbol = scanner.nextLine();
			int number = Integer.parseInt(scanner.nextLine());
			Card card = new Card(symbol, number);
			List<Card> symbolCards = cardMap.getOrDefault(symbol, new ArrayList<>());
			symbolCards.add(card);
			cardMap.put(symbol, symbolCards);
		}
		// Sort and print distinct symbols
		List<String> symbols = new ArrayList<>(cardMap.keySet());
		Collections.sort(symbols);
		System.out.println("Distinct Symbols are :");
		for (String symbol : symbols) {
			System.out.print(symbol + " ");
		}
		// System.out.println();
		// Print cards for each symbol and their count and sum
		for (String symbol : symbols) {
			System.out.println("\nCards in " + symbol + " Symbol");
			List<Card> symbolCards = cardMap.get(symbol);
			int sum = 0;
			for (Card card : symbolCards) {
				System.out.println(card);
				sum += card.number;
			}
			System.out.println("Number of cards : " + symbolCards.size());
			System.out.println("Sum of Numbers : " + sum);
		}
	}
}