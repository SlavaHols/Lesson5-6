package lt.lhu.lesson05;

import java.util.Scanner;

public class Task01Lesson6 {
	public static void main(String[] args) {
		double x;
		double y;
		double z;
		double nodXY;
		double nodXZ;
		double nodYZ;

		x = scxyz();
		y = scxyz();
		z = scxyz();

		nodXY = nodxy(x, y);
		nodXZ = nodxz(x, z);
		nodYZ = nodyz(y, z);
		sravnenie(nodXY, nodXZ, nodYZ);
		System.out.println("Numbers x, y, z : " + x + ", " + y + "," + z + ".");
	}

	public static double scxyz() {
		double num = 0;
		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("You enter wrong number. Try again :");
		}
		num = sc.nextDouble();

		return num;

	}

	public static double nodxy(double x, double y) {
		double nod = 0;
		for (double i = 1; i <= x && i <= y; i++) {
			if (x % i == 0 && y % i == 0) {
				nod++;
			}
		}
		return nod;
	}

	public static double nodxz(double x, double z) {
		double nod = 0;
		for (double i = 1; i <= x && i <= z; i++) {
			if (x % i == 0 && z % i == 0) {
				nod++;
			}
		}
		return nod;
	}

	public static double nodyz(double y, double z) {
		double nod = 0;
		for (double i = 1; i <= y && i <= z; i++) {
			if (y % i == 0 && z % i == 0) {
				nod++;
			}
		}
		return nod;
	}

	public static void sravnenie(double nodXY, double nodXZ, double nodYZ) {
		if (nodXY == 1 && nodXZ == 1 && nodYZ == 1) {
			System.out.println("Numbers x, y, z - relatively prime numbers!");

		} else {
			System.out.println("Numbers x, y, z - Norelatively prime numbers!");
		}
	}

}
