package com.padepokan79.test;

import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.DetilKekurangan;
import com.padepokan79.model.InputVariable;
import com.padepokan79.test.MainAgama;

public class MainDetilKekurangan extends InputVariable{
	public  Scanner keyboard = new Scanner( System.in );
	
	public  void testqueryMenampikanMaskerDibawah5TahunDanGajiDiatas25jt() {
		DetilKekurangan dk = new DetilKekurangan();
		
		//try {
			System.out.print("Masukan Masa Kerja : ");
			inputMasaKerja=keyboard.nextInt();
			System.out.print("Masukan Gaji Pokok : ");
			inputGapok=keyboard.nextInt();
			
			JSONArray data = dk.queryMenampikanMaskerDibawah5TahunDanGajiDiatas25jt();
			showData_dk(data,"nip","nama","masker","gapok");
		//} catch (Exception e) {
			//System.out.println("Inputan Salah");
			//System.out.println(e.getMessage());
			// TODO: handle exception
		//}
	}
	public  void showData_dk(JSONArray arrayData, String nip, String nama, String masakerja, String gapok) {
		//System.out.println(arrayData);
		System.out.println("+-------------------------------------------------------------------------------------------+");
		System.out.println("|  NIP                |            Nama Pegawai           | Masa Kerja    |    Gaji Pokok   |");
		System.out.println("+-------------------------------------------------------------------------------------------+");
		String space;
		int tamp;

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	

			space=(String) obj.get(nip);
			System.out.print("| "+space);

			space=(String) obj.get(nama);
			System.out.print("  | "+ space);
			for (int j = 0; j  < 16 - (space.length()); j++) {
				System.out.print(" ");
			}
			tamp=(int) obj.get(masakerja);
			//space = space.valueOf(tamp);
			System.out.print("              | "+ tamp);
			for (int j = 0; j  < 10 - (space.length()); j++) {
				System.out.print(" ");
			}
			tamp=(int) obj.get(gapok);
			//space = space.valueOf(tamp);
			System.out.print("| "+ tamp);
			for (int j = 0; j  < (space.length()); j++) {
				System.out.print(" ");
			}
			System.out.println("|");
			System.out.println("+---------------------------------------------------------------------------------------+");
		}
	}
	public  void main(String args[]) {
		MainDetilKekurangan test = new MainDetilKekurangan();
		test.testqueryMenampikanMaskerDibawah5TahunDanGajiDiatas25jt();
	}
}
