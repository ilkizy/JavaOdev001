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
		if (ifade.contains("b�l")) {
			x = sayi1.charAt(0);
			y = sayi1.charAt(1);
			int bol = x / y;
			System.out.println(bol);
		}
		if (ifade.contains("�arp")) {
			x = sayi1.charAt(0);
			y = sayi1.charAt(1);
			int carp = x * y;
			System.out.println(carp);
		}

	}

}
