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
		MainDuka newDuka = new MainDuka();
		MainDataRapel newRapel = new MainDataRapel();
		MainAgama newAgama = new MainAgama();
		MainGuru newGuru = new MainGuru();
		MainUmum newUmum = new MainUmum();
		MainTunjangan newTunjangan = new MainTunjangan();
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
		System.out.println("| 13.Tabel Agama|  14. Tabel Guru       | 15. Tabel Umum        |  16.T Tunjangan |");
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
		}else if (input == 7){
			newDuka.mainMenu();
		}else if (input == 8){
			newRapel.mainMenu();
		}else if(input == 13) {
			newAgama.testqueryMencariNamaAgama();
		}else if (input == 14){
			newGuru.tesMencariKodeGuruDitabelGuru();
		}else if (input == 15){
			newUmum.getMencariTJUmumBerdasarkanKodeGolongan();	
		}else if (input == 16) {
			newTunjangan.mainMenu();
		}
		System.out.println("Maaf, inputan anda salah");
		menuUtama();
	}
}
