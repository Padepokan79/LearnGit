package com.padepokan79.test;

import java.io.BufferedReader;
<<<<<<< HEAD
<<<<<<< HEAD
import java.io.IOException;
=======
>>>>>>> origin/Controling
=======
import java.io.IOException;
>>>>>>> f6b18d8ba36ee1ed9db6fd626d2543f2b3d0c201
import java.io.InputStream;
import java.io.InputStreamReader;

import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.Fgaji;

public class FGajiMenu{
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f6b18d8ba36ee1ed9db6fd626d2543f2b3d0c201
	static BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
	static MainActivity ma=new MainActivity();

	public static void mainMenu () {//Modify by Ipin

<<<<<<< HEAD
		System.out.println("+----------------------------------------------------------------------------------------------------+");
		System.out.println("|                                      Submenu Gajih                                                 |");
		System.out.println("|----------------------------------------------------------------------------------------------------|");
		System.out.println("| 1. Nama dan Gaji Bersih         | 2. Nama dan Status Kawin         | 3. Nama laki -laki dan Jomblo |");
		System.out.println("|----------------------------------------------------------------------------------------------------|");
		System.out.println("| 4. Nama dan Gaji Bersih > 10 Jt | 5. Pegawai Usia antara 25 dan 35 | 6. Janda kembang              |");
		System.out.println("|----------------------------------------------------------------------------------------------------|");
		System.out.println("| 7. Super Dad                    |                                  | 0. Menu Utama                 |");
		System.out.println("+----------------------------------------------------------------------------------------------------+");
		
=======
<<<<<<< HEAD
=======
	
	
	public void mainMenu () {//Modify by Ipin
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
>>>>>>> origin/Controling
=======
>>>>>>> f6b18d8ba36ee1ed9db6fd626d2543f2b3d0c201
		System.out.println("+------------------------------------------------------------------------------------+");
		System.out.println("|                                      Submenu Gajih                                 |");
		System.out.println("|------------------------------------------------------------------------------------|");
		System.out.println("| 1. Nama dan Gaji Bersih | 2. Nama dan Status Kawin | 3. Nama laki -laki dan Jomblo |");
		System.out.println("|------------------------------------------------------------------------------------|");
<<<<<<< HEAD
<<<<<<< HEAD
		System.out.println("| 4. Nama dan Gaji Bersih | 2. Nama dan Status Kawin | 0. Menu Utama                 |");
=======
		System.out.println("| 4. Nama dan Gaji Bersih | 2. Nama dan Status Kawin | 3. Nama laki -laki dan Jomblo |");
>>>>>>> origin/Controling
=======
		System.out.println("| 4. Nama dan Gaji Bersih | 2. Nama dan Status Kawin | 0. Menu Utama                 |");
>>>>>>> f6b18d8ba36ee1ed9db6fd626d2543f2b3d0c201
		System.out.println("+------------------------------------------------------------------------------------+");
>>>>>>> origin/Controling
		try {
			System.out.print("Masukan PIlihan : ");
			String input=dataIn.readLine();
			switch (input) {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f6b18d8ba36ee1ed9db6fd626d2543f2b3d0c201
			case "1":
				testNamaDanGajiBersih();
				break;
			case "2":
				testNamaDanStatusKawin();
				break;
			case "3":
				testNamaDanLakiJomblo();
				break;
			case "4":
				NipNamaGajiBersihDiAtas10Jt();
				break;
			case "5":
				usiaAntara25Dan35();
				break;
			case "6":
				getNamaJandaKembang();
				break;
			case "7":
				namaSuperDad();
				break;
			case "0":
				ma.menuUtama();
				break;
			default:
				System.out.println("Masukan anda tidak valid !");
<<<<<<< HEAD
=======
				case "1":
					testNamaDanGajiBersih();
					break;
				case "2":
					testNamaDanStatusKawin();
					break;
				case "3":
					testNamaDanLakiJomblo();
					break;
				case "4":
					NipNamaGajiBersihDiAtas10Jt();
					break;
				default:
					System.out.println("Masukan anda tidak valid !");
>>>>>>> origin/Controling
=======
>>>>>>> f6b18d8ba36ee1ed9db6fd626d2543f2b3d0c201
			}
			
		} catch (Exception e) {
			System.out.println("Exception Print !");
			System.out.println(e.getMessage());
		}
		
	}
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f6b18d8ba36ee1ed9db6fd626d2543f2b3d0c201

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
<<<<<<< HEAD
=======
	
	
>>>>>>> origin/Controling
=======
>>>>>>> f6b18d8ba36ee1ed9db6fd626d2543f2b3d0c201

	public static void testNamaDanLakiJomblo(){
		Fgaji fgaji = new Fgaji();
		JSONArray data = fgaji.getNamaDanLakiJomblo();
<<<<<<< HEAD
<<<<<<< HEAD
		showData(data,"nama","bersih");
	} // ikan added test for NamaDanGajiBersih

	public static void testNamaDanGajiBersih(){
		Fgaji fgaji = new Fgaji();
		JSONArray data = fgaji.getNamaDanGajiBersih();
=======
		//System.out.println(data);
=======
>>>>>>> f6b18d8ba36ee1ed9db6fd626d2543f2b3d0c201
		showData(data,"nama","bersih");
	} // ikan added test for NamaDanGajiBersih

	public static void testNamaDanGajiBersih(){
		Fgaji fgaji = new Fgaji();
		JSONArray data = fgaji.getNamaDanGajiBersih();
<<<<<<< HEAD
		
>>>>>>> origin/Controling
=======
>>>>>>> f6b18d8ba36ee1ed9db6fd626d2543f2b3d0c201
		showData(data,"nama","bersih");
	} // ikan added test for NamaDanGajiBersih
	
	public static void testNamaDanStatusKawin(){
		Fgaji fgaji = new Fgaji();
		JSONArray data = fgaji.getNamaDanStatusKawin();
<<<<<<< HEAD
<<<<<<< HEAD
		showData(data,"nama","bersih");
	} // ikan added test for testNamaDanStatusKawin
	
	 
	public static void usiaAntara25Dan35(){
		Fgaji fgaji = new Fgaji();
		JSONArray data = fgaji.queryUsiaAntara25Sampai35();
		showData(data,"nip","nama","bersih","kdpangkat","usia");
	}
	
	public static void showData(JSONArray arrayData,String fieldsa, String fieldsb) {
		//System.out.println(arrayData);

=======
		//System.out.println(data);
=======
>>>>>>> f6b18d8ba36ee1ed9db6fd626d2543f2b3d0c201
		showData(data,"nama","bersih");
	} // ikan added test for testNamaDanStatusKawin


	public static void usiaAntara25Dan35(){
		Fgaji fgaji = new Fgaji();
		JSONArray data = fgaji.queryUsiaAntara25Sampai35();
		showData(data,"nip","nama","bersih","kdpangkat","usia");
	}

	public static void NipNamaGajiBersihDiAtas10Jt(){
		Fgaji fgaji = new Fgaji();
		JSONArray data = fgaji.getNipNamaGajiBersihDiAtas10Jt();
		showData(data,"nip", "nama", "bersih", "kdpangkat");
	} // ikan added test for NamaDanGajiBersih

	// update janda kembang indra
	public static void getNamaJandaKembang(){
		Fgaji fgaji = new Fgaji();
		JSONArray data = fgaji.getNamaJandaKembang();
		showData4Parameter(data,"nip", "nama", "kdstawin", "janak");
	} // ikan added test for NamaDanGajiBersih

	public static void namaSuperDad(){
		Fgaji fgaji = new Fgaji();
		JSONArray data = fgaji.getNamaSuperDad();
		showData(data,"nip", "nama", "kdjenkel", "tgllhr","kdpangkat","masker","janak");
	} 

	public static void showData(JSONArray arrayData,String fieldsa, String fieldsb) {
<<<<<<< HEAD
=======
		//System.out.println(arrayData);
<<<<<<< HEAD
		
>>>>>>> origin/Controling
=======
>>>>>>> origin/Controling

>>>>>>> f6b18d8ba36ee1ed9db6fd626d2543f2b3d0c201
		System.out.println("+-------------------------------------------------+");
		System.out.println("|   Nama                            |  Status     |");
		System.out.println("+-------------------------------------------------+");
		String space;
		for (int i = 0; i < arrayData.length(); i++) {//modify by Ipin
			JSONObject obj =  arrayData.getJSONObject(i);
<<<<<<< HEAD
<<<<<<< HEAD

=======
			
>>>>>>> origin/Controling
=======

>>>>>>> f6b18d8ba36ee1ed9db6fd626d2543f2b3d0c201
			String status = "";
			if ((int)obj.get(fieldsb) == 1){
				status = "Kawin";
			}else{
				status = "Tidak kawin";
			}
			space=(String) obj.get(fieldsa);
<<<<<<< HEAD
<<<<<<< HEAD
			space=space.trim();
			System.out.print("|"+space);
			for (int j = 0; j <35-(space.length()); j++) {
				System.out.print(" ");
=======
			System.out.print("|"+space.trim());
			for (int j = 0; j <35-(space.length()); j++) {
					System.out.print(" ");
>>>>>>> origin/Controling
=======
			space=space.trim();
			System.out.print("|"+space);
			for (int j = 0; j <35-(space.length()); j++) {
				System.out.print(" ");
>>>>>>> f6b18d8ba36ee1ed9db6fd626d2543f2b3d0c201
			}
			if (i>0) {
				System.out.print("  ");
			}
			System.out.println("| "+status+" |");
			System.out.println("---------------------------------------------------");
<<<<<<< HEAD
<<<<<<< HEAD

		}
		backto();
	}

	// nip, nama, bersih, kdpangkat, TGLLHR as usia
	public static void showData(JSONArray arrayData,String fieldsa, String fieldsb,String fieldsc,String fieldsd,String fieldse) {

		System.out.println("+------------------------------------------------------------------------------------------+");
		System.out.println("| Nip              | Nama                       | Gaji      | Kode Pangkat | Tanggal lahir |");
		System.out.println("+------------------------------------------------------------------------------------------+");
		String space;
		for (int i = 0; i < arrayData.length(); i++) {//modify by Ipin
			JSONObject obj =  arrayData.getJSONObject(i);

			space=(String) obj.get(fieldsb);
			space=space.trim();
			System.out.print("|"+obj.get(fieldsa));
			System.out.print("|"+space);
			for (int j = 0; j <28-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.print("| Rp."+obj.get(fieldsc));
			System.out.print("|     "+obj.get(fieldsd));
			System.out.println("       |   "+obj.get(fieldse)+"  |");
			System.out.println("+------------------------------------------------------------------------------------------+");

		}
		backto();
	}


=======
			
=======

>>>>>>> f6b18d8ba36ee1ed9db6fd626d2543f2b3d0c201
		}
		backto();
	}
	
	// nip, nama, bersih, kdpangkat, TGLLHR as usia
	public static void showData(JSONArray arrayData,String fieldsa, String fieldsb,String fieldsc,String fieldsd,String fieldse) {

		System.out.println("+------------------------------------------------------------------------------------------+");
		System.out.println("| Nip              | Nama                       | Gaji      | Kode Pangkat | Tanggal lahir |");
		System.out.println("+------------------------------------------------------------------------------------------+");
		String space;
		for (int i = 0; i < arrayData.length(); i++) {//modify by Ipin
			JSONObject obj =  arrayData.getJSONObject(i);

			space=(String) obj.get(fieldsb);
			space=space.trim();
			System.out.print("|"+obj.get(fieldsa));
			System.out.print("|"+space);
			for (int j = 0; j <28-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.print("| Rp."+obj.get(fieldsc));
			System.out.print("|     "+obj.get(fieldsd));
			System.out.println("       |   "+obj.get(fieldse)+"  |");
			System.out.println("+------------------------------------------------------------------------------------------+");

		}
		backto();
	}
	
	public static void NipNamaGajiBersihDiAtas10Jt(){
		Fgaji fgaji = new Fgaji();
		JSONArray data = fgaji.getNipNamaGajiBersihDiAtas10Jt();
		showData(data,"nip", "nama", "bersih", "kdpangkat");
	} // ikan added test for NamaDanGajiBersih
<<<<<<< HEAD
>>>>>>> origin/Controling
=======

>>>>>>> f6b18d8ba36ee1ed9db6fd626d2543f2b3d0c201
	//update data NipNamaGajiBersihDiAtas10Jt
	public static void showData(JSONArray arrayData,String fieldsa, String fieldsb, String fieldsc, String fieldsd) {
		//System.out.println(arrayData);
		System.out.println("+---------------------------------------------------------------------------+");
<<<<<<< HEAD
<<<<<<< HEAD
		System.out.println("|   NIP            |        Nama              | Gaji         |     Golongan |");
		System.out.println("+---------------------------------------------------------------------------+");
		String space;

=======
		System.out.println("|   NIP            |        Nama              | Status       |     Golongan |");
		System.out.println("+---------------------------------------------------------------------------+");
		String space;
		
>>>>>>> origin/Controling
=======
		System.out.println("|   NIP            |        Nama              | Gaji         |     Golongan |");
		System.out.println("+---------------------------------------------------------------------------+");
		String space;

>>>>>>> f6b18d8ba36ee1ed9db6fd626d2543f2b3d0c201
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);
			space=(String) obj.get(fieldsb);
			System.out.print("|"+obj.get(fieldsa));
			System.out.print("|  "+obj.get(fieldsb));
			for (int j = 0; j  <24-(space.length()); j++) {
				System.out.print(" ");
			}
<<<<<<< HEAD
<<<<<<< HEAD
			System.out.print("| Rp."+obj.get(fieldsc));
			System.out.println("  |       "+obj.get(fieldsd)+"     |");
			System.out.println("+-------------------------------------------------------------------------------+");
		}

		backto();
	}

=======
			System.out.print("|  "+obj.get(fieldsc));
			System.out.println("    |       "+obj.get(fieldsd)+"     |");
			System.out.println("+---------------------------------------------------------------------------+");
=======
			System.out.print("| Rp."+obj.get(fieldsc));
			System.out.println("  |       "+obj.get(fieldsd)+"     |");
			System.out.println("+-------------------------------------------------------------------------------+");
>>>>>>> f6b18d8ba36ee1ed9db6fd626d2543f2b3d0c201
		}

		backto();
	}
<<<<<<< HEAD
	
	
	
	public static void main(String args[]) {
		FGajiMenu fg=new FGajiMenu();
		fg.mainMenu();
		
		
	}
>>>>>>> origin/Controling
=======

<<<<<<< HEAD

=======
>>>>>>> f6b18d8ba36ee1ed9db6fd626d2543f2b3d0c201
	// update janda kembang indra
	public static void getNamaJandaKembang(){
		Fgaji fgaji = new Fgaji();
		JSONArray data = fgaji.getNamaJandaKembang();
		//System.out.println(data);
		showData4Parameter(data,"nip", "nama", "kdstawin", "janak");
	} // ikan added test for NamaDanGajiBersih
>>>>>>> origin/Controling
	public static void showData4Parameter(JSONArray arrayData,String fieldsa, String fieldsb, String fieldsc, String fieldsd) {
		//System.out.println(arrayData);
		System.out.println("+---------------------------------------------------------------------------------+");
		System.out.println("|   NIP            |        Nama              | Status Perkawinan  |  Jumlah Anak |");
		System.out.println("+---------------------------------------------------------------------------------+");
		String space;

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);
			space=(String) obj.get(fieldsb);
			System.out.print("|"+obj.get(fieldsa));		
			space=space.trim();
			System.out.print("|"+space);

			for (int j = 0; j  <26-(space.length()); j++) {
				System.out.print(" ");}
			System.out.print("|           "+obj.get(fieldsc));
			System.out.println("        |       "+obj.get(fieldsd)+"      |");
			System.out.println("+---------------------------------------------------------------------------------+");
		}
<<<<<<< HEAD
		
		backto();
	}

	public static void showData(JSONArray arrayData, String fSatu, String fDua, String fTiga, String fEmpat, String fLima, String fEnam, String fTujuh) {
		//System.out.println(arrayData);
		System.out.println("+---------------------------------------------------------------------------------------------------------------------------+");
		System.out.println("|        Nip         |           Nama           |  Jenis Kelamin  | Tanggal Lahir | Kode Pangkat | Masa Kerja | Jumlah Anak |");
		System.out.println("+---------------------------------------------------------------------------------------------------------------------------+");
		String space;

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	

			space=(String) obj.get(fSatu);
			System.out.print("| "+space);

			space=(String) obj.get(fDua);
			space = space.trim();
			System.out.print(" | "+space);
			for (int j = 0; j  <24-(space.length()); j++) {
				System.out.print(" ");
			}

			if (obj.get(fTiga).equals(1)) {
				space = "Laki Laki";
			}else {
				space = "Perempuan";
			}
			System.out.print(" |    "+space);

			System.out.print("    |   "+obj.get(fEmpat));

			System.out.print("  |      "+obj.get(fLima));

			System.out.print("      |     "+obj.get(fEnam));

			System.out.println("     |      "+obj.get(fTujuh)+"      |");

			System.out.println("+---------------------------------------------------------------------------------------------------------------------------+");
		}
		backto();
	}

public static void main(String args[]) {
		FGajiMenu fg=new FGajiMenu();
		fg.mainMenu();
=======
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> origin/Controling
=======

>>>>>>> f6b18d8ba36ee1ed9db6fd626d2543f2b3d0c201
>>>>>>> origin/Controling
	}
	
}
