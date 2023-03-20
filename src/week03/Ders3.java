package week03;

import java.util.Scanner;

public class Ders3 {

	public static void main(String[] args) {

		int inch;
		double cm;
		final double cmPerInch = 2.54;

		Scanner in = new Scanner(System.in);

		System.out.print("INCH değerini girin: ");
		inch = in.nextInt();

		cm = inch * cmPerInch;

		System.out.println(inch + " inch = " + cm + " cm");

	}

}
