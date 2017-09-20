package com.padepokan79.test;

import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.InputVariable;
import com.padepokan79.model.UrtNIP;

public class MainUrtNIP extends InputVariable {
	public  Scanner sc = new Scanner(System.in);

	public  static void main(String[]args) {
		MainUrtNIP obj =  new MainUrtNIP();
		//obj.getMenampilkanTempatLahirDiLimaPuluhDanJenisKelaminPerempuan();
		obj.getMenampilkanJumlahPNSberdasrkanAgamadanGolongan();
		//obj.getMenampilkanGroupByAgama();
		//obj.getMenampilkanPNSYangPunyaNPWPTempatLahirdanAgama();
		//obj.getMenampilkanPNSpunyaNPWPdanMasaKerjaLama();


	}
	//"SELECT nip,nama,kdstawin,janak FROM fgaji where kdstawin=3 and janak=0 limit 0,10;"
	// query 1
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
			System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------+");

		}
	}
	// query 3
	public  void getMenampilkanPNSpunyaNPWPdanMasaKerjaLama(){
		UrtNIP urtNIP = new UrtNIP();
		System.out.println("Masukan masa kerja : ");
		int masker = sc.nextInt();
		JSONArray data = urtNIP.getMenampilkanPNSpunyaNPWPdanMasaKerjaLama(masker,0);
		//System.out.println(data);
		showData7Parameter(data,"nip","nama","npwp","masa_kerja","golongan","jab_struktur");
	} // ikan added test for NamaDanGajiBersih
	public  void showData7Parameter(JSONArray arrayData,String fielda,String fieldb,String fieldc,String fieldd,String fielde,String fieldf) {
		//System.out.println(arrayData);
		System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
		System.out.println("|        NIP       |              nama            |          NPWP        |   Masa Kerja  | Golongan  |    Struktur Jabatan     |");
		System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
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
			tmp=(int) obj.get(fieldd);
			space =space.valueOf(tmp);
			System.out.print("|"+obj.get(fieldd));
			for (int j = 0; j  <15-(space.length()); j++) {
				System.out.print(" ");
			}
			space=(String) obj.get(fielde);
			System.out.print("|"+space);
			for (int j = 0; j  <11-(space.length()); j++) {
				System.out.print(" ");
			}
			space=(String) obj.get(fieldf);
			System.out.print("|"+space);
			for (int j = 0; j  <25-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.println("|");
			System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");

		}
	}	
	// query 2
	public  void getMenampilkanTempatLahirDiLimaPuluhDanJenisKelaminPerempuan(){
		UrtNIP urtNIP = new UrtNIP();
		System.out.println("Masukan Tempat lahir : ");
		String tempatLahir = sc.nextLine();
		System.out.println("Masukan Jenis Kelamin : ");
		String JenisKelamin = sc.next();
		JSONArray data = urtNIP.getMenampilkanTempatLahirDiLimaPuluhDanJenisKelaminPerempuan(tempatLahir, JenisKelamin, 0);
		//System.out.println(data);
		showData7Parameter(data,"nip_v", "v_nama", "v_tmp_lahir", "c_jns_kelamin");
	} // ikan added test for NamaDanGajiBersih
	public  void showData7Parameter(JSONArray arrayData,String a1,String a2,String a3,String a4) {
		//System.out.println(arrayData);
		System.out.println("+---------------------------------------------------------------------------------------------+");
		System.out.println("|        NIP       |              nama            |    Tempat_Lahir      |   Jenis_Kelamin    | ");
		System.out.println("+---------------------------------------------------------------------------------------------+");
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
			System.out.print("|    "+space);
			for (int j = 0; j  <15-(space.length()); j++) {
				System.out.print(" ");
			}

			System.out.println(" |");
			System.out.println("+---------------------------------------------------------------------------------------------+");

		}
	}

	//query 4
	public  void getMenampilkanJumlahPNSberdasrkanAgamadanGolongan(){ //modify by siska
		UrtNIP urtNIP = new UrtNIP();
		JSONArray data = urtNIP.getMenampilkanJumlahPNSberdasrkanAgamadanGolongan(1);
		showData_Parameter(data,"golongan","jumlah");
	}

	public  void showData_Parameter(JSONArray arrayData, String fieldb, String fieldc) {
		//System.out.println(arrayData);
		System.out.println("+-------------------------------------------------+");
		System.out.println("|        Golongan      |Jumlah_PNS Tak punya Agama|");
		System.out.println("+-------------------------------------------------+");
		String space;
		long tmp;

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	


		
			
			space=(String) obj.get(fieldb);
			System.out.print("|"+space);
			for (int j = 0; j  <21-(space.length()); j++) {
				System.out.print(" ");
			}

			tmp=(long) obj.get(fieldc);
			space=space.valueOf(tmp);
			System.out.print(" |          "+ tmp);
			for (int j = 0; j  <16-(space.length()); j++) {
				System.out.print(" ");
			}


			System.out.println("|");
			System.out.println("+-------------------------------------------------+");

		}
	}

	// query 5
	public  void getMenampilkanGroupByAgama(){ //modify by siska
		UrtNIP urtNIP = new UrtNIP();
		JSONArray data = urtNIP.queryMenampilkanGroupByAgama(1);
		showData2Parameter(data,"agama","jumlah_pns");
	}

	public  void showData2Parameter(JSONArray arrayData,String fielda, String fieldb) {
		//System.out.println(arrayData);
		System.out.println("+-----------------------------------------------+");
		System.out.println("|        Agama       |        Jumlah_PNS        |");
		System.out.println("+-----------------------------------------------+");
		String space;
		long tmp;

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	


			space=(String) obj.get(fielda);
			System.out.print("|"+space);
			for (int j = 0; j  <18-(space.length()); j++) {
				System.out.print(" ");
			}
			tmp=(long) obj.get(fieldb);
			space=space.valueOf(tmp);
			System.out.print("  |          "+ tmp);
			for (int j = 0; j  <16-(space.length()); j++) {
				System.out.print(" ");
			}


			System.out.println("|");
			System.out.println("+-----------------------------------------------+");

		}
	}
}
