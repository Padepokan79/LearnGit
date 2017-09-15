package com.padepokan79.test;

import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.Satker;

public class SandiTest {
	
	public static void kepalaDinasHaji(){
		Satker satkerja = new Satker();
		JSONArray data = satkerja.getqueryKepalaDinasHaji();
		//System.out.println(data);
		showData(data,"satkerja", "descsatker", "nama_atasa", "jab_atasan");
	} 
	
	public static void showData(JSONArray arrayData, String fSatu, String fDua, String fTiga, String fEmpat) {
		//System.out.println(arrayData);
		System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------------+");
		System.out.println("| Satuan Kerja |            Deskripsi Satuan Kerja            |                 Nama Atasan                 |               Jabatan Atasan               |");
		System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------------+");
		String space;
		
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	
			
			space=(String) obj.get(fSatu);
			System.out.print("|      "+space);
			
			space=(String) obj.get(fDua);
			space = space.trim();
			System.out.print("     | "+space);
			for (int j = 0; j  <40-(space.length()); j++) {
				System.out.print(" ");
			}
			
			space=(String) obj.get(fTiga);
			space = space.trim();
			System.out.print("     | "+space);
			for (int j = 0; j  <40-(space.length()); j++) {
				System.out.print(" ");
			}
			
			space=(String) obj.get(fEmpat);
			space = space.trim();
			System.out.print("    | "+space);
			for (int j = 0; j  <43-(space.length()); j++) {
				System.out.print(" ");
			}
			
			System.out.println("|");
					
			System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------------+");
		}
	}
	
	public static void JumlahPegawaiYangKerjaDiDinasKesehatan(){
		Satker satkerja = new Satker();
		JSONArray data = satkerja.getqueryJumlahPegawaiYangKerjaDiDinasKesehatan();
		//System.out.println(data);
		showData(data,"satuan_kerja", "count(*)");
	} 
	
	public static void showData(JSONArray arrayData, String fSatu, String fDua) {
		//System.out.println(arrayData);
		System.out.println("+---------------------------------------------+");
		System.out.println("|            Satuan Kerja            | Jumlah |");
		System.out.println("+---------------------------------------------+");
		String space;
		
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	
			
			space=(String) obj.get(fSatu);
			space = space.trim();
			System.out.print("| "+space);
			for (int j = 0; j  <35-(space.length()); j++) {
				System.out.print(" ");
			}
			
			System.out.print("|    "+obj.get(fDua));
			
			
			
					
			System.out.println("   |");
					
			System.out.println("+---------------------------------------------+");
		}
	}
	
	public static void main(String args[]) {
		JumlahPegawaiYangKerjaDiDinasKesehatan();
	}

}