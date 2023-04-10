package week06;

public class Ders7 {

	public static void main(String[] args) {

		char ch = 'a';

		System.out.println(ch);
		System.out.println((int) ch);

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print((int) i + ", ");
		}

		System.out.println();

		int sayi = 99999;

		System.out.println((char) sayi);
	}
}
