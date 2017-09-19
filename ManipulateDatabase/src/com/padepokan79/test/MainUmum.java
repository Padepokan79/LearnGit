package com.padepokan79.test;

import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.InputVariable;
import com.padepokan79.model.Umum;

public  class MainUmum extends InputVariable{
	public static Scanner sc = new Scanner(System.in);
	
	public static void getMencariTJUmumBerdasarkanKodeGolongan() {
		Umum umum = new Umum ();
		System.out.println("Masukan Kode Golongan");
		inputKode = sc.nextInt();
		JSONArray Data = umum.getqueryMencariTJUmumBerdasarkanKodeGolongan();
		showDataMencariTJUmumBerdasarkanKodeGolongan(Data,"tmtberlaku" , "kdgol" , "tjumum");
	}
	public static void showDataMencariTJUmumBerdasarkanKodeGolongan(JSONArray Data,String p1, String p2, String p3 )
	{
		System.out.println();
		System.out.println("+-------------------------------------------------------------------------------------+");
		System.out.println("| 	TMTBERLAKU	 |            KDGOLONGAN            |     TJUMUM              |");
		System.out.println("+-------------------------------------------------------------------------------------+");
		String space;
				System.out.println(Data);
		for (int i = 0; i < Data.length(); i++) {
			JSONObject obj =  Data.getJSONObject(i);	
			
			System.out.println("halo");
			System.out.print("|      "+obj.get(p1));
			
			space=String.valueOf(obj.get(p2)) ;
			System.out.print("     | "+space);
			
			
			System.out.print("     | "+obj.get(p3));
			
			
			System.out.println("|");
					
			System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------------+");
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainUmum mu = new MainUmum();
		mu.getMencariTJUmumBerdasarkanKodeGolongan();

	}

}
