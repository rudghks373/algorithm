package rudghks373;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class bj2447 {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++)
				sol(i, j, num);
			bw.write("\n");
		}
		bw.close();
		sc.close();

	}

	public static void sol(int i, int j, int num) throws IOException {
		if ((i / num) % 3 == 1 && (j / num) % 3 == 1) {
			bw.write(" ");
		} else {
			if (num / 3 == 0)
				bw.write("*");
			else
				sol(i, j, num / 3);
		}
	}

}


/**
n �� 3^n �̸�
n = 3 �϶� n = 9 �϶� ��Ģ�� ã�� �� �� üũ
n = 3 (1,1) �� => (i / n ) == 1 || (j / n ) == 1�϶� ��
n = 9 i = 3,4,5 y=3,4,5  �� =>  (i / 3) % 3 == 1 || (j / 3) % 3  == 1 �϶� ��
**/