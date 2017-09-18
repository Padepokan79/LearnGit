package com.padepokan79.test;

import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.Keluarga;
import com.padepokan79.model.Satker;
import com.padepokan79.model.Twafat;

public class YusupTest {
	
	//Add Yusup pada tabel Satker
	
	public static void testBendaharaPembantuDaftarGaji(){
		Satker objSatker =new Satker();
		JSONArray data = objSatker.getqueryBendaharaPembantuDaftarGaji(); 
		showData(data,"satkerja","descsatker","nip_bend","nama_bend","jab_bend","jab_operat");
	} // Yusup  added test for BendaharaPembantuDaftarGaji
	
	public static void showData(JSONArray arrayData, String fSatker, String fdescsatker, String fnip_bend, String fnama_bend, String fjab_bend, String fjab_operat) {
		//System.out.println(arrayData);
		System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
		System.out.println("|Satuan kerja|     Deskripsi Satuan kerja    |    Nip Bendahara    |         Nama Bendahara        |                   Jabatan Bendahara                 |             Jabatan Operator          |");
		System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
		String space;

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	

			space=(String) obj.get(fSatker);
			System.out.print("| "+space);

			space=(String) obj.get(fdescsatker);
			space = space.trim();
			System.out.print("        | "+space);
			for (int j = 0; j  <28-(space.length()); j++) {
				System.out.print(" ");
			}
			
			space=(String) obj.get(fnip_bend);
			space = space.trim();
			System.out.print("  | "+space);
			for (int j = 0; j  <18-(space.length()); j++) {
				System.out.print(" ");
			}
		
			space=(String) obj.get(fnama_bend);
			space = space.trim();
			System.out.print("  | "+space);
			for (int j = 0; j  <30-(space.length()); j++) {
				System.out.print(" ");
			}
			space=(String) obj.get(fjab_bend);
			space = space.trim();
			System.out.print("|"+space);
			for (int j = 0; j  <53-(space.length()); j++) {
				System.out.print(" ");
			}
			
			space=(String) obj.get(fjab_operat);
			space = space.trim();
			System.out.print("| "+space);
			for (int j = 0; j  <38-(space.length()); j++) {
				System.out.print(" ");
			}

			System.out.println("|");
			System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
		}
	}//Yusup Add ShowData Hehe...
	
	
	public static void testDaftarPegawaiYangMatiSebelumTahun2013(){
		Twafat objwafat =new Twafat();
		
		JSONArray data = objwafat.getqueryDaftarPegawaiYangMatiSebelumTahun2013(); 
		
		showData(data,"nip","nama","tglwafat");
	} // Yusup  added test for DaftarPegawaiYangMatiSebelumTahun2013
	
	public static void showData(JSONArray arrayData, String fNip, String fNama, String fTgl) {
		//System.out.println(arrayData);
		System.out.println("+--------------------------------------------------------+");
		System.out.println("|         NIP         |        Nama       |Tanggal Wafat|");
		System.out.println("+--------------------------------------------------------+");
		String space;

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	

			space=(String) obj.get(fNip);
			System.out.print("| "+space);

			space=(String) obj.get(fNama);
			space = space.trim();
			System.out.print("  | "+space);
			for (int j = 0; j  <16-(space.length()); j++) {
				System.out.print(" ");
			}
			
			System.out.print("  | "+ obj.get(fTgl));
			for (int j = 0; j  <18-(space.length()); j++) {
				System.out.print(" ");
			}
		
			System.out.println("|");
			System.out.println("+--------------------------------------------------------+");
		}
	}//Yusup Add ShowData Hehe...
	
	
	
	
	//Tabel Keluarga
	public static void testKeluargaPNSyangSudahMenikahDanMempunyaiKartuSuamiIstri(){
		Keluarga objkeluarga =new Keluarga();
		
		JSONArray data = objkeluarga.queryKeluargaPNSyangSudahMenikahDanMempunyaiKartuSuamiIstri(); 
		
		showData(data,"nip","nama","tglnikah","nipsuamiistri");
	} // Yusup  added test for KeluargaPNSyangSudahMenikahDanMempunyaiKartuSuamiIstri
	
	public static void showData(JSONArray arrayData, String fNip, String fNama, String Ftglnikah, String fnipSI) {
		//System.out.println(arrayData);
		System.out.println("+-------------------------------------------------------------------------------------------+");
		System.out.println("|         NIP         |               Nama                 |Tanggal Nikah|  Nip Suami Istri |");
		System.out.println("+-------------------------------------------------------------------------------------------+");
		String space;

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	

			space=(String) obj.get(fNip);
			System.out.print("| "+space);

			space=(String) obj.get(fNama);
			space = space.trim();
			System.out.print("  | "+space);
			for (int j = 0; j  <33-(space.length()); j++) {
				System.out.print(" ");
			}
			
			
			System.out.print("  | "+ obj.get(Ftglnikah));
			for (int j = 0; j  <5-(space.length()); j++) {
				System.out.print(" ");
			}
		
			
			space=(String) obj.get(fnipSI);
			space = space.trim();
			System.out.print("  |"+space);
			for (int j = 0; j  <18-(space.length()); j++) {
				System.out.print(" ");
			}
			
			System.out.println("|");
			System.out.println("+-------------------------------------------------------------------------------------------+");
		}
	}//Yusup Add ShowData Hehe...
	
	
	
	public static void testNamaKeluargaPNSyangPernahMenikahLaluCerai(){
		Keluarga objkeluarga =new Keluarga();
		
		JSONArray data = objkeluarga.queryNamaKeluargaPNSyangPernahMenikahLaluCerai(); 
		
		showData_(data,"nip","nama","tglnikah","tglcerai");
	} // Yusup  added test for NamaKeluargaPNSyangPernahMenikahLaluCerai
	
	public static void showData_(JSONArray arrayData, String fNip, String fNama, String Ftglnikah, String ftglcerai) {
		//System.out.println(arrayData);
		System.out.println("+---------------------------------------------------------------------------+");
		System.out.println("|         NIP         |          Nama           |Tanggal Nikah|Tanggal Cerai|");
		System.out.println("+---------------------------------------------------------------------------+");
		String space;

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	

			space=(String) obj.get(fNip);
			System.out.print("| "+space);

			space=(String) obj.get(fNama);
			space = space.trim();
			System.out.print("  | "+space);
			for (int j = 0; j  <22-(space.length()); j++) {
				System.out.print(" ");
			}
			
			
			System.out.print("  | "+ obj.get(Ftglnikah));
			for (int j = 0; j  <5-(space.length()); j++) {
				System.out.print(" ");
			}
		
			System.out.print("  |"+obj.get(ftglcerai));
			for (int j = 0; j  <9-(space.length()); j++) {
				System.out.print(" ");
			}
			
			System.out.println("   |");
			System.out.println("+---------------------------------------------------------------------------+");
		}
	}//Yusup Add ShowData Hehe...
	public static void main(String args[]) {
		//testBendaharaPembantuDaftarGaji();
		//testDaftarPegawaiYangMatiSebelumTahun2013();
		testKeluargaPNSyangSudahMenikahDanMempunyaiKartuSuamiIstri();
		//testNamaKeluargaPNSyangPernahMenikahLaluCerai();
		
	}
	
	
		
}
