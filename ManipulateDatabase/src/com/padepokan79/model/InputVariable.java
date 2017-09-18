package com.padepokan79.model;

public class InputVariable {
	public static int nextPage = 0;
	
	 
	public static int inputHari;//untuk fgajiUangDuka ,menu on 1
	public static int inputGaji;// untuk fgajiUangDuka ,menu on 2
	public static String inputDate; //format nya 2016-01-01 untuk fgajiUangDuka, menu On 2 & 4
	public static int inputTunjanganIstri;//untuk fgajiUangduka ,menu on 3 & 4
	public static int inputTunjanganAnak;//untuk fgajiUangduka ,menu on 3 & 4

		
	//getGroupByGapokPNS
	public static int inputGapok;

	//getMenampilkanDataYangDibayarkanSatuBulanSetelahDataAwal
	public static String inputBulanAwal;
	public static String inputBulanAkhir;

	//getMenampilkanDataNamaYangHurufAwalADanPangkat3D
	public static String inputHurufAwal;
	public static String inputKodePangkat;
	
	//getMenampilkanTempatLahirDiLimaPuluhDanJenisKelaminPerempuan MENU ON 2
	public static String inputTempatLahir;
	public static String inputJenisKelamin; // P atau L
	
	//getMenampilkanPNSpunyaNPWPdanMasaKerjaLama MENU ON 3
	public static String inputMasakerja; // untuk Memasukan input masa kerja

	//getqueryMenampilkanJumlahPNSyangMempunyaiTunjanganEselonberdasrakanInputanBatasKecildanBatasBesar
	public static int inputTunjanganEselonAwal;
	public static int inputTunjanganEselonAkhir;

}
