package week02;

public class Ders3 {
	public static void main(String[] args) {

		int saat = 10;
		int dakika = 5;

		System.out.println("Şuan saat " + saat + ":" + dakika + " ÖÖ");

		int gecenDakika = (saat * 60) + dakika;

		System.out.println("Gece yarısından bu zamana kadar " + gecenDakika + " dakika geçmiş.");

		System.out.println("Günün %" + ((gecenDakika * 100 / (24 * 60))) + " bitti.");

	}

}
