package week03;

import java.util.Scanner;

public class Ders8 {

	public static void main(String[] args) {

		String ad;
		int yas;

		Scanner in = new Scanner(System.in);

		System.out.print("Adınızı girin: ");
		ad = in.nextLine();

		System.out.print("Yaşınızı girin: ");
		yas = in.nextInt();

		System.out.println("Selam " + ad + ", " + yas + " yaşındasın.");

	}

}
