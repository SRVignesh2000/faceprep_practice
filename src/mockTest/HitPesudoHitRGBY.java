package mockTest;

public class HitPesudoHitRGBY {

	public static void main(String[] args) {

		String guess = "RYGG";
		String solution = "GGBB";

		if (guess == null || "".equals(guess)) {
			System.out.println("Invalid Input");
			return;
		}

		if (solution == null || "".equals(solution)) {
			System.out.println("Invalid Input");
			return;
		}

		if (guess.length() != solution.length()) {
			System.out.println("Invalid Input");
			return;
		}

		String guessArray[] = new String[guess.length()];
		String SolArray[] = new String[solution.length()];

		for (int i = 0; i < guess.length(); i++) {
			guessArray[i] = String.valueOf(guess.charAt(i));
			SolArray[i] = String.valueOf(solution.charAt(i));
		}

		int hit = 0;
		for (int i = 0; i < 4; i++) {
			if (guessArray[i].equals(SolArray[i])) {
				hit++;
				guessArray[i] = "#";
				SolArray[i] = "#";

			}
		}

		int pseudo_hit = 0;
		for (int i = 0; i < 4; i++) {

			if (guessArray[i].equals("#")) {
				continue;
			}

			for (int j = 0; j < 4; j++) {
				
				if (guessArray[i].equals(SolArray[j])) {
					SolArray[j] = "#";
					pseudo_hit++;
					break;
				}
			}

		}

		System.out.println("hit " + hit);
		System.out.println("pseudo_hit " + pseudo_hit);

	}

}
