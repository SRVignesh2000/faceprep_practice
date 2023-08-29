package backTracking;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateParantheses {

	public static void generateParenthesis(int n, int open, int close, String s, ArrayList<String> ans) {
		if (open == n && close == n) {
			ans.add(s);
			return;
		}
		if (open < n) {
			generateParenthesis(n, open + 1, close, s + "(", ans);
		}
		if (close < open) {
			generateParenthesis(n, open, close + 1, s + ")", ans);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> ans = new ArrayList<>();
		generateParenthesis(n, 0, 0, "", ans);
		for (int i = ans.size() - 1; i >= 0; i--) {
			System.out.println(ans.get(i));
		}
		sc.close();
	}

}
