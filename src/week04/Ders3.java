package week04;

import java.util.Scanner;

public class Ders3 {

	public static void main(String[] args) {
		int sayi;

		Scanner in = new Scanner(System.in);

		sayi = in.nextInt();

		System.out.println("karesi: " + Math.pow(sayi, 2));
		System.out.println("karekökü: " + Math.sqrt(sayi));
		System.out.println("sin: " + Math.sin(sayi));
		System.out.println("log: " + Math.log(sayi));

	}

}
