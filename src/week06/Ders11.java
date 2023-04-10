package week06;

public class Ders11 {

	public static String timeString(int saat, int dakika) {

		String dilim;
		if (saat < 12) {
			dilim = "ÖÖ";
			if (saat == 0) {
				saat = 12;
			}
		} else {
			dilim = "ÖS";
			if (saat > 12) {
				saat = saat - 12;
			}
		}
		String zaman = String.format("%2d:%2d - %s", saat, dakika, dilim);
		return zaman;
	}

	public static void main(String[] args) {

		int saat = 0, dakika = 0;

		while (saat < 24) {
			System.out.println(timeString(saat, dakika));
			dakika += 15;
			if (dakika == 60) {
				saat += 1;
				dakika = 0;
			}
		}

	}
}
