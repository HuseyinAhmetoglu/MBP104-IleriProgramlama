package week03;

public class Ders6 {

	public static void main(String[] args) {

		final double PI = 3.14159;
		int r = 12;

		int alan = (int) PI * r * r;

		System.out.println(alan);

		String metin = "12";

		// int sayi = (int) metin;

		int sayi = Integer.parseInt(metin);

		System.out.println(sayi * sayi);

	}

}
