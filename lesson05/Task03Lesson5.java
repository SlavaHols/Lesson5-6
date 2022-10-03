package lt.lhu.lesson05;

public class Task03Lesson5 {
	public static void main(String[] args) {
		int a = 26;
		int b = 325;
		int c = amountNumA(a);
		int d = amountNumB(b);
		if (c < d) {
			System.out.println("V chisle B cifr bolshe");
		} else if (c == d) {
			System.out.println("V chislah A and B colichestvo cifr ravno");
		} else {
			System.out.println("V chisle A cifr bolshe");
		}
	}

	public static int amountNumA(int a) {
		int count = 0;
		while (a != 0) {
			a = a / 10;
			count++;
		}
		return count;
	}

	public static int amountNumB(int b) {
		int count = 0;
		while (b != 0) {
			b = b / 10;
			count++;
		}
		return count;
	}
}
