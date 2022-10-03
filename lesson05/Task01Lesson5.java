package lt.lhu.lesson05;

public class Task01Lesson5 {
	public static void main(String[] args) {
		double a = 20;
		double b = 16;
		double nod = nOd(a, b);
		double ab = proizv(a, b);
		double nok = nOk(nod,ab);
		System.out.println("NOD = "+ nod);
		System.out.println("NOK = "+ nok);

	}

	public static double nOd(double a, double b) {
		double count = 0;
		for (double i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				count = i;
			}
		}
		return count;
	}

	public static double proizv(double a, double b) {
		double ab = a * b;
		return ab;
	}
	public static double nOk(double nod, double ab) {
		double nok = ab/nod;
		return nok;
	}
}
