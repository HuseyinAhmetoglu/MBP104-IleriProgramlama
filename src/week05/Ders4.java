package week05;

import java.util.Scanner;

public class Ders4 {

	public static boolean rakamMi(int sayi) {
		if (sayi > -1 && sayi < 10) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);

		int sayi = inScanner.nextInt();

		if (rakamMi(sayi)) {
			System.out.println("Rakam");
		} else {
			System.out.println("Rakam değil!");
		}

	}
}
