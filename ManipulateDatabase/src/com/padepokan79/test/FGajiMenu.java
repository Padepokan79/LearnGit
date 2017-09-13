package com.padepokan79.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.Fgaji;

public class FGajiMenu{
	
	
	public static void main(String args[]) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
		System.out.println("+------------------------------------------------------------------------------------+");
		System.out.println("|                                       Menu                                         |");
		System.out.println("| 1. Nama dan Gaji Bersih | 2. Nama dan Status Kawin | 3. Nama laki -laki dan Jomblo |");
		System.out.println("|                                                                                    |");
		System.out.println("+------------------------------------------------------------------------------------+"); 
		try {
			System.out.println("Masukan PIlihan : ");
			String input=dataIn.readLine();
			switch (input) {
				case "1":
					testNamaDanGajiBersih();
					break;
				case "2":
					testNamaDanStatusKawin();
					break;
				case "3":
					testNamaDanLakiJomblo();
					break;
				default:
					System.out.println("Masukan anda tidak valid !");
			}
		} catch (Exception e) {
			System.out.println("Exception Print !");
			System.out.println(e.getMessage());
		}
	}
	
	

	public static void testNamaDanLakiJomblo(){
		Fgaji fgaji = new Fgaji();
		JSONArray data = fgaji.getNamaDanLakiJomblo();
		//System.out.println(data);
		showData(data,"nama","bersih");
	} // ikan added test for NamaDanGajiBersih
	
	public static void testNamaDanGajiBersih(){
		Fgaji fgaji = new Fgaji();
		JSONArray data = fgaji.getNamaDanGajiBersih();
		
		showData(data,"nama","bersih");
	} // ikan added test for NamaDanGajiBersih
	public static void testNamaDanStatusKawin(){
		Fgaji fgaji = new Fgaji();
		JSONArray data = fgaji.getNamaDanStatusKawin();
		//System.out.println(data);
		showData(data,"nama","bersih");
	} // ikan added test for testNamaDanStatusKawin
	
	public static void showData(JSONArray arrayData,String fieldsa, String fieldsb) {
		//System.out.println(arrayData);
		
		System.out.println("+-------------------------------------------------+");
		System.out.println("|   Nama                       |  Status          |");
		System.out.println("+-------------------------------------------------+");
		String space;
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);
			
			String status = "";
			if ((int)obj.get(fieldsb) == 1){
				status = "Kawin";
			}else{
				status = "Tidak kawin";
			}
			space=(String) obj.get(fieldsa);
			System.out.print("|"+space.trim());
			for (int j = 0; j <38-(space.length()); j++) {
					System.out.print(" ");
			}
			if (i>0) {
				System.out.print("  ");
			}
			System.out.println(status+"|");
			System.out.println("---------------------------------------------------");
		}
	}

}
