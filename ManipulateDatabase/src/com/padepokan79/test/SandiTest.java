package com.padepokan79.test;

import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.Fgaji;

public class SandiTest {
	
	public static void namaSuperDad(){
		Fgaji fgaji = new Fgaji();
		JSONArray data = fgaji.getNamaSuperDad();
		//System.out.println(data);
		showData(data,"nip", "nama", "kdjenkel", "tgllhr","kdpangkat","masker","janak");
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
	}
	
	public static void main(String args[]) {
		namaSuperDad();
	}

}
