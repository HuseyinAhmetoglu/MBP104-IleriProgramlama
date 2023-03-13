package week02;

public class Ders6 {
	public static void main(String[] args) {

		// double pi = 3;

		// System.out.println(pi);

		int saat = 10;
		int dakika = 5;

		System.out.println("Şuan saat " + saat + ":" + dakika + " ÖÖ");

		int gecenDakika = (saat * 60) + dakika;

		System.out.println("Gece yarısından bu zamana kadar " + gecenDakika + " dakika geçmiş.");

		// double yuzde = ((double) gecenDakika / (24 * 60)) * 100;

		double yuzde = (gecenDakika / (24.0 * 60)) * 100;

		System.out.println("Günün %" + yuzde + " bitti.");

	}

}
