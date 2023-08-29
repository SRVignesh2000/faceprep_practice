package backTracking;

public class TowerOfHanai {

	static void towerOfHanoi(int n, char from_rod, char aux_rod, char to_rod)// c,a,b
	{
		if (n == 0) {
			return;
		}
		towerOfHanoi(n - 1, from_rod, to_rod, aux_rod);// 2 - a,c,b//
		System.out.println(n + " " + from_rod + " " + to_rod);
		towerOfHanoi(n - 1, aux_rod, from_rod, to_rod);// 0 - //1 -
	}

	public static void main(String args[]) {
		int N = 3;

// A, B and C are names of rods
		towerOfHanoi(N, 'A', 'B', 'C');
	}

}
