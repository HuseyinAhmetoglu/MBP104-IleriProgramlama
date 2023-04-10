package week06;

import java.util.Scanner;

public class Ders9 {

	public static void main(String[] args) {

		Scanner inScanner = new Scanner(System.in);

		System.out.println("Tekrar oynayalım mı?");
		String cevapString = inScanner.nextLine();

//		if (cevapString == "evet") {
//			System.out.println("Hadi başlayalım!");
//		} else {
//			System.out.println("Görüşürüz!");
//		}

		if (cevapString.equals("evet")) {
			System.out.println("Hadi başlayalım!");
		} else {
			System.out.println("Görüşürüz!");
		}

	}
}
