package com.padepokan79.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.Twafat;

public class Maintwafat {
	static BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
	static MainActivity ma=new MainActivity();

	public static void mainMenu () {//Modify by Ipin

		System.out.println("+--------------------------------------------------------------------------------+");
		System.out.println("|                      Submenu Satuan Tabel Wafat                                |");
		System.out.println("|--------------------------------------------------------------------------------|");
		System.out.println("| 1. Penerbit Bukan Lurah | 2. Kuburan keluarga Kosong        | 3. Tanggal Wafat |");
		System.out.println("|--------------------------------------------------------------------------------|");
		System.out.println("| 4. PNS Mati Paling Lama | 5. Pegawai meninggal sebelum 2013 | 0. Menu Utama    |");
		System.out.println("+--------------------------------------------------------------------------------+");
		
		try {
			System.out.print("Masukan PIlihan : ");
			String input=dataIn.readLine();
			switch (input) {
			case "1":
				getqueryPenerbitBukanDariLurah();
				break;
			case "2":
				KdKubKelPenerimaKosong();
				break;
			case "3":
				NIPNamaTanggalWafat();
				break;
			case "4":
				getqueryPNSYangMatinyaPalingLama();
				break;
			case "5":
				testDaftarPegawaiYangMatiSebelumTahun2013();
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
	
	
	public static void getqueryPenerbitBukanDariLurah(){
		Twafat twafat = new Twafat();
		JSONArray data = twafat.getqueryPenerbitBukanDariLurah();
		showData3Parameter(data,"nip", "nama", "penerbit");
	}

	public static void KdKubKelPenerimaKosong(){
		Twafat twafat = new Twafat();
		JSONArray data = twafat.getqueryKdKubKelPenerimaKosong();
		showData(data,"nip", "nama","tglwafat","penerbit","kdhubkelpenerima");
	} 
	
	public static void NIPNamaTanggalWafat(){
		Twafat twafat = new Twafat();
		JSONArray data = twafat.getqueryNIPNamaTanggalWafat();
		showData(data,"nip", "nama","tglwafat");
	} 
	
	public static void getqueryPNSYangMatinyaPalingLama(){
		Twafat twafat = new Twafat();
		JSONArray data = twafat.getqueryPNSYangMatinyaPalingLama();
		showData3Parameter2(data,"nip", "nama", "tglwafat");
	} 
	
	public static void testDaftarPegawaiYangMatiSebelumTahun2013(){
		Twafat objwafat =new Twafat();
		JSONArray data = objwafat.getqueryDaftarPegawaiYangMatiSebelumTahun2013(); 
		showDataWafat(data,"nip","nama","tglwafat");
	} // Yusup  added test for DaftarPegawaiYangMatiSebelumTahun2013
	
	public static void showData3Parameter(JSONArray arrayData,String fielda, String fieldb, String fieldc) {
		
		System.out.println("+-----------------------------------------------------------------------------------------------------------+");
		System.out.println("|          NIP           |                  Nama                   |               Penerbit                 |");
		System.out.println("+-----------------------------------------------------------------------------------------------------------+");
		String space;
		
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	
			
			space=(String) obj.get(fielda);
			space = space.trim();
			System.out.print("|"+space);
			for (int j = 0; j  <8-(space.length()); j++) {
				System.out.print(" ");
			}
			
			space=(String) obj.get(fieldb);
			space = space.trim();
			System.out.print("      | "+space);
			for (int j = 0; j  <35-(space.length()); j++) {
				System.out.print(" ");
			}
			
			space=(String) obj.get(fieldc);
			space = space.trim();
			System.out.print("     | "+space);
			for (int j = 0; j  <39-(space.length()); j++) {
				System.out.print(" ");
			}
			
			System.out.println("|");
			System.out.println("+-----------------------------------------------------------------------------------------------------------+");
		}
	}	
	
	public static void showData(JSONArray arrayData, String fSatu, String fDua,String fTiga) {
		//System.out.println(arrayData);
		System.out.println("+-------------------------------------------------------------------------+");
		System.out.println("|        Nip         |                 Nama               | Tanggal Wafat |");
		System.out.println("+-------------------------------------------------------------------------+");
		String space;
		
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	
			
			space=(String) obj.get(fSatu);
			space = space.trim();
			System.out.print("| "+space);
			for (int j = 0; j  <19-(space.length()); j++) {
				System.out.print(" ");
			}
			
			space=(String) obj.get(fDua);
			space = space.trim();
			System.out.print("| "+space);
			for (int j = 0; j  <35-(space.length()); j++) {
				System.out.print(" ");
			}
			
			System.out.print("|  "+obj.get(fTiga));
			
			System.out.println("   |");
					
			System.out.println("+-------------------------------------------------------------------------+");
		}
	}
	
	public static void showData(JSONArray arrayData, String fSatu, String fDua,String fTiga,String fEmpat,String fLima) {
		//System.out.println(arrayData);
		System.out.println("+------------------------------------------------------------------------------------------+");
		System.out.println("|        Nip         |           Nama           | Tanggal Wafat | Penerbit | Kode Penerima |");
		System.out.println("+------------------------------------------------------------------------------------------+");
		String space;
		
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	
			
			space=(String) obj.get(fSatu);
			space = space.trim();
			System.out.print("| "+space);
			for (int j = 0; j  <19-(space.length()); j++) {
				System.out.print(" ");
			}
			
			space=(String) obj.get(fDua);
			space = space.trim();
			System.out.print("| "+space);
			for (int j = 0; j  <25-(space.length()); j++) {
				System.out.print(" ");
			}
			
			System.out.print("|  "+obj.get(fTiga));
			
			space=(String) obj.get(fEmpat);
			space = space.trim();
			System.out.print("   |   "+space);
			for (int j = 0; j  <7-(space.length()); j++) {
				System.out.print(" ");
			}
			
			System.out.print("|      "+obj.get(fLima));
			
			System.out.println("       |");
					
			System.out.println("+------------------------------------------------------------------------------------------+");
		}
	}
	
	public static void showData3Parameter2(JSONArray arrayData,String fielda, String fieldb, String fieldc) {
		//System.out.println(arrayData);
		System.out.println("+------------------------------------------------------------------------------------+");
		System.out.println("|          NIP           |                  Nama                   |  Tanggal wafat  |");
		System.out.println("+------------------------------------------------------------------------------------+");
		String space;
		
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	
			
			space=(String) obj.get(fielda);
			space = space.trim();
			System.out.print("|"+space);
			for (int j = 0; j  <8-(space.length()); j++) {
				System.out.print(" ");
			}
			
			space=(String) obj.get(fieldb);
			space = space.trim();
			System.out.print("      | "+space);
			for (int j = 0; j  <35-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.print("     | ");
			System.out.print(obj.get(fieldc));
			for (int j = 0; j  <21-(space.length()); j++) {
				System.out.print(" ");
			}
			
			System.out.println("|");
			System.out.println("+------------------------------------------------------------------------------------+");
		}
	}
	
	public static void showDataWafat(JSONArray arrayData, String fNip, String fNama, String fTgl) {
		//System.out.println(arrayData);
		System.out.println("+--------------------------------------------------------+");
		System.out.println("|         NIP         |        Nama       |Tanggal Wafat |");
		System.out.println("+--------------------------------------------------------+");
		String space;

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	

			space=(String) obj.get(fNip);
			System.out.print("| "+space);

			space=(String) obj.get(fNama);
			space = space.trim();
			System.out.print("  | "+space);
			for (int j = 0; j  <16-(space.length()); j++) {
				System.out.print(" ");
			}
			
			System.out.print("  | "+ obj.get(fTgl));
			for (int j = 0; j  <18-(space.length()); j++) {
				System.out.print(" ");
			}
		
			System.out.println("|");
			System.out.println("+--------------------------------------------------------+");
		}
	}//Yusup Add ShowData Hehe...
}