package com.padepokan79.test;
import org.json.JSONArray;
import org.json.JSONObject;
import com.padepokan79.model.Hutang;

public class MainTest {
	public static void main(String[]args) {
		queryHutangPalingBanyak();
		queryHutangPalingbanyak();
	}
	//"SELECT nip,nama,kdstawin,janak FROM fgaji where kdstawin=3 and janak=0 limit 0,10;"
	public static void queryHutangPalingBanyak(){
		Hutang hutang = new Hutang();
		JSONArray data = hutang.queryHutangPalingBanyak();
		//System.out.println(data);
		showData2Parameter(data,"nip","nama","jumlah_hutang");
	} // ikan added test for NamaDanGajiBersih
	public static void showData2Parameter(JSONArray arrayData,String fielda,String fieldb,String fieldc) {
		//System.out.println(arrayData);
		System.out.println("+----------------------------------------------------------------------------+");
		System.out.println("|          NIP         |                NAMA             |   Jumlah Hutang   |");
		System.out.println("+----------------------------------------------------------------------------+");
		String space;
		
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	
			
			
			space=(String) obj.get(fielda);
			space = space.trim();
			System.out.print("|"+space);
			for (int j = 0; j  <22-(space.length()); j++) {
				System.out.print(" ");
			}
			space=(String) obj.get(fieldb);
			space = space.trim();
			System.out.print("|"+space);
			for (int j = 0; j  <33-(space.length()); j++) {
				System.out.print(" ");
			}
			
			
			System.out.print("|");
			System.out.print(obj.get(fieldc));
			System.out.println("           |");
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
//			for (int j = 0; j  <20-(space.length()); j++) {
//				System.out.print(" ");
//			}
			
			
			
			
			System.out.println("+----------------------------------------------------------------------------+");
			
		}
	}	
	public static void queryHutangPalingbanyak(){
		Hutang hutang = new Hutang();
		JSONArray data = hutang.queryHutangPalingbanyak();
		//System.out.println(data);
		showData3Parameter(data,"nip","jmlbulan","jmlhutang");
	} // ikan added test for NamaDanGajiBersih
	public static void showData3Parameter(JSONArray arrayData,String fielda,String fieldb,String fieldc) {
		//System.out.println(arrayData);
		System.out.println("+-----------------------------------------------------------+");
		System.out.println("|          NIP         |  Jumlah Bulan |   Jumlah Hutang    |");
		System.out.println("+-----------------------------------------------------------+");
		String space;
		
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	
			
			
			space=(String) obj.get(fielda);
			space = space.trim();
			System.out.print("|"+space);
			for (int j = 0; j  <22-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.print("|        ");
			System.out.print(obj.get(fieldb));
			
			System.out.print("      |");
			

			System.out.print(obj.get(fieldc));
			
			System.out.println("            |");
			
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
//			for (int j = 0; j  <20-(space.length()); j++) {
//				System.out.print(" ");
//			}
			
			
			
			
			System.out.println("+----------------------------------------------------------+");
			
		}
	}	
	
}
