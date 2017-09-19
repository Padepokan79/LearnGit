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
		MainSatker newSatker = new MainSatker();
		Maintwafat newWafat = new Maintwafat();
		MainHutang newHutang = new MainHutang();
		MainKeluarga newKeluarga = new MainKeluarga();
		MainSKPP newSKPP = new MainSKPP();
		Scanner in = new Scanner(System.in);
		
		System.out.println("+---------------------------------------------------------------------------------+");
		System.out.println("|                            Menu Utama                                           |");
		System.out.println("+---------------------------------------------------------------------------------+");
		System.out.println("| 1. Gaji       |  2. Satuan Kerja      | 3. Tabel Wafat        |  4. Hutang      |");
		System.out.println("+---------------------------------------------------------------------------------+");
		System.out.println("| 5. Keluarga   |  6. SKPP Pegawai      | 7. Uang duka          |  8. Data Rapel  |");
		System.out.println("+---------------------------------------------------------------------------------+");
		System.out.println("| 9. URT NIP    |  10. Historis Eselon  | 11. Detil Kekurangan  |  12. Pajak      |");
		System.out.println("+---------------------------------------------------------------------------------+");
		System.out.print("Pilihan : ");
		input = in.nextInt();
		
		if (input==1) {
			newGaji.mainMenu();
		}else if(input == 2) {
			newSatker.mainMenu();
		}else if( input == 3){
			newWafat.mainMenu();
		}else if(input == 4){
			newHutang.mainMenu();
		}else if (input == 5){
			newKeluarga.mainMenu();
		}else if  (input == 6){
			newSKPP.mainMenu();
		}
		{
			System.out.println("Maaf, inputan anda salah");
			menuUtama();
		}
	}

}
