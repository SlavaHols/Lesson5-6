package lt.lhu.lesson05;

public class Task02Lesson5 {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c = 4;

		int longestNum = longestNum(a, b, c);
		System.out.println("Longest number : " + longestNum);
		int smallestNum = smallestNum(a, b, c);
		System.out.println("Smallest number : " + smallestNum);
		int sum = sum(longestNum, smallestNum);
		System.out.println("Summa :Longest number + Smallest number =  "+ sum);

	}

	public static int longestNum(int a, int b, int c) {
		int longNum = 0;
		if (a > b && a > c) {
			longNum = a;
		} else if (b > a && b > c) {
			longNum = b;
		} else if (a == b && a == c && b == c) {
			System.out.println("Numbers: a=b=c !");
		} else
			longNum = c;

		return longNum;
	}

	public static int smallestNum(int a, int b, int c) {
		int smallNum = 0;
		if (a < b && a < c) {
			smallNum = a;
		} else if (b < a && b < c) {
			smallNum = b;
		} else if (a == b && a == c && b == c) {
			System.out.println("Numbers: a=b=c !");
		} else
			smallNum = c;

		return smallNum;
	}

	public static int sum(int longestNum, int smalestNum) {
		int summ = longestNum + smalestNum;
		return summ;
	}
}
