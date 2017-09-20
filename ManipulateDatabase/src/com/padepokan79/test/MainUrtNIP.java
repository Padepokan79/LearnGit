package com.padepokan79.test;

import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.UrtNIP;

public class MainUrtNIP {

	public Scanner sc = new Scanner(System.in);
	
		//"SELECT nip,nama,kdstawin,janak FROM fgaji where kdstawin=3 and janak=0 limit 0,10;"
		public  void getMenampilkanPNSYangPunyaNPWPTempatLahirdanAgama(){
			UrtNIP urtNIP = new UrtNIP();
			JSONArray data = urtNIP.getMenampilkanPNSYangPunyaNPWPTempatLahirdanAgama(0);
			//System.out.println(data);
			showData7Parameter(data,"nip","nama","npwp","tempat_lahir","jenkel","agama","golongan");
		} // ikan added test for NamaDanGajiBersih
		public  void showData7Parameter(JSONArray arrayData,String fielda,String fieldb,String fieldc,String fieldd,String fielde,String fieldf,String fieldg) {
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
		public  void getMenampilkanPNSpunyaNPWPdanMasaKerjaLama(){
			UrtNIP urtNIP = new UrtNIP();
			System.out.println("Masukan lama masa kerja : ");
			int masaKerja=sc.nextInt();
			JSONArray data = urtNIP.getMenampilkanPNSpunyaNPWPdanMasaKerjaLama(masaKerja, 0);
			//System.out.println(data);
			showData7Parameter(data,"nip","nama","npwp","masa_kerja","golongan","jab_struktur");
		} // ikan added test for NamaDanGajiBersih
		public  void showData7Parameter(JSONArray arrayData,String fielda,String fieldb,String fieldc,String fieldd,String fielde,String fieldf) {
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
		public  void getMenampilkanTempatLahirDiLimaPuluhDanJenisKelaminPerempuan(){
			UrtNIP urtNIP = new UrtNIP();
			System.out.println("Masukan Tempat lahir : ");
			String inputTempatLahir = sc.next();
			System.out.println("Masukan Jenis Kelamin : ");
			String inputJenisKelamin = sc.next();
			JSONArray data = urtNIP.getMenampilkanTempatLahirDiLimaPuluhDanJenisKelaminPerempuan(inputTempatLahir, inputJenisKelamin, 0);
			//System.out.println(data);
			showData7Parameter(data,"nip","nama","tempat_lahir","jenis_kelamin");
		} // ikan added test for NamaDanGajiBersih
		public  void showData7Parameter(JSONArray arrayData,String a1,String a2,String a3,String a4) {
			//System.out.println(arrayData);
			System.out.println("+---------------------------------------------------------------------------------------------------+");
			System.out.println("|        NIP       |              nama            |          Tempat_Lahir        |   Jenis_Kelamin  | ");
			System.out.println("+---------------------------------------------------------------------------------------------------+");
			String space;
			int tmp;
			
			for (int i = 0; i < arrayData.length(); i++) {
				JSONObject obj =  arrayData.getJSONObject(i);	
				
				
				space=(String) obj.get(a1);
				System.out.print("|"+space);
				for (int j = 0; j  <18-(space.length()); j++) {
					System.out.print(" ");
				}
				space=(String) obj.get(a2);
				System.out.print("|"+space);
				for (int j = 0; j  <30-(space.length()); j++) {
					System.out.print(" ");
				}
				
				space=(String) obj.get(a3);
				space = space.trim();
				System.out.print("|"+space);
				for (int j = 0; j  <22-(space.length()); j++) {
					System.out.print(" ");
				}
				space=(String) obj.get(a4);
				System.out.print("|"+space);
				for (int j = 0; j  <15-(space.length()); j++) {
					System.out.print(" ");
				}
				
				System.out.println("|");
				System.out.println("+------------------------------------------------------------------------------------------------------------------------------------+");
				
			}
		}

}
