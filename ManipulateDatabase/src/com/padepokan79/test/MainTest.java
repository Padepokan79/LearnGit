package com.padepokan79.test;
import org.json.JSONArray;
import org.json.JSONObject;
import com.padepokan79.model.Twafat;

public class MainTest {
	public static void main(String[]args) {
		getqueryPenerbitBukanDariLurah();
	}
	//"SELECT nip,nama,kdstawin,janak FROM fgaji where kdstawin=3 and janak=0 limit 0,10;"
	public static void getqueryPenerbitBukanDariLurah(){
		Twafat twafat = new Twafat();
		JSONArray data = twafat.getqueryPenerbitBukanDariLurah();
		//System.out.println(data);
		showData3Parameter(data,"nip", "nama", "penerbit");
	} // ikan added test for NamaDanGajiBersih
	public static void showData3Parameter(JSONArray arrayData,String fielda, String fieldb, String fieldc) {
		//System.out.println(arrayData);
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
			
//			space=(String) obj.get(fieldd);
//			space = space.trim();
//			System.out.print("    | "+space);
//			for (int j = 0; j  <10-(space.length()); j++) {
//				System.out.print(" ");
//			}
//			space=(String) obj.get(fielde);
//			space = space.trim();
//			System.out.print("    | "+space);
//			for (int j = 0; j  <20-(space.length()); j++) {
//				System.out.print(" ");
//			}
			
			System.out.println("|");
			System.out.println("+-----------------------------------------------------------------------------------------------------------+");
		}
	}	
}
