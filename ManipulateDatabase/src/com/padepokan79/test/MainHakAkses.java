package com.padepokan79.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.Fgaji;
import com.padepokan79.model.HakAkses;
import com.padepokan79.model.InputVariable;

public class MainHakAkses extends InputVariable {

	static Scanner dataIn = new Scanner(System.in);
	static MainActivity ma=new MainActivity();

	//	public static void mainMenu () {//Modify by Ipin
	//
	//
	//		System.out.println("+----------------------------------------------------------------------------------------------------+");
	//		System.out.println("|                                      Submenu Gajih                                                 |");
	//		System.out.println("|----------------------------------------------------------------------------------------------------|");
	//		System.out.println("| 1. Nama dan Gaji Bersih         | 2. Nama dan Status Kawin         | 3. Nama laki -laki dan Jomblo |");
	//		System.out.println("|----------------------------------------------------------------------------------------------------|");
	//		System.out.println("| 4. Nama dan Gaji Bersih > 10 Jt | 5. Pegawai Usia antara 25 dan 35 | 6. Janda kembang              |");
	//		System.out.println("|----------------------------------------------------------------------------------------------------|");
	//		System.out.println("| 7. Super Dad                    |                                  | 0. Menu Utama                 |");
	//		System.out.println("+----------------------------------------------------------------------------------------------------+");
	//
	//		try {
	//			System.out.print("Masukan PIlihan : ");
	//			String input=dataIn.next();
	//			switch (input) {
	//			case "1":
	//				;
	//				break;
	//			case "2":
	//				testNamaDanStatusKawin();
	//				break;
	//			case "3":
	//				testNamaDanLakiJomblo();
	//				break;
	//			case "0":
	//				ma.menuUtama();
	//				break;
	//			default:
	//				System.out.println("Masukan anda tidak valid !");
	//			}
	//
	//		} catch (Exception e) {
	//			System.out.println("Exception Print !");
	//			System.out.println(e.getMessage());
	//		}
	//
	//	}
	//
	//	public static void backto()  {
	//		String inp;
	//		System.out.print("1. Menu Utama 2. Submenu Gajih  : ");
	//		try {
	//			inp=dataIn.readLine();
	//			switch (inp) {
	//			case "1":
	//				ma.menuUtama();;
	//				break;
	//			case "2":
	//				mainMenu();
	//				break;
	//			default:
	//				System.out.println("Masukan Salah !");
	//			}
	//		}catch (Exception e) {
	//			System.out.println(e.getMessage());
	//		}
	//	}

	public static void tesMenghitungJumlahHakAksesBerdasarkanPemakai(){
		HakAkses hakakses = new HakAkses();
		JSONArray data = hakakses.getqueryMenghitungJumlahHakAksesBerdasarkanPemakai();
		showData(data,"pemakai","jumlah_hak_akses");
	}
	public static void showData(JSONArray arrayData,String pa, String pb) {
		System.out.println("+-------------------------------------------------+");
		System.out.println("|   Nama                            |  Status     |");
		System.out.println("+-------------------------------------------------+");
	}
	public  Scanner sc=new Scanner( System.in );
	//KodeGuru, NamaGuru,
	public  void tesMencariKodeGuruDitabelGuru(){
		Guru guru = new Guru();
		try {
			System.out.print("Masukan Kode Guru 1 s.d 17 : ");
			inputKode = sc.nextInt();
			JSONArray data = guru.getqueryMencariKodeGurudiTabelGuruTBL();
			showData_skpp(data,"kodeguru","namaguru");
		}catch (Exception e) {
			System.out.println("Inputan Salah");
			System.out.println(e.getMessage());
		}
	}

	public  void showData_skpp(JSONArray arrayData, String pa, String pb) {
		//System.out.println(arrayData);
		System.out.println("+--------------------------------------------------+");
		System.out.println("|                KodeGuru             |  NamaGuru  |");
		System.out.println("+--------------------------------------------------+");

		String space;
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	

			System.out.print("|   "+obj.get(pa)+"    |");

			space = (String) obj.get(pb);
			space=space.trim();
			System.out.print(" "+space);
			for (int j = 0; j  <25-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.println(" |");
			System.out.println("+--------------------------------------+");
		}
		//		backto();
	}

	public static void main(String args[]) {
		MainHakAkses md=new MainHakAkses();
		md.tesMenghitungJumlahHakAksesBerdasarkanPemakai();
	}


}
