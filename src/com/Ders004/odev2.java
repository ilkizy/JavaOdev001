package com.Ders004;

import java.util.Scanner;

public class odev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1- (Kolay) 5 ile 7 nin toplamý nedir? 2- (Kolay) iki sayým var biri 9 diðer 2 bunlarýn çarpýmý nedir? 3-(Zor) iki
		 * sayý 124 ile 458 sayýlarýnýn çarpýmý nedir?
		 * 
		 * bunlar birer string ifadedir. bunlarý kullanýcýdan alýcaz. kolay olanlarda sadece rakamlar olacak (0-9 arasý) temel
		 * iþlemlerimiz (topla, fark, çarp, böl) iþlemin sonucunu yazdýran program.
		 * 
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Yapmak itediðiniz iþlemi yazýn.");
		String ifade = input.nextLine();
		String sayi1;
		char x = 0;
		char y = 0;
		sayi1 = ifade.replaceAll("[^0-9]", "");

		if (ifade.contains("topla")) {
			x = sayi1.charAt(0);
			y = sayi1.charAt(1);
			int a = Character.valueOf(x);
			int b = Character.valueOf(y);
			int topla = x + y;
			System.out.println(a);
			System.out.println(b);
			System.out.println(a + b);
		}
		if (ifade.contains("fark")) {
			x = sayi1.charAt(0);
			y = sayi1.charAt(1);
			int fark = x - y;
			System.out.println(fark);
		}
		if (ifade.contains("böl")) {
			x = sayi1.charAt(0);
			y = sayi1.charAt(1);
			int bol = x / y;
			System.out.println(bol);
		}
		if (ifade.contains("çarp")) {
			x = sayi1.charAt(0);
			y = sayi1.charAt(1);
			int carp = x * y;
			System.out.println(carp);
		}

	}

}
