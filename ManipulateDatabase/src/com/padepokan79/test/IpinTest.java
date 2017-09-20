package com.padepokan79.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.InputVariable;
import com.padepokan79.model.UrtNIP;


public class IpinTest extends InputVariable {
	public static BufferedReader bf=new BufferedReader(new InputStreamReader( System.in) );
	public static String input;
	public static UrtNIP utp=new UrtNIP();
	//AGAMA, C_GOLONGAN as GOLONGAN, COUNT(*) as Jumlah 
	public static void tesMenampilkanJumlahPNSberdasrkanAgamadanGolongan(){
		
		try {
			
			JSONArray data = utp.getMenampilkanJumlahPNSberdasrkanAgamadanGolongan();
			showData(data,"agama","golongan","jumlah");
		}catch (Exception e) {
			System.out.println("Inputan Salah");
			System.out.println(e.getMessage());
		}

	}

	public static void showData(JSONArray arrayData, String pa, String pb,String pc) {
		System.out.println(arrayData);
		System.out.println("+--------------------------------------------------+");
		System.out.println("|                Penerbit             |Jumlah Surat|");
		System.out.println("+--------------------------------------------------+");
		String space;
		int tamp=0;
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);
			space = (String) obj.get(pb);
			space=space.trim();
			if(tamp<space.length())
				tamp=space.length();
		}
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	

			System.out.print("| "+obj.get(pa)+" |");

			space = (String) obj.get(pb);
			space=space.trim();
			System.out.print(" "+space);
			for (int j = 0; j  <tamp-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.println(" | "+obj.get(pc)+" |");
			System.out.println("+--------------------------------------------------+");
		}


	}//Yusup Add ShowData Hehe... 


	public static void main(String args[]) {
		IpinTest it=new IpinTest();
		it.tesMenampilkanJumlahPNSberdasrkanAgamadanGolongan();
	}
}
