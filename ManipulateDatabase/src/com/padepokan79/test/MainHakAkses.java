package com.padepokan79.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.FgajiUangDuka;
import com.padepokan79.model.Guru;
import com.padepokan79.model.InputVariable;

public class MainHakAkses extends InputVariable {
	public static Scanner sc=new Scanner( System.in );
	//KodeGuru, NamaGuru,
	public static void tesMencariKodeGuruDitabelGuru(){
		Guru guru = new Guru();
		try {
			System.out.print("Masukan Kode Guru 1 s.d 17 : ");
			inputKode = sc.nextInt();
			JSONArray data = guru.getqueryMencariKodeGurudiTabelGuruTBL();
			showData_skpp(data,"kodeguru","namaguru");
		}catch (Exception e) {
			System.out.println("Inputan Salah");
			System.out.println(e.getMessage());
		}
	}
	
	public static void showData_skpp(JSONArray arrayData, String pa, String pb) {
		//System.out.println(arrayData);
		System.out.println("+--------------------------------------------------+");
		System.out.println("|                KodeGuru             |  NamaGuru  |");
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
			System.out.println("+--------------------------------------------------+");
		}


	}//Yusup Add ShowData Hehe... 


	public static void main(String args[]) {
		MainGuru md=new MainGuru();
		md.tesMencariKodeGuruDitabelGuru();
	}


}
