package week04;

import java.util.Scanner;

public class Ders6 {

	public static void main(String[] args) {

		double sayi;

		Scanner in = new Scanner(System.in);

		sayi = in.nextDouble();

		System.out.println("Alan: " + daireAlanHesapla(sayi));

	}

	public static double daireAlanHesapla(double yariCap) {
		double alan = Math.PI * Math.pow(yariCap, 2);
		return alan;
	}

}
