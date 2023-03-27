package week04;

import java.util.Scanner;

public class Ders7 {

	public static void main(String[] args) {

		double x1, y1, x2, y2;
		Scanner in = new Scanner(System.in);
		System.out.println("A noktası için değer girin.");
		System.out.print("X: ");
		x1 = in.nextDouble();
		System.out.println("A noktası için değer girin.");
		System.out.print("Y: ");
		y1 = in.nextDouble();
		System.out.println("B noktası için değer girin.");
		System.out.print("X: ");
		x2 = in.nextDouble();
		System.out.println("B noktası için değer girin.");
		System.out.print("Y: ");
		y2 = in.nextDouble();

		double mesafe = mesafeHesapla(x1, y1, x2, y2);

		System.out.print("(" + x1 + "," + y1 + ")" + " , " + "(" + x2 + "," + y2 + ")");
		System.out.print(" noktaları arasındaki mesafe: " + mesafe);

	}

	public static double mesafeHesapla(double x1, double y1, double x2, double y2) {

		double dx = x1 - x2;
		double dy = y1 - y2;

		double dKare = Math.pow(dx, 2) + Math.pow(dy, 2);
		double mesafe = Math.sqrt(dKare);

		return mesafe;
	}

}
