package week04;

import java.util.Scanner;

public class Ders2 {

	public static void main(String[] args) {
		String ad;
		Scanner klavye = new Scanner(System.in);
		System.out.print("Adınızı girin: ");
		ad = klavye.nextLine();
		selam(ad);
		int saat = 3;
		int dakika = 49;
		zaman((saat + 12), 56);

	}

	public static void selam(String ad) {
		System.out.println("Merhaba " + ad);
	}

	public static void zaman(int saat, int dakika) {
		System.out.println(saat + ":" + dakika);
	}

}
