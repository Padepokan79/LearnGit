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
}
