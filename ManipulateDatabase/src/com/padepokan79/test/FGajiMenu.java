package com.padepokan79.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FGajiMenu{
	
	
	public static void main(String args[]) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
		System.out.println("+-------------------------------------------------------------------------+");
		System.out.println("|                                   Menu                                  |");
		System.out.println("| 1. Nama dan Gaji Bersih | 2. Nama dan Status Kawin | 3. Nama dan Jomblo |");
		System.out.println("+-------------------------------------------------------------------------+"); 
		try {
			System.out.println("Masukan PIlihan : ");
			String input=dataIn.readLine();
			System.out.println(input);
		} catch (Exception e) {
			System.out.println("Exception Print !");
			System.out.println(e.getMessage());
		}
		
		
	}
}
