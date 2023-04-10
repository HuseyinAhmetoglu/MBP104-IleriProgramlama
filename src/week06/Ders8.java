package week06;

public class Ders8 {

	public static void main(String[] args) {

		String adString = "Hüseyin Ahmetoğlu";
		System.out.println(adString.length());
		System.out.println(adString.charAt(adString.length() - 1));

		System.out.println(adString.indexOf('e'));
		System.out.println(adString.indexOf('e', 4));

		System.out.println(adString.substring(4, 7));
		System.out.println(adString.substring(8));

	}
}
