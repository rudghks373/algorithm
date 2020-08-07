package rudghks373.recursion;

import java.util.Scanner;

public class bj1074 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		System.out.println(sol(N, r, c));
	}

	public static int sol(int n, int r, int c) {
		if (n == 0)
			return 0;
		int half = (int) Math.pow(2, n - 1);
		if (r < half && c < half)
			return sol(n - 1, r, c);
		if (r < half && c >= half)
			return half * half + sol(n - 1, r, c - half);
		if (r >= half && c < half)
			return 2 * half * half + sol(n - 1, r - half, c);
		return 3 * half * half + sol(n - 1, r - half, c - half);
	}
}
