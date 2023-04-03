package week05;

import java.util.Scanner;

public class Ders1 {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		
		int sayi = inScanner.nextInt();
		
		if (sayi % 2 ==0) {
			System.out.println("Çift");
		}else {
			System.out.println("TEK");
		}
	}
}
