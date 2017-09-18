package com.padepokan79.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.FgajiUangDuka;
import com.padepokan79.model.InputVariable;

public class MainDuka extends InputVariable {
	public static BufferedReader bf=new BufferedReader(new InputStreamReader( System.in) );
	public static String input;
	//NIP, NAMA, TGLWAFAT, TGLBAYAR
	public static void tesNamaPNSyangMeninggaldanUangDukaDibayarSetelah1MingguSesudahWafat(){
		FgajiUangDuka fju=new FgajiUangDuka();
		try {
			System.out.print("Masukan lama uang duka yang diterima keluarga : ");
			inputHari=bf.read();
			JSONArray data = fju.getNamaPNSyangMeninggaldanUangDukaDibayarSetelah1MingguSesudahWafat();
			showData_skpp(data,"nip","nama","tglwafat","tglbayar");
		}catch (Exception e) {
			System.out.println("Inputan Salah");
			System.out.println(e.getMessage());
		}

	}

	public static void showData_skpp(JSONArray arrayData, String pa, String pb,String pc,String pd) {
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
			System.out.println(" "+obj.get(pd)+" |");
			System.out.println("+--------------------------------------------------+");
		}


	}//Yusup Add ShowData Hehe... 


	public static void main(String args[]) {
		MainDuka md=new MainDuka();
		md.tesNamaPNSyangMeninggaldanUangDukaDibayarSetelah1MingguSesudahWafat();
	}
}
