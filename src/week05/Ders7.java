package week05;

import java.util.Scanner;

public class Ders7 {

	public static void main(String[] args) {

		Scanner inScanner = new Scanner(System.in);
		System.out.print("Bir sayı girin: ");

		// doğrulama

		if (!inScanner.hasNextDouble()) {
			String metinString = inScanner.next();
			System.err.println(metinString + " bir sayı değildir!");
			System.err.println("Program sonlandı!");
			return;
		}

		// hesapla

		double sayi = inScanner.nextDouble();
		if (sayi > 0) {
			System.out.print(sayi + " sayısının logaritması: ");
			System.out.printf("%.2f", Math.log(sayi));
		} else {
			System.out.println("Sayı pozitif değil!!!");
		}

	}
}
