package com.Ders004;

import java.util.Scanner;

public class odev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1- (Kolay) 5 ile 7 nin toplam� nedir? 2- (Kolay) iki say�m var biri 9 di�er 2 bunlar�n �arp�m� nedir? 3-(Zor) iki
		 * say� 124 ile 458 say�lar�n�n �arp�m� nedir?
		 * 
		 * bunlar birer string ifadedir. bunlar� kullan�c�dan al�caz. kolay olanlarda sadece rakamlar olacak (0-9 aras�) temel
		 * i�lemlerimiz (topla, fark, �arp, b�l) i�lemin sonucunu yazd�ran program.
		 * 
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Yapmak itedi�iniz i�lemi yaz�n.");
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
		if (ifade.contains("b�l")) {
			int bol = sayi1 / sayi2;
			System.out.println(bol);
		}
		if (ifade.contains("�arp")) {
			int carp = sayi1 * sayi2;
			System.out.println(carp);
		}

	}

}
