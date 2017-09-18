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
	//NIP, NAMA, TGLWAFAT, TGLBAYAR
	public static void tesNamaPNSyangMeninggaldanUangDukaDibayarSetelah1MingguSesudahWafat(){
		
		try {
			System.out.print("Masukan lama uang duka yang diterima keluarga : ");
			inputMasakerja=bf.readLine();
			JSONArray data = utp.getMenampilkanPNSpunyaNPWPdanMasaKerjaLama();
			showData_skpp(data,"nip","nama","npwp","masa_kerja","golongan","jab_struktur");
		}catch (Exception e) {
			System.out.println("Inputan Salah");
			System.out.println(e.getMessage());
		}

	}

	public static void showData_skpp(JSONArray arrayData, String pa, String pb,String pc,String pd,String pe,String pf) {
		//System.out.println(arrayData);
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
			System.out.print(" | "+obj.get(pc)+" |");
			System.out.print(" | "+obj.get(pd)+" |");
			System.out.print(" | "+obj.get(pe)+" |");
			System.out.println(" "+obj.get(pf)+" |");
			System.out.println("+--------------------------------------------------+");
		}


	}//Yusup Add ShowData Hehe... 


	public static void main(String args[]) {
		IpinTest it=new IpinTest();
		it.tesNamaPNSyangMeninggaldanUangDukaDibayarSetelah1MingguSesudahWafat();
	}
}
