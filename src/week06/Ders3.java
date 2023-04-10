package week06;

import java.util.Scanner;

public class Ders3 {

	public static void main(String[] args) {

		Scanner inScanner = new Scanner(System.in);

		int n;

		while (true) {
			n = inScanner.nextInt();
			if (n == -1) {
				System.out.println("Görüşürüz!");
				break;
			}
			System.out.println("Selam!");
		}
	}
}
