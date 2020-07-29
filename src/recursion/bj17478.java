package rudghks373.recursion;

import java.util.Scanner;

public class bj17478 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.close();
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		sol(0, count);
	}

	public static void sol(int num, int count) {

		String underBar = "";
		String str[] = new String[6];
		str[0] = "\"����Լ��� ������?\"";
		str[1] = "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.";
		str[2] = "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.";
		str[3] = "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"";
		str[4] = "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"";
		str[5] = "��� �亯�Ͽ���.";

		if (num >= 1) {
			underBar = "____";
			for (int i = 1; i < num; i++) {
				underBar += "____";
			}
		}

		if (num < 1) {
			System.out.println(str[0]);
			System.out.println(str[1]);
			System.out.println(str[2]);
			System.out.println(str[3]);
		}
		if (num >= 1 && num < count) {
			System.out.println(underBar + str[0]);
			System.out.println(underBar + str[1]);
			System.out.println(underBar + str[2]);
			System.out.println(underBar + str[3]);
		}
		if (num == count) {
			System.out.println(underBar + str[0]);
			System.out.println(underBar + str[4]);
			System.out.println(underBar + str[5]);
			return;
		}
		sol(num + 1, count);
		System.out.println(underBar + str[5]);
	}
}
