package inttoeng;

import java.util.Scanner;

public class IntToEng {
	// メインメソッド
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		System.out.println(translateEng(input));

	}

	// 数値を英訳する変換するメソッド
	static String translateEng(int n) {
		String eng = "";
		if (n / 10 == 0) {
			eng = oneDigit(n);
		} else if (n / 10 == 1) {
			eng = teen(n);
		} else if (n / 10 > 1 && n / 10 <= 9) {
			eng = twoDigit(n) + " " + oneDigit(n % 10);
		} else if (n / 10 == 10) {
			eng = oneDigit(n / 100) + " hundred";
		}
		return eng;
	}

	// 1桁のやつ
	static String oneDigit(int n) {
		String eng = "";
		switch (n) {
		case 0:
			eng = "zero";
			break;
		case 1:
			eng = "one";
			break;
		case 2:
			eng = "two";
			break;
		case 3:
			eng = "three";
			break;
		case 4:
			eng = "four";
			break;
		case 5:
			eng = "five";
			break;
		case 6:
			eng = "six";
			break;
		case 7:
			eng = "seven";
			break;
		case 8:
			eng = "eight";
			break;
		case 9:
			eng = "nine";
			break;

		}
		return eng;
	}

	// 10~19のやつ
	static String teen(int n) {
		String eng = "";
		switch (n % 10) {
		case 0:
			eng = "ten";
			break;
		case 1:
			eng = "eleven";
			break;
		case 2:
			eng = "twelve";
			break;
		case 3:
			eng = "thirteen";
			break;
		case 4:
			eng = "fourteen";
			break;
		case 5:
			eng = "fifteen";
			break;
		case 6:
			eng = "sixteen";
			break;
		case 7:
			eng = "seventeen";
			break;
		case 8:
			eng = "eighteen";
			break;
		case 9:
			eng = "nineteen";
			break;

		}
		return eng;
	}

	// 2桁のやつ
	static String twoDigit(int n) {
		String eng = "";
		switch (n / 10) {
		/*
		 * case 1: eng = "ten"; break;
		 */
		case 2:
			eng = "twenty";
			break;
		case 3:
			eng = "thirty";
			break;
		case 4:
			eng = "forty";
			break;
		case 5:
			eng = "fifty";
			break;
		case 6:
			eng = "sixty";
			break;
		case 7:
			eng = "seventy";
			break;
		case 8:
			eng = "eighty";
			break;
		case 9:
			eng = "ninety";
			break;
		}
		return eng;
	}
}
