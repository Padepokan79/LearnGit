package com.padepokan79.test;

import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.InputVariable;
import com.padepokan79.model.UrtNIP;

public class MainUrtNIP extends InputVariable{
	public static Scanner sc = new Scanner(System.in);
	public static UrtNIP urtNIP = new UrtNIP();
	
	//"SELECT nip,nama,kdstawin,janak FROM fgaji where kdstawin=3 and janak=0 limit 0,10;"
	public static void getMenampilkanPNSYangPunyaNPWPTempatLahirdanAgama(){
		
		JSONArray data = urtNIP.getMenampilkanPNSYangPunyaNPWPTempatLahirdanAgama();
		//System.out.println(data);
		showData7Parameter(data,"nip","nama","npwp","tempat_lahir","jenkel","agama","golongan");
	} // ikan added test for NamaDanGajiBersih
	public static void showData7Parameter(JSONArray arrayData,String fielda,String fieldb,String fieldc,String fieldd,String fielde,String fieldf,String fieldg) {
		//System.out.println(arrayData);
		System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------+");
		System.out.println("|        NIP       |              nama            |          NPWP        |  Tempat Lahir | Jenis Kelamin |    Agama        | Golongan  |");
		System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------+");
		String space;
		int tmp;

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	


			space=(String) obj.get(fielda);
			System.out.print("|"+space);
			for (int j = 0; j  <18-(space.length()); j++) {
				System.out.print(" ");
			}
			space=(String) obj.get(fieldb);
			System.out.print("|"+space);
			for (int j = 0; j  <30-(space.length()); j++) {
				System.out.print(" ");
			}

			space=(String) obj.get(fieldc);
			space = space.trim();
			System.out.print("|"+space);
			for (int j = 0; j  <22-(space.length()); j++) {
				System.out.print(" ");
			}
			space=(String) obj.get(fieldd);
			System.out.print("|"+space);
			for (int j = 0; j  <15-(space.length()); j++) {
				System.out.print(" ");
			}
			space=(String) obj.get(fielde);
			System.out.print("|"+space);
			for (int j = 0; j  <15-(space.length()); j++) {
				System.out.print(" ");
			}
			space=(String) obj.get(fieldf);
			System.out.print("|"+space);
			for (int j = 0; j  <17-(space.length()); j++) {
				System.out.print(" ");
			}
			space=(String) obj.get(fieldg);
			System.out.print("|"+space);
			for (int j = 0; j  <11-(space.length()); j++) {
				System.out.print(" ");
			}


			System.out.println("|");
			System.out.println("+------------------------------------------------------------------------------------------------------------------------------------+");

		}
	}	
	public static void getMenampilkanPNSpunyaNPWPdanMasaKerjaLama(){
		
		JSONArray data = urtNIP.getMenampilkanPNSpunyaNPWPdanMasaKerjaLama();
		//System.out.println(data);
		showData7Parameter(data,"nip","nama","npwp","masa_kerja","golongan","jab_struktur");
	} // ikan added test for NamaDanGajiBersih
	public static void showData7Parameter(JSONArray arrayData,String fielda,String fieldb,String fieldc,String fieldd,String fielde,String fieldf) {
		//System.out.println(arrayData);
		System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------+");
		System.out.println("|        NIP       |              nama            |          NPWP        |   Masa Kerja  | Golongan  |    Struktur Jabatan             |");
		System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------+");
		String space;
		int tmp;

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	


			space=(String) obj.get(fielda);
			System.out.print("|"+space);
			for (int j = 0; j  <18-(space.length()); j++) {
				System.out.print(" ");
			}
			space=(String) obj.get(fieldb);
			System.out.print("|"+space);
			for (int j = 0; j  <30-(space.length()); j++) {
				System.out.print(" ");
			}

			space=(String) obj.get(fieldc);
			space = space.trim();
			System.out.print("|"+space);
			for (int j = 0; j  <22-(space.length()); j++) {
				System.out.print(" ");
			}
			space=(String) obj.get(fieldd);
			System.out.print("|"+space);
			for (int j = 0; j  <15-(space.length()); j++) {
				System.out.print(" ");
			}
			space=(String) obj.get(fielde);
			System.out.print("|"+space);
			for (int j = 0; j  <15-(space.length()); j++) {
				System.out.print(" ");
			}
			space=(String) obj.get(fieldf);
			System.out.print("|"+space);
			for (int j = 0; j  <17-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.println("|");
			System.out.println("+------------------------------------------------------------------------------------------------------------------------------------+");

		}
	}	
	// belum di uji connection,  message from server: "Too many connections"
	public static void getMenampilkanTempatLahirDiLimaPuluhDanJenisKelaminPerempuan(){
		
		System.out.print("Masukan Tempat lahir : ");
		inputTempatLahir = sc.next();
		System.out.println("Masukan Jenis Kelamin : ");
		inputJenisKelamin = sc.next();
		JSONArray data = urtNIP.getMenampilkanTempatLahirDiLimaPuluhDanJenisKelaminPerempuan();
		//System.out.println(data);
		showDataParameter(data,"nip_v","v_nama","v_tmp_lahir","c_jns_kelamin");
	} // ikan added test for NamaDanGajiBersih
	public static void showDataParameter(JSONArray arrayData,String a1,String a2,String a3,String a4) {
		System.out.println(arrayData);
		System.out.println("+---------------------------------------------------------------------------------------------------+");
		System.out.println("|        NIP       |              nama            |          Tempat_Lahir        |   Jenis_Kelamin  | ");
		System.out.println("+---------------------------------------------------------------------------------------------------+");
		String space;
		int tmp;

//		for (int i = 0; i < arrayData.length(); i++) {
//			JSONObject obj =  arrayData.getJSONObject(i);	
//
//
//			space=(String) obj.get(a1);
//			System.out.print("|"+space);
//			for (int j = 0; j  <18-(space.length()); j++) {
//				System.out.print(" ");
//			}
//			space=(String) obj.get(a2);
//			System.out.print("|"+space);
//			for (int j = 0; j  <30-(space.length()); j++) {
//				System.out.print(" ");
//			}
//
//			space=(String) obj.get(a3);
//			space = space.trim();
//			System.out.print("|"+space);
//			for (int j = 0; j  <22-(space.length()); j++) {
//				System.out.print(" ");
//			}
//			space=(String) obj.get(a4);
//			System.out.print("|"+space);
//			for (int j = 0; j  <15-(space.length()); j++) {
//				System.out.print(" ");
//			}
//
//			System.out.println("|");
//			System.out.println("+------------------------------------------------------------------------------------------------------------------------------------+");
//
//	}
	}
	
	public static void main(String[]args) {
		//getMenampilkanPNSYangPunyaNPWPTempatLahirdanAgama();
		//getMenampilkanPNSpunyaNPWPdanMasaKerjaLama();
		MainUrtNIP obj = new MainUrtNIP();
		obj.getMenampilkanTempatLahirDiLimaPuluhDanJenisKelaminPerempuan();
	}

}
