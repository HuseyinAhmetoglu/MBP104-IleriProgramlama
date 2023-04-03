package week05;

import java.util.Scanner;

public class Ders3 {

	public static boolean ciftMi(int sayi) {
		if (sayi % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);

		int sayi = inScanner.nextInt();

		if (ciftMi(sayi)) {
			System.out.println("ÇİFT");
		} else {
			System.out.println("TEK");
		}

	}
}
