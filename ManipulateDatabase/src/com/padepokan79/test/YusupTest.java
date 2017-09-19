package com.padepokan79.test;


import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.InputStreamReader;

import com.padepokan79.model.FgajiUangDuka;
import com.padepokan79.model.InputVariable;
import com.padepokan79.model.Keluarga;
import com.padepokan79.model.Satker;
import com.padepokan79.model.SkppPegawai;
import com.padepokan79.model.Ttunjangan;
import com.padepokan79.model.Twafat;

public class YusupTest extends InputVariable{

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




	// //Add Yusup pada tabel keluarga
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




	 //Add Yusup pada tabel SkppPegawai
	
	public static void testNamaPnsYangmempunyaiAnakTapiTidakMempunyaiIstri(){
		SkppPegawai objskp =new SkppPegawai();

		JSONArray data = objskp.getNamaPnsYangmempunyaiAnakTapiTidakMempunyaiIstri(); 

		showData_Duda(data,"nip","nama","tjistri","tjanak");
	} // Yusup  added test for NamaKeluargaPNSyangPernahMenikahLaluCerai

	public static void showData_Duda(JSONArray arrayData, String fNip, String fNama, String Ftjis, String ftjanak) {
		//System.out.println(arrayData);
		System.out.println("+--------------------------------------------------------------------------------------+");
		System.out.println("|         NIP         |            Nama              |Tunjangan Istri|  Tunjangan Anak |");
		System.out.println("+--------------------------------------------------------------------------------------+");
		String space;
		int tamp;

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	

			space=(String) obj.get(fNip);
			System.out.print("| "+space);

			space=(String) obj.get(fNama);
			space = space.trim();
			System.out.print("  | "+space);
			for (int j = 0; j  <27-(space.length()); j++) {
				System.out.print(" ");
			}

			tamp =(int) obj.get(Ftjis);
			space =space.valueOf(tamp);
			System.out.print("  |       "+ space);
			for (int j = 0; j  <8-(space.length()); j++) {
				System.out.print(" ");
			}
			tamp =(int) obj.get(ftjanak);
			space =space.valueOf(tamp);
			System.out.print("|       "+space);
			for (int j = 0; j  <8-(space.length()); j++) {
				System.out.print(" ");
			}

			System.out.println("  |");
			System.out.println("+--------------------------------------------------------------------------------------+");
		}
	}//Yusup Add ShowData Hehe...


	public static void testNamaPnsYangPensiunTahunIni(){
		SkppPegawai objskp =new SkppPegawai();

		JSONArray data = objskp.getNamaPnsYangPensiunTahunIni(); 

		showData_YangpensiunTahunini(data,"nip","nama","tmtpensiun");
	} // Yusup  added test for NamaPnsYangPensiunTahunIni

	public static void showData_YangpensiunTahunini(JSONArray arrayData, String fNip, String fNama, String Ftmtpensiun) {
		//System.out.println(arrayData);
		System.out.println("+-------------------------------------------------------------------------------+");
		System.out.println("|         NIP         |             Nama            |Tanggal Mulai Tugas Pensiun|");
		System.out.println("+-------------------------------------------------------------------------------+");
		String space;

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	

			space=(String) obj.get(fNip);
			System.out.print("| "+space);

			space=(String) obj.get(fNama);
			space = space.trim();
			System.out.print("  | "+space);
			for (int j = 0; j  <26-(space.length()); j++) {
				System.out.print(" ");
			}


			System.out.print("  |         "+ obj.get(Ftmtpensiun));
			System.out.println("        |");
			System.out.println("+-------------------------------------------------------------------------------+");
		}
	}//Yusup Add ShowData Hehe...

	public static void testNamaPNSYangSkepnyaDiterbitkanOlehPresiden(){
		SkppPegawai objskp =new SkppPegawai();

		JSONArray data = objskp.getNamaPNSYangSkepnyaDiterbitkanOlehPresiden(); 

		showData(data,"nip","nama","tanggal_lahir","tanggal_berhenti","pangkat","masa_kerja","penerbit");
	} // Yusup  added test for NamaPNSYangSkepnyaDiterbitkanOlehPresiden

	public static void showData(JSONArray arrayData, String fNip, String fNama, String Ftgllahir, String ftglhenti, String Fpkt, String Fmasa_k, String Fpnerbit) {
		//System.out.println(arrayData);
		System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------+");
		System.out.println("|         NIP         |              Nama             |Tanggal Lahir|Tanggal Berhenti|  Pangkat  |Masa Kerja|              Penerbit          |");
		System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------+");
		String space;

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	

			space=(String) obj.get(fNip);
			System.out.print("| "+space);

			space=(String) obj.get(fNama);
			space = space.trim();
			System.out.print("  | "+space);
			for (int j = 0; j  <28-(space.length()); j++) {
				System.out.print(" ");
			}


			System.out.print("  | "+ obj.get(Ftgllahir));
			for (int j = 0; j  <5-(space.length()); j++) {
				System.out.print(" ");
			}

			System.out.print("  |   "+obj.get(ftglhenti));
			for (int j = 0; j  <10-(space.length()); j++) {
				System.out.print(" ");
			}

			space=(String) obj.get(Fpkt);
			space = space.trim();
			System.out.print("   |    "+space);
			for (int j = 0; j  <5-(space.length()); j++) {
				System.out.print(" ");
			}



			System.out.print("  |    "+obj.get(Fmasa_k));
			for (int j = 0; j  <3-(space.length()); j++) {
				System.out.print(" ");
			}

			space=(String) obj.get(Fpnerbit);
			space = space.trim();
			System.out.print("   |  "+space);
			for (int j = 0; j  <10-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.println("   |");
			System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------+");
		}
	}//Yusup Add ShowData Hehe...

	public static void testTampilkanJumlahSKPP_PNSberdasarkanKodePangkat(){
		SkppPegawai objskp =new SkppPegawai();

		JSONArray data = objskp.getTampilkanJumlahSKPP_PNSberdasarkanKodePangkat(); 

		showData(data,"kode_pangkat","jumlah_pns");
	} // Yusup  added test for NamaPnsYangPensiunTahunIni

	public static void showData(JSONArray arrayData, String fkdPns, String fjmlPns) {
		//System.out.println(arrayData);
		System.out.println("+-----------------------+");
		System.out.println("|Kode Pangkat|Jumlah PNS|");
		System.out.println("+-----------------------+");
		String space;
		long tamp;

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	

			space=(String) obj.get(fkdPns);
			System.out.print("|     "+space);

			tamp =(long) obj.get(fjmlPns);
			space = space.valueOf(tamp);
			System.out.print("     |   "+space);
			for (int j = 0; j  <4-(space.length()); j++) {
				System.out.print(" ");
			}
			

			System.out.println("   |");
			System.out.println("+-----------------------+");
		}
	}//Yusup Add ShowData Hehe...

	public static void testTampilkanJumlahSuratSKPPberdasarkanPenerbitnya(){
		SkppPegawai objskp =new SkppPegawai();

		JSONArray data = objskp.getTampilkanJumlahSuratSKPPberdasarkanPenerbitnya(); 

		showData_skpp(data,"penerbit","jumlah_surat");
	} // Yusup  added test for testTampilkanJumlahSuratSKPPberdasarkanPenerbitnya()

	public static void showData_skpp(JSONArray arrayData, String fpenerbit, String fjmls) {
		//System.out.println(arrayData);
		System.out.println("+--------------------------------------------------+");
		System.out.println("|                Penerbit             |Jumlah Surat|");
		System.out.println("+--------------------------------------------------+");
		String space;
		long tamp;
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	

			space=(String) obj.get(fpenerbit);
			System.out.print("| "+space);
			for (int j = 0; j  <36-(space.length()); j++) {
				System.out.print(" ");
			}
			tamp =(long) obj.get(fjmls);
			space = space.valueOf(tamp);
			System.out.print("|     "+space);
			for (int j = 0; j  <6-(space.length()); j++) {
				System.out.print(" ");
			}

			System.out.println(" |");
			System.out.println("+--------------------------------------------------+");
		}
	}//Yusup Add ShowData Hehe...

	
	
	
	//Add Yusup pada tabel fgaji_uangduka
	public static Scanner sf=new Scanner( System.in );
	
	
	
	public static void testPnsWafatLebihdar4thnYangmempunyaiIstriTidakMempunyaiAnak(){
		FgajiUangDuka fju=new FgajiUangDuka();
		
		try {
			System.out.print("Masukan Tanggal wafat : ");
			inputDate=sf.next();
			System.out.print("Masukan Tunjangan Istri : ");
			inputTunjanganIstri=sf.nextInt();
			System.out.print("Masukan Tunjangan Anak : ");
			inputTunjanganAnak=sf.nextInt();
			
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
	
	
	
	
	//Add Yusup pada tabel Ttunjangan
	public static void testMenampilkanJumlahPNSYangPensiunBerdasarkanKodeJabatandanUsiaJabatan(){
		Ttunjangan objTj =new Ttunjangan();

		JSONArray data = objTj.getqueryMenampilkanJumlahPNSYangPensiunBerdasarkanKodeJabatandanUsiaJabatan(); 

		showData_jml_pns(data,"kode_jabatan","usia_pensiun","jumlah");
	} // Yusup  added test for NamaPnsYangPensiunTahunIni

	public static void showData_jml_pns(JSONArray arrayData, String Fkd, String usiap, String jml) {
		//System.out.println(arrayData);
		System.out.println("+-------------------------------------------+");
		System.out.println("| Kode Jabatan | Usia Pensiun | Jumlah PNS  |");
		System.out.println("+-------------------------------------------+");
		String space;
		long tam;
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	

			space=(String) obj.get(Fkd);
			System.out.print("|      "+space);
			for (int j = 0; j  <6-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.print("  |      "+obj.get(usiap));
			for (int j = 0; j  <6-(space.length()); j++) {
				System.out.print(" ");
			}
			tam = (long)  obj.get(jml);
			space =space.valueOf(tam);
			System.out.print("  |     "+ tam);
			for (int j = 0; j  <2-(space.length()); j++) {
				System.out.print(" ");
			}
	
			System.out.println("      |");
			System.out.println("+-------------------------------------------+");
		}
	}//Yusup Add ShowData Hehe...

	public static void testMenampilkanJumlahPNSYangPensiunBerdasarkanJumlahUangPensiun(){
		Ttunjangan ftj=new Ttunjangan();
		
		try {
			System.out.print("Masukan Jumlah Tunjangan dari : ");
			inputJumlahAwal=sf.nextInt();
			System.out.print("Masukan Jumlah Tunjangan sampai : ");
			inputJumlahAkhir=sf.nextInt();
			
			JSONArray data = ftj.getqueryMenampilkanJumlahPNSYangPensiunBerdasarkanJumlahUangPensiun();
			showData_jml(data,"jumlah","jumlah_pns");
		}catch (Exception e) {
			System.out.println("Inputan Salah");
			System.out.println(e.getMessage());
		}
	} // Yusup  added test for TGLWafatDanUangBersihLebihDari1Jt

	public static void showData_jml(JSONArray arrayData, String jml_t, String jml_pns) {
		//System.out.println(arrayData);
		System.out.println("+-------------------------------------+");
		System.out.println("| Jumlah Tunjangan Pensiun |Jumlah PNS|");
		System.out.println("+-------------------------------------+");
		String space = null;
		long tamp;

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);
			
			tamp = (long)  obj.get(jml_t);
			space =space.valueOf(tamp);
			System.out.print("|        "+ tamp);
			for (int j = 0; j  <8-(space.length()); j++) {
				System.out.print(" ");
			}
			
			tamp = (long)  obj.get(jml_pns);
			space =space.valueOf(tamp);
			System.out.print("          |     "+ tamp);
			for (int j = 0; j  <5-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.println("     |");
			System.out.println("+---------------------------------------+");
		}
		
	}//Yusup Add ShowData Hehe...
	
	public static void testMenampilkanPNSyangPensiunKurangdariUsia60(){
		Ttunjangan objTj =new Ttunjangan();
		JSONArray data = objTj.getqueryMenampilkanPNSyangPensiunKurangdariUsia60(); 

		showData_tblTT(data,"kdkel","kdjab","nmjabatan","jml","pensiun");
	} // Yusup  added test for NamaPnsYangPensiunTahunIni

	public static void showData_tblTT(JSONArray arrayData, String Fkd,String kdjb,String nmjb, String jml, String pen) {
		//System.out.println(arrayData);
		System.out.println("+------------------------------------------------------------------------------------------------------------------+");
		System.out.println("| Kode Keluarga| Kode Jabatan |                       Nama Jabatan                       |    Jumlah   |  Pensiun  |");
		System.out.println("+------------------------------------------------------------------------------------------------------------------+");
		String space;
		long tam;
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);	

			space=(String) obj.get(Fkd);
			System.out.print("|    "+space);
			for (int j = 0; j  <10-(space.length()); j++) {
				System.out.print(" ");
			}
			
			space=(String) obj.get(kdjb);
			System.out.print("|      "+space);
			for (int j = 0; j  <6-(space.length()); j++) {
				System.out.print(" ");
			}
			
			space=(String) obj.get(nmjb);
			System.out.print("  | "+ obj.get(nmjb));
			for (int j = 0; j  <56-(space.length()); j++) {
				System.out.print(" ");
			}
			
			tam = (long)  obj.get(jml);
			space =space.valueOf(tam);
			System.out.print(" |   "+ tam);
			for (int j = 0; j  <8-(space.length()); j++) {
				System.out.print(" ");
			}
			System.out.print("  |    "+ obj.get(pen));
			for (int j = 0; j  <5-(space.length()); j++) {
				System.out.print(" ");
			}
	
			System.out.println("     |");
			System.out.println("+------------------------------------------------------------------------------------------------------------------+");
		}
	}//Yusup Add ShowData Hehe...
	//Main
	public static void main(String args[]) {
		YusupTest tes =new YusupTest();
		//tes.testPnsWafatLebihdar4thnYangmempunyaiIstriTidakMempunyaiAnak();
		
		tes.testMenampilkanPNSyangPensiunKurangdariUsia60();
		
	}



}
