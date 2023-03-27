package week04;

import java.util.Scanner;

public class Ders4 {

	public static void main(String[] args) {
		int sayi;

		Scanner in = new Scanner(System.in);

		sayi = in.nextInt();

		System.out.println("Sonuc: " + Math.sqrt(Math.log(Math.pow(sayi, 2))));
	}

}
