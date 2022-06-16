package com.Ders004;

import java.util.Scanner;

public class odev1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Kullan�c� istedi�i uzunlukta bir de�er girebilir ve bu kare ona g�re �izilir. (tek say� olsun) . . . . . . . . . . .
		 * . * . . . . . . . . . . . .
		 *
		 * 8 4 6 2 Hareket i�in bu rakamlar kullan�lacak. Mesela kullan�c� 6y� se�erse, . . . . . . . . . . . . . * . . . . . .
		 * . . . . . Kurallar -> hareket asla kesilmeyecek. Y�ld�z karenin s�n�r�na ula�t���nda ba�a d�ner.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Bir tek say� girin.");
		int value = input.nextInt();
		int location = (((value * value) / 2) + 1);
		int drc;
		do {
			for (int i = 1; i <= (value * value); i++) {
				if (i == location) {
					System.out.print(" *");
				} else {
					System.out.print(" .");
				}
				if (i % value == 0)
					System.out.println();
			}
			System.out.println("Karakteri hangi y�ne g�t�rmek istersiniz?");
			System.out.println("  8  ");
			System.out.println("4   6");
			System.out.println("  2  ");

			drc = input.nextInt();

			switch (drc) {
			case 2:
				if (location > (value * (value - 1))) {
					location = location - (value * (value - 1));
				} else {
					location = location + value;
				}
				break;
			case 4:
				if (location % value == 1) {
					location = location + (value - 1);
				} else {
					location = location - 1;
				}
				break;
			case 6:
				if (location % value == 0) {
					location = location - (value - 1);
				} else {
					location = location + 1;
				}
				break;
			case 8:
				if (location < (value)) {
					location = location + (value * (value - 1));
				} else {
					location = location - value;
				}
				break;
			default:
				break;
			}

		} while (drc != 0);
	}
}
