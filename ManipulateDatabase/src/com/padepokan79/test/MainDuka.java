package com.padepokan79.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.FgajiUangDuka;
import com.padepokan79.model.InputVariable;

public class MainDuka extends InputVariable {
	public static Scanner bf=new Scanner( System.in );
	public static String input,quiz;


	static MainActivity ma=new MainActivity();

	public static void mainMenu () {//Modify by Ipin

		System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------------+");
		System.out.println("|                                                           Submenu Uang Duka                                                                    |");
		System.out.println("|------------------------------------------------------------------------------------------------------------------------------------------------|");
		System.out.println("| 1. Data uang Duka yang di bayar setelah 1 minggu | 2. PNS yang tidak memiliki tunjangan keluarga | 3. PNS yang tidak memiliki tunjangan Eselon |");
		System.out.println("|------------------------------------------------------------------------------------------------------------------------------------------------|");
		System.out.println("| 4. Tunjangan lebih dari 1 Juta                   | 5. PNS tidak Punya anak                       | 0. Menu Utama                               |");
		System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------------+");

		try {
			System.out.print("Masukan PIlihan : ");
			String input=bf.next();
			switch (input) {
			case "1":
				tesNamaPNSyangMeninggaldanUangDukaDibayarSetelah1MingguSesudahWafat();
				break;
			case "2":
				tesNamaPNSYangMeningglTanpaTunjanganAnakIstri();
				break;
			case "3":
				tesJumlahPNSYangTidakMempunyaiTunjanganEselonDanTunjanganFungsi();
				break;
			case "4":
				testTGLWafatDanUangBersihLebihDari1Jt();
				break;
			case "5":
				testPnsWafatLebihdar4thnYangmempunyaiIstriTidakMempunyaiAnak();
				break;
			case "0":
				ma.menuUtama();
				break;
			default:
				System.out.println("Masukan anda tidak valid !");
			}

		} catch (Exception e) {
			System.out.println("Exception Print !");
			System.out.println(e.getMessage());
		}

	}

	public static void backto()  {
		String inp;
		System.out.print("1. Menu Utama 2. Submenu Uang Duka : ");
		try {
			inp=bf.next();
			switch (inp) {
			case "1":

				break;
			case "2":
				ma.menuUtama();;
				break;
			case "3":
				mainMenu();
				break;
			default:
				System.out.println("Masukan Salah !");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}



	//NIP, NAMA, TGLWAFAT, TGLBAYAR
	public static void tesNamaPNSyangMeninggaldanUangDukaDibayarSetelah1MingguSesudahWafat(){
		FgajiUangDuka fju=new FgajiUangDuka();
		try {
			System.out.print("Masukan lama uang duka yang diterima keluarga : ");
			inputHari=bf.nextInt();
			JSONArray data = fju.getNamaPNSyangMeninggaldanUangDukaDibayarSetelah1MingguSesudahWafat();
			showData(data,"nip","nama","tglwafat","tglbayar");
		}catch (Exception e) {
			System.out.println("Inputan Salah");
			System.out.println(e.getMessage());
		}

	}

	/*NIP,Nama,tglwafat,tjistri,tjanak*/
	public static void tesNamaPNSYangMeningglTanpaTunjanganAnakIstri(){
		FgajiUangDuka fju=new FgajiUangDuka();
		try {
			System.out.print("Masukan Tunjangan Istri : ");
			inputTunjanganIstri=bf.nextInt();
			System.out.print("Masukan Tunjangan Anak  : ");
			inputTunjanganAnak=bf.nextInt();
			JSONArray data = fju.queryNamaPNSYangMeningglTanpaTunjanganAnakIstri();
			showData(data,"nip","nama","tglwafat","tjistri","tjanak");
		}catch (Exception e) {
			//System.out.println("Inputan Salah");
			System.out.println(e.getMessage());
		}
	}

	public static void tesJumlahPNSYangTidakMempunyaiTunjanganEselonDanTunjanganFungsi(){
		FgajiUangDuka fju=new FgajiUangDuka();
		try {
			JSONArray data = fju.queryJumlahPNSYangTidakMempunyaiTunjanganEselonDanTunjanganFungsi();
			showData(data,"jumlah_pns_nontjseslon_nontjfungsi");
		}catch (Exception e) {
			System.out.println("Inputan Salah");
			System.out.println(e.getMessage());
		}

	}

	public static void testTGLWafatDanUangBersihLebihDari1Jt(){
		FgajiUangDuka fju=new FgajiUangDuka();

		try {
			System.out.print("Masukan Tanggal wafat : ");
			inputDate=bf.next();
			System.out.print("Masukan Penghasilan Bersih : ");
			inputGaji=bf.nextInt();
			JSONArray data = fju.getTGLWafatDanUangBersihLebihDari1Jt();
			showData_tgl(data,"nip","tglwafat","bersih");
		}catch (Exception e) {
			System.out.println("Inputan Salah");
			System.out.println(e.getMessage());
		}
	} // Yusup  added test for TGLWafatDanUangBersihLebihDari1Jt

	//NIP, NAMA, TGLWAFAT, TGLBAYAR
	public static void showData(JSONArray arrayData, String pa, String pb,String pc,String pd) {
		//System.out.println(arrayData);
		System.out.println("+----------------------------------------------------------------------------------+");
		System.out.println("|         NIP        |             Nama            |  Tgl Wafat  |  Tgl Pembayaran |");
		System.out.println("+----------------------------------------------------------------------------------+");
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
			System.out.print(" | "+obj.get(pc)+"  |");
			System.out.println("   "+obj.get(pd)+"    |");
			System.out.println("+----------------------------------------------------------------------------------+");
		}
		System.out.println("N lanjut M Menu : ");
		quiz=bf.next();
		if(quiz.equalsIgnoreCase("N")) {
			nextPage+=10;
			tesNamaPNSyangMeninggaldanUangDukaDibayarSetelah1MingguSesudahWafat();
		}else {
			backto();
		}
	}

	public static void showData(JSONArray arrayData, String pa, String pb,String pc,String pd,String pe) {
		//System.out.println(arrayData);
		System.out.println("+----------------------------------------------------------------------------------------------------+");
		System.out.println("|         NIP        |             Nama            |  Tgl Wafat  |  Tunjangan Istri | Tunjangan Anak |");
		System.out.println("+----------------------------------------------------------------------------------------------------+");
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
			System.out.print(" | "+obj.get(pc)+"  |");
			System.out.print("        "+obj.get(pd)+"         |");
			System.out.println("       "+obj.get(pe)+"        |");
			System.out.println("+----------------------------------------------------------------------------------------------------+");
		}
		System.out.println("Tidak ada next paging !");
		backto();
	}

	public static void showData(JSONArray arrayData, String pa) {
		//System.out.println(arrayData);
		System.out.println("+------------------------------------------+");
		System.out.println("| Jumlah PNS yang tidak memiliki tunjangan |");
		System.out.println("+------------------------------------------+");

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	

			System.out.println("|                    "+obj.get(pa)+"                    |");


			System.out.println("+------------------------------------------+");
		}
		System.out.println("N lanjut M Menu : ");
		quiz=bf.next();
		if(quiz.equalsIgnoreCase("N")) {
			nextPage+=10;
			tesJumlahPNSYangTidakMempunyaiTunjanganEselonDanTunjanganFungsi();
		}else {
			backto();
		}
	}



	public static void showData_tgl(JSONArray arrayData, String fNip, String ftglwaf, String Fbersih) {
		//System.out.println(arrayData);
		System.out.println("+----------------------------------------------------------+");
		System.out.println("|         NIP         |Tanggal Wafat|  Pengghasilan Bersih |");
		System.out.println("+----------------------------------------------------------+");
		String space;

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	

			space=(String) obj.get(fNip);
			System.out.print("| "+space);
			System.out.print("  | "+ obj.get(ftglwaf));
			for (int j = 0; j  <26-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.print("  |         "+ obj.get(Fbersih));
			System.out.println("        |");
			System.out.println("+-------------------------------------------------------------------------------+");
		}
	}//Yusup Add ShowData Hehe...

	public static void testPnsWafatLebihdar4thnYangmempunyaiIstriTidakMempunyaiAnak(){
		FgajiUangDuka fju=new FgajiUangDuka();

		try {
			System.out.print("Masukan Tanggal wafat : ");
			inputDate=bf.next();
			System.out.print("Masukan Tunjangan Istri : ");
			inputTunjanganIstri=bf.nextInt();
			System.out.print("Masukan Tunjangan Anak : ");
			inputTunjanganAnak=bf.nextInt();

			JSONArray data = fju.queryPnsWafatLebihdar4thnYangmempunyaiIstriTidakMempunyaiAnak();
			showData_tj(data,"nip","tglwafat","tjistri","tjanak");
		}catch (Exception e) {
			System.out.println("Inputan Salah");
			System.out.println(e.getMessage());
		}
	} // Yusup  added test for TGLWafatDanUangBersihLebihDari1Jt

	public static void showData_tj(JSONArray arrayData, String fNip, String ftglwaf, String Ftjis, String Ftjanak) {
		//System.out.println(arrayData);
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println("|         NIP         |Tanggal Wafat|  Tunjangan Istri  |  Tunjangan Anak  |");
		System.out.println("+--------------------------------------------------------------------------+");
		String space;
		int tamp;

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	

			space=(String) obj.get(fNip);
			System.out.print("| "+space);


			System.out.print("  | "+ obj.get(ftglwaf));
			for (int j = 0; j  <6-(space.length()); j++) {
				System.out.print(" ");
			}

			tamp =(int) obj.get(Ftjis);
			space = space.valueOf(tamp);
			System.out.print("  |      "+ space);
			for (int j = 0; j  <11-(space.length()); j++) {
				System.out.print(" ");
			}

			System.out.print("  |         "+ obj.get(Ftjanak));
			System.out.println("        |");
			System.out.println("+--------------------------------------------------------------------------+");
		}
	}//Yusup Add ShowData Hehe...

	public static void main(String args[]) {
		MainDuka md=new MainDuka();
		md.testTGLWafatDanUangBersihLebihDari1Jt();
	}
}
