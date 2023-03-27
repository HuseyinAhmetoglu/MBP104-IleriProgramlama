package week04;

import java.util.Scanner;

public class Ders5 {

	public static void main(String[] args) {
		int sayi;

		Scanner in = new Scanner(System.in);

		sayi = in.nextInt();

		double sonuc = Math.sqrt(Math.log(Math.pow(sayi, 2)));

		System.out.println("Sonuc: " + sonuc);
	}

}
