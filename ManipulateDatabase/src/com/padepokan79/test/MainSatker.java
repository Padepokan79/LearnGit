package com.padepokan79.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.Fgaji;
import com.padepokan79.model.Satker;

public class MainSatker {
	static BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
	static MainActivity ma=new MainActivity();

	public static void mainMenu () {//Modify by Ipin

		System.out.println("+----------------------------------------------------------------------------------------------------+");
		System.out.println("|                                      Submenu Gajih                                                 |");
		System.out.println("|----------------------------------------------------------------------------------------------------|");
		System.out.println("| 1. Nama dan Gaji Bersih         | 2. Nama dan Status Kawin         | 3. Nama laki -laki dan Jomblo |");
		System.out.println("|----------------------------------------------------------------------------------------------------|");
		System.out.println("| 4. Nama dan Gaji Bersih > 10 Jt | 5. Pegawai Usia antara 25 dan 35 | 6. Janda kembang              |");
		System.out.println("|----------------------------------------------------------------------------------------------------|");
		System.out.println("| 7. Super Dad                    |                                  | 0. Menu Utama                 |");
		System.out.println("+----------------------------------------------------------------------------------------------------+");
		
//		try {
//			System.out.print("Masukan PIlihan : ");
//			String input=dataIn.readLine();
//			switch (input) {
//			case "1":
//				testNamaDanGajiBersih();
//				break;
//			case "2":
//				testNamaDanStatusKawin();
//				break;
//			case "3":
//				testNamaDanLakiJomblo();
//				break;
//			case "4":
//				NipNamaGajiBersihDiAtas10Jt();
//				break;
//			case "5":
//				usiaAntara25Dan35();
//				break;
//			case "6":
//				getNamaJandaKembang();
//				break;
//			case "7":
//				namaSuperDad();
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
	}

	public static void backto()  {
		String inp;
		System.out.print("1. Menu Utama 2. Submenu Gajih  : ");
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
	
	public static void namaOperatorDenganAkhiranH(){
		Satker satKerja=new Satker();
		JSONArray data = satKerja.getqueryNamaOperatorDenganAkhiranH();
		showData(data,"nama_operator","satuan_kerja","kota","deskripsi");
	}

	//SATKERJA , DESCSATKER , Kota, nama_opera
	private static void showData(JSONArray arrayData, String fieldsa, String fieldsb, String fieldsc,String fieldsd) {
		System.out.println("+----------------------------------------------------------------------------------------------------+");
		System.out.println("|   Nama Operator           | Satuan Kerja |  Kota     |                 Deskripsi                   |");
		System.out.println("+----------------------------------------------------------------------------------------------------+");
		//System.out.println(arrayData);

		for (int i = 0; i < arrayData.length(); i++) {//modify by Ipin
			JSONObject obj =  arrayData.getJSONObject(i);
			String space=(String) obj.get(fieldsa);
			space=space.trim();
			System.out.print("| "+space);
			for (int j = 0; j <26-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.print("|      "+ obj.get(fieldsb)+"     ");
			String tmp=(String)obj.get(fieldsb);
			if(tmp.length()<3)
				System.out.print(" ");
			System.out.print("| "+obj.get(fieldsc));
			tmp=(String)obj.get(fieldsc);
			if(tmp.length()<9)
				System.out.print(" ");
			System.out.print(" | "+obj.get(fieldsd));
			if(tmp.length()<3)
				System.out.print(" ");
			tmp=(String)obj.get(fieldsd);
			for (int j = 0; j <43-(tmp.length()); j++) {
				System.out.print(" ");
			}
			System.out.println(" |");
			System.out.println("+----------------------------------------------------------------------------------------------------+");

		}
		backto();
	} 
	
	public static void main(String args[]) {
		
		MainSatker ms=new MainSatker();
		ms.namaOperatorDenganAkhiranH();
	}
}
