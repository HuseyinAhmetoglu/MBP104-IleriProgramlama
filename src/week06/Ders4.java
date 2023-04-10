package week06;

import java.util.Scanner;

public class Ders4 {

	public static void main(String[] args) {

		Scanner inScanner = new Scanner(System.in);

		int n = inScanner.nextInt();

		while (n != 1) {
			System.out.print(n + " ");
			if (n % 2 == 0) {
				n /= 2; // n = n / 2
			} else {
				n = 3 * n + 1;
			}
		}
	}
}
