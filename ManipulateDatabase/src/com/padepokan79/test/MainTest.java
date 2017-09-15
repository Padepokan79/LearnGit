package com.padepokan79.test;
import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.Fgaji;

public class MainTest {
	public static void main(String[]args) {
		getNamaJandaKembang();
	}
	//"SELECT nip,nama,kdstawin,janak FROM fgaji where kdstawin=3 and janak=0 limit 0,10;"
	public static void getNamaJandaKembang(){
		Fgaji fgaji = new Fgaji();
		JSONArray data = fgaji.getNamaJandaKembang();
		//System.out.println(data);
		showData4Parameter(data,"nip", "nama", "kdstawin", "janak");
	} // ikan added test for NamaDanGajiBersih
	public static void showData4Parameter(JSONArray arrayData,String fieldsa, String fieldsb, String fieldsc, String fieldsd) {
		//System.out.println(arrayData);
		System.out.println("+---------------------------------------------------------------------------------+");
		System.out.println("|   NIP            |        Nama              | Status Perkawinan  |  Jumlah Anak |");
		System.out.println("+---------------------------------------------------------------------------------+");
		String space;
		
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	
			//	System.out.println(obj);
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
	}
}
