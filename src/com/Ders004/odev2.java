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
		int sayi1 = 0;
		int sayi2 = 0;

		for (int i = 0; i <= ifade.length();) {
			sayi2 = sayi1;
			if (ifade.contains("i")) {

				sayi1 = i;
				i++;
			} else {
				i++;
			}
		}
		if (ifade.contains("topla")) {
			int topla = sayi1 + sayi2;
			System.out.println(topla);
		}
		if (ifade.contains("fark")) {
			int fark = sayi1 - sayi2;
			System.out.println(fark);
		}
		if (ifade.contains("böl")) {
			int bol = sayi1 / sayi2;
			System.out.println(bol);
		}
		if (ifade.contains("çarp")) {
			int carp = sayi1 * sayi2;
			System.out.println(carp);
		}

	}

}
