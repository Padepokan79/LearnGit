package com.padepokan79.test;

import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.controller.Agama;



public class MainAgama{
	public  Scanner keyboard = new Scanner( System.in );
	
	public  void testqueryMencariNamaAgama() {
		Agama ag = new Agama();
		
		try {
			System.out.print("Masukan Kode Agama : ");
			int inputKode=keyboard.nextInt();
			JSONArray data = ag.getQueryMencariNamaAgama(inputKode);
			showData_agama(data,"kodeagama","namaagama");
		} catch (Exception e) {
//			System.out.println("Inputan Salah");
			System.out.println(e.getMessage());
			 
		}
	}
	public  void showData_agama(JSONArray arrayData, String kdagama, String nmagama) {
		//System.out.println(arrayData);
		System.out.println("+----------------------------------+");
		System.out.println("|  Kode Agama    |    Nama Agama   |");
		System.out.println("+----------------------------------+");
		String space;
		int tamp;

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	

			tamp=(int) obj.get(kdagama);
			System.out.print("| "+tamp);

			space=(String) obj.get(nmagama);
			System.out.print("              | "+ space);
			for (int j = 0; j  < 16 - (space.length()); j++) {
				System.out.print(" ");
			}
			System.out.println("|");
			System.out.println("+----------------------------------+");
		}
	}
	public static void main(String args[]) {
		MainAgama test = new MainAgama();
		test.testqueryMencariNamaAgama();
	}
}
