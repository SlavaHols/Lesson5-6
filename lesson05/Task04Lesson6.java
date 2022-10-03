package lt.lhu.lesson05;

import java.util.Random;

public class Task04Lesson6 {
	public static void main(String[] args) {
		int[] mas = new int[7];
		init(mas);
		int sum123 = sum123(mas);
		int sum345 = sum345(mas);
		int sum456 = sum456(mas);
		summers(sum123, sum345, sum456);
	}

	public static void init(int[] ar) {
		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(100);
		}
	}

	public static int sum123(int mas[]) {
		int sum = 0;
		for (int i = 1; i <= 3; i++) {
			sum = sum + mas[i];
		}
		return sum;
	}

	public static int sum345(int mas[]) {
		int sum = 0;
		for (int i = 3; i <= 5; i++) {
			sum = sum + mas[i];
		}
		return sum;
	}

	public static int sum456(int mas[]) {
		int sum = 0;
		for (int i = 4; i <= 6; i++) {
			sum = sum + mas[i];
		}
		return sum;
	}

	public static void summers(int sum123, int sum345, int sum456) {
		System.out.println("D[1]+D[2]+D[3] = " + sum123);
		System.out.println("D[3]+D[4]+D[5] = " + sum345);
		System.out.println("D[4]+D[5]+D[6] = " + sum456);
	}
}
