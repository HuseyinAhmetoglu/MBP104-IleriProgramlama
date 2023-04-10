package week06;

public class Ders6 {

	public static void main(String[] args) {

		String adString = "Hüseyin";
		System.out.println(adString.charAt(0));
		System.out.println(adString.charAt(1));
		System.out.println(adString.charAt(2));

		for (int i = 0; i < adString.length(); i++) {
			System.out.print(adString.charAt(i));
			if (i != adString.length() - 1) {
				System.out.print("-");
			}
		}
	}
}
