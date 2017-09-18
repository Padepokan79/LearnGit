package com.padepokan79.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.Hutang;

public class MainHutang {
	static BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
	static MainActivity ma=new MainActivity();

	public static void mainMenu () {//Modify by Ipin

		System.out.println("+----------------------------------------------------------------------------------------------------------+");
		System.out.println("|                                      Submenu Satuan Kerja                                                |");
		System.out.println("|----------------------------------------------------------------------------------------------------------|");
		System.out.println("| 1. Nama Operator dengan Akhiran H | 2. Nama Atasan bergelar Drs.dan Menjadi camat | 3. Kepala Dinas Haji |");
		System.out.println("|----------------------------------------------------------------------------------------------------------|");
		System.out.println("| 4. Pegawai Dinas Kesehatan        | 5. Bendahara Pendaftran Haji                  | 0. Menu Utama        |");
		System.out.println("+----------------------------------------------------------------------------------------------------------+");
		
		try {
			System.out.print("Masukan PIlihan : ");
			String input=dataIn.readLine();
			switch (input) {
			case "1":
				//namaOperatorDenganAkhiranH();
				break;
			case "2":
				//getqueryNamaAtasanDRSDanJabatanCamat();
				break;
			case "3":
				//kepalaDinasHaji();
				break;
			case "4":
				//JumlahPegawaiYangKerjaDiDinasKesehatan();
				break;
			case "5":
				//testBendaharaPembantuDaftarGaji();
				break;
			case "0":
				ma.menuUtama();
				break;
			default:
				System.out.println("Masukan anda tidak valid !");
			}
			
		} catch (Exception e) {
			System.out.println("Exception Print !");
			System.out.println(e.getMessage());
		}
		
	}

	public static void backto()  {
		String inp;
		System.out.print("1. Menu Utama 2. Submenu Satuan Kerja  : ");
		try {
			inp=dataIn.readLine();
			switch (inp) {
			case "1":
				ma.menuUtama();;
				break;
			case "2":
				mainMenu();
				break;
			default:
				System.out.println("Masukan Salah !");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void getqueryNamaPegawaiYangMempunyaiHutangLebihDari10JtJumlahCicilanlebihdari1Tahun(){
		Hutang hutang = new Hutang();
		JSONArray data = hutang.getqueryNamaPegawaiYangMempunyaiHutangLebihDari10JtJumlahCicilanlebihdari1Tahun();
		//System.out.println(data);
		showData4Parameter(data,"nip", "nama", "jumlah_hutang","jmlbulan");
	} // ikan added test for NamaDanGajiBersih
	public static void showData4Parameter(JSONArray arrayData,String fielda, String fieldb, String fieldc, String fieldd) {
		//System.out.println(arrayData);
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("|            NIP           |            Nama          |  Jumlah Hutang   | Jumlah Bulan | ");
		System.out.println("+---------------------------------------------------------------------------------------+");
		String space;
		
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	
			
			space=(String) obj.get(fielda);
			space = space.trim();
			System.out.print("|"+space);
			for (int j = 0; j  <26-(space.length()); j++) {
				System.out.print(" ");
			}
			
			space=(String) obj.get(fieldb);
			space = space.trim();
			System.out.print("|"+space);
			for (int j = 0; j  <26-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.print(obj.get(fieldc));
			for (int j = 0; j  <25-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.print("|");
			space = space.trim();
			System.out.print(obj.get(fieldd));
			for (int j = 0; j  <27-(space.length()); j++) {
				System.out.print(" ");
			}
			
			System.out.println("|");
			space = space.trim();
			for (int j = 0; j  <10-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.println("+----------------------------------------------------------------------------------------+");
		}
	}	
	
}
