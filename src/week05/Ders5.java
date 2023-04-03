package week05;

import java.util.Scanner;

public class Ders5 {

	public static void main(String[] args) {

		Scanner inScanner = new Scanner(System.in);

		double sayi;

		if (inScanner.hasNextDouble()) {
			sayi = inScanner.nextDouble();
			System.out.println(sayi);
		}

	}
}
