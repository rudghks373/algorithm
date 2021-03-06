package rudghks373.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj15649 {
	static int N;
	static int M;
	static int check[];
	static int arr[];
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		check = new int[10];
		arr = new int[10];
		br.close();

		sol(0);
		System.out.println(sb);

	}

	public static void sol(int k) throws IOException {
		if (k == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append("\n");
			return;
		} else {
			for (int i = 1; i <= N; i++) {
				if (!(check[i] == 1)) {
					check[i] = 1;
					arr[k] = i;
					sol(k + 1);
					check[i] = 0;
				}
			}
		}
	}
}
