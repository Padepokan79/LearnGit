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
		showData4Parameter(data,"nip", "nama", "bersih", "kdpangkat");
	} // ikan added test for NamaDanGajiBersih
	public static void showData4Parameter(JSONArray arrayData,String fieldsa, String fieldsb, String fieldsc, String fieldsd) {
		//System.out.println(arrayData);
		System.out.println("+-----------------------------------------------------------------+");
		System.out.println("|   NIP           |        Nama    |  Status       |      Golongan    |");
		System.out.println("+-----------------------------------------------------------------+");
		String space;
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);
			//	System.out.println(obj);
			System.out.println("+-------------------------------------------------------+");
			System.out.println("|"+obj.get(fieldsa)+ " "+ ": "+obj.get(fieldsb)+ " "+ ": "+obj.get(fieldsc)+ " "+ ": "+obj.get(fieldsd)+"|" );
		}
	}
}
