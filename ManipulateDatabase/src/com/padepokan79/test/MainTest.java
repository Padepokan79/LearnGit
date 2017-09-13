package com.padepokan79.test;
import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.Fgaji;

public class MainTest {
	public static void main(String[]args) {
		NipNamaGajiBersihDiAtas10Jt();
	}
	public static void NipNamaGajiBersihDiAtas10Jt(){
		Fgaji fgaji = new Fgaji();
		JSONArray data = fgaji.getNipNamaGajiBersihDiAtas10Jt();
		//System.out.println(data);
		showData(data,"nip", "nama", "bersih", "kdpangkat");
	} // ikan added test for NamaDanGajiBersih
	public static void showData(JSONArray arrayData,String fieldsa, String fieldsb, String fieldsc, String fieldsd) {
		//System.out.println(arrayData);
		System.out.println("+---------------------------------------------------------------------------+");
		System.out.println("|   NIP            |        Nama              | Status       |     Golongan |");
		System.out.println("+---------------------------------------------------------------------------+");
		String space;
		
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	
			//	System.out.println(obj);
			space=(String) obj.get(fieldsb);
			System.out.print("|"+obj.get(fieldsa));
			System.out.print("|  "+obj.get(fieldsb));
			for (int j = 0; j  <24-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.print("|  "+obj.get(fieldsc));
			System.out.println("    |       "+obj.get(fieldsd)+"     |");
			System.out.println("+---------------------------------------------------------------------------+");
		}
	}
}
