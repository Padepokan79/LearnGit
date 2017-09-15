package com.padepokan79.test;

import java.util.Scanner;
public class MainActivity {

	public static void main(String[] args) {
		menuUtama();
	}
	// Editing By Sandi
	
	
	public static void menuUtama() {
		int input;
		FGajiMenu newGaji = new FGajiMenu();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("+--------------------------------------------------------------------+");
		System.out.println("|                            Menu Utama                              |");
		System.out.println("+--------------------------------------------------------------------+");
		System.out.println("|    1. Pegawai    |    2. Gaji    |  3. Tunjangan  |    4. Jabatan  |");
		System.out.println("+--------------------------------------------------------------------+");
		System.out.print("Pilihan : ");
		input = in.nextInt();
		
		if (input==1) {
			newGaji.mainMenu();
		}else {
			System.out.println("Maaf, inputan anda salah");
			menuUtama();
		}
	}

}
