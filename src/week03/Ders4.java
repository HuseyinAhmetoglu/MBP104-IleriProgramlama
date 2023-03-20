package week03;

import java.util.Scanner;

public class Ders4 {

	public static void main(String[] args) {

		int zam;
		int maas;
		double yeniMaas;
		final int VERGI = 10;

		Scanner in = new Scanner(System.in);

		System.out.print("Maaşı girin: ");
		maas = in.nextInt();

		System.out.print("Zam oranını girin: ");
		zam = in.nextInt();

		yeniMaas = maas + ((double) maas * zam) / 100;
		yeniMaas = yeniMaas - ((double) yeniMaas * VERGI) / 100;

		System.out.println("Yeni maaş: " + yeniMaas);

	}

}
