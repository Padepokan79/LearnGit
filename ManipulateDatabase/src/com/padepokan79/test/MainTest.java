package com.padepokan79.test;
import org.json.JSONArray;
import org.json.JSONObject;
import com.padepokan79.model.Hutang;

public class MainTest {
	public  void main(String[]args) {
		queryHutangUntukAnak();
		
	}
	//"SELECT nip,nama,kdstawin,janak FROM fgaji where kdstawin=3 and janak=0 limit 0,10;"
	public  void queryHutangUntukAnak(){
		Hutang hutang = new Hutang();
		JSONArray data = hutang.queryHutangUntukAnak();
		//System.out.println(data);
		showData9Parameter(data,"nip","kdhutang","jmlhutang","jmlcicilan","cicilanakhir","jmlbulan","tmthutang","tathutang","keterangan");
	} // ikan added test for NamaDanGajiBersih
	public  void showData9Parameter(JSONArray arrayData,String fielda,String fieldb,String fieldc,String fieldd,String fielde,String fieldf,String fieldg,String fieldh,String fieldi) {
		//System.out.println(arrayData);
		System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
		System.out.println("|          NIP         |Kode Hutang| Jumlah Hutang |Jumlah Cicilan | Cicilan Akhir | jmlbulan | tmthutang | tathutang |                         keterangan                          |");
		System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
		String space;
		int tmp;
		
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	
			
			
			space=(String) obj.get(fielda);
			System.out.print("|"+space);
			for (int j = 0; j  <22-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.print("|     ");
			System.out.print(obj.get(fieldb));
			System.out.print("     |");
			for (int j = 0; j  <15-(space.length()); j++) {
				System.out.print(" ");
			}
			
			tmp=(int)(obj.get(fieldc));
			space=space.valueOf(tmp);
			System.out.print(tmp);
			for (int j = 0; j  <15-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.print("|");
			tmp=(int)(obj.get(fieldd));
			space=space.valueOf(tmp);
			System.out.print(tmp);
			for (int j = 0; j  <15-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.print("|");
			tmp=(int)(obj.get(fielde));
			space=space.valueOf(tmp);
			System.out.print(tmp);
			for (int j = 0; j  <15-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.print("|");
			tmp=(int)(obj.get(fieldf));
			space=space.valueOf(tmp);
			System.out.print(tmp);
			for (int j = 0; j  <10-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.print("| ");
			System.out.print(obj.get(fieldg));
			System.out.print("| ");
			System.out.print(obj.get(fieldh));

			
			space=(String) obj.get(fieldi);
			space = space.trim();
			System.out.print("|"+space);
			for (int j = 0; j  <61-(space.length()); j++) {
				System.out.print(" ");
			}
			
		
		
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
			System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
			
		}
	}	
	
}
