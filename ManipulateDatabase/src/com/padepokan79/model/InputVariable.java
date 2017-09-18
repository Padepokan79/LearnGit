package com.padepokan79.model;

public class InputVariable {
	public static int nextPage = 0;
	
	 
	public static int inputHari;//untuk fgajiUangDuka ,menu on 1
	public static int inputGaji;// untuk fgajiUangDuka ,menu on 2
	public static String inputDate; //format nya 2016-01-01 untuk fgajiUangDuka, menu On 2 & 4
	public static int inputTunjanganIstri;//untuk fgajiUangduka ,menu on 3 & 4
	public static int inputTunjanganAnak;//untuk fgajiUangduka ,menu on 3 & 4

		
	//getGroupByGapokPNS
	public static int inputGapok;//umtuk class DataRapel ,menu on 1 dan class detil_kekurangan menu on 1

	//getMenampilkanDataYangDibayarkanSatuBulanSetelahDataAwal
	public static String inputBulanAwal;
	public static String inputBulanAkhir;

	//getMenampilkanDataNamaYangHurufAwalADanPangkat3D
	public static String inputHurufAwal;
	public static String inputKodePangkat;//untul class DataRapel ,menu on 4 dan untuk class detil_kekurangan ,menu on 5
	
	//getqueryMenampilkanJumlahPNSyangMempunyaiTunjanganEselonberdasrakanInputanBatasKecildanBatasBesar
	public static int inputTunjanganEselonAwal;
	public static int inputTunjanganEselonAkhir;
	
	
	public static int inputMasaKerja;//untuk class detil_kekurangan menu on 1
	public static String inputTanggalBayar;//untuk class detil_kekurangan ,menu on 4
	
}
