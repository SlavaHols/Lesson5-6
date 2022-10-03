package lt.lhu.lesson05;

import java.util.Random;

public class Task05Lesson6 {
	public static void main(String[] args) {
		int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
		num1 = randNum();
		System.out.println("num1 = "+ num1);
		num2 = randNum();
		System.out.println("num2 = "+ num2);
		num3 = randNum();
		System.out.println("num3 = "+ num3);
		num4 = randNum();
		System.out.println("num4 = "+ num4);
		num5 = randNum();
		System.out.println("num5 = "+ num5);
		num6 = randNum();
		System.out.println("num6 = "+ num6);
		num7 = randNum();
		System.out.println("num7 = "+ num7);
		num8 = randNum();
		System.out.println("num8 = "+ num8);
		num9 = randNum();
		System.out.println("num9 = "+ num9);
		num10 = randNum();
		System.out.println("num10 = "+ num10);
		System.out.println("|||||||||||||||||");

		int sum123 = sum123(num1, num2, num3);
		System.out.println("sum123 = "+ sum123);
		int sum234 = sum234(num2, num3, num4);
		System.out.println("sum234 = "+ sum234);
		int sum345 = sum345(num3, num4, num5);
		System.out.println("sum345 = "+ sum345);
		int sum456 = sum456(num4, num5, num6);
		System.out.println("sum456 = "+ sum456);
		int sum567 = sum567(num5, num6, num7);
		System.out.println("sum567 = "+ sum567);
		int sum678 = sum678(num6, num7, num8);
		System.out.println("sum678 = "+ sum678);
		int sum789 = sum789(num7, num8, num9);
		System.out.println("sum789 = "+ sum789);
		int sum8910 = sum8910(num8, num9, num10);
		System.out.println("sum8910 = "+ sum8910);
		

		if (sum123 == 10) {
			System.out.println("Cangrutulation!!!! The castle open. ");
		} else if (sum234 == 10) {
			System.out.println("Cangrutulation!!!! The castle open. ");
		} else if (sum345 == 10) {
			System.out.println("Cangrutulation!!!! The castle open. ");
		} else if (sum456 == 10) {
			System.out.println("Cangrutulation!!!! The castle open. ");
		} else if (sum567 == 10) {
			System.out.println("Cangrutulation!!!! The castle open. ");
		} else if (sum678 == 10) {
			System.out.println("Cangrutulation!!!! The castle open. ");
		} else if (sum789 == 10) {
			System.out.println("Cangrutulation!!!! The castle open. ");
		} else if (sum8910 == 10) {
			System.out.println("Cangrutulation!!!! The castle open. ");
		} else
			System.out.println("The castle is closed.");

	}

	public static int randNum() {
		int randNum = 0;
		Random num = new Random();
		randNum = num.nextInt(1,7);
	
		return randNum;
	}

	public static int sum123(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		return sum;
	}

	public static int sum234(int num2, int num3, int num4) {
		int sum = num2 + num3 + num4;
		return sum;
	}

	public static int sum345(int num3, int num4, int num5) {
		int sum = num3 + num4 + num5;
		return sum;
	}

	public static int sum456(int num4, int num5, int num6) {
		int sum = num4 + num5 + num6;
		return sum;
	}

	public static int sum567(int num5, int num6, int num7) {
		int sum = num5 + num6 + num7;
		return sum;
	}

	public static int sum678(int num6, int num7, int num8) {
		int sum = num6 + num7 + num8;
		return sum;
	}

	public static int sum789(int num7, int num8, int num9) {
		int sum = num7 + num8 + num9;
		return sum;
	}

	public static int sum8910(int num8, int num9, int num10) {
		int sum = num8 + num9 + num10;
		return sum;
	}

}
