package com.padepokan79.test;
import org.json.JSONArray;
import org.json.JSONObject;
import com.padepokan79.model.UrtNIP;

public class MainTest {
	public static void main(String[]args) {
		getMenampilkanPNSpunyaNPWPdanMasaKerjaLama();
	}
	//"SELECT nip,nama,kdstawin,janak FROM fgaji where kdstawin=3 and janak=0 limit 0,10;"
	public static void getMenampilkanPNSpunyaNPWPdanMasaKerjaLama(){
		UrtNIP urtNIP = new UrtNIP();
		JSONArray data = urtNIP.getMenampilkanPNSpunyaNPWPdanMasaKerjaLama();
		//System.out.println(data);
		showData6Parameter(data,"nip","nama","npwp","masa_kerja","golongan","jab_struktur");
	} // ikan added test for NamaDanGajiBersih
	public static void showData6Parameter(JSONArray arrayData,String fielda,String fieldb,String fieldc,String fieldd,String fielde,String fieldf) {
		//System.out.println(arrayData);
		System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
		System.out.println("|        NIP       |              nama            |          NPWP        |  Tempat Lahir | Jenis Kelamin |    Agama         |");
		System.out.println("+---------------------------------------------------------------------------------------------------------------------------+");
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
			

//			
//			space=(String) obj.get(fieldi);
//			space = space.trim();
//			System.out.print("|"+space);
//			for (int j = 0; j  <61-(space.length()); j++) {
//				System.out.print(" ");
//			}
			
		
		
			//
//			space=(String) obj.get(fieldd);
//			space = space.trim();
//			System.out.print("    | "+space);
//			for (int j = 0; j  <10-(space.length()); j++) {
//				System.out.print(" ");
//			}
//			space=(String) obj.get(fielde);
//			space = space.trim();
//			System.out.print("    | "+space);
//			for (int j = 0; j  <50-(space.length()); j++) {
//				System.out.print(" ");
//			}
			
			
			
			System.out.println("|");
			System.out.println("+------------------------------------------------------------------------------------------------------------------------------------+");
			
		}
	}	
	
}
