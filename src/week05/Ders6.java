package week05;

import java.util.Scanner;

public class Ders6 {

	public static void main(String[] args) {

		Scanner inScanner = new Scanner(System.in);

		String metin;

		if (!inScanner.hasNextDouble()) {
			metin = inScanner.next();
			System.out.println(metin);
		}

	}
}
