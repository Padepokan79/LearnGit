package com.padepokan79.model;

public interface ListQuery {
	public final String queryNamaDanLakiJomblo = 
			"SELECT nama,bersih FROM fgaji where kdjenkel=1 limit 0,10;";
	public final String queryNamaDanStatusKawin = 
			"SELECT nama,bersih FROM fgaji where kdjenkel=1 limit 0,10;";
	public final String queryNipNamaGajiBersihDiAtas10Jt =
			"select nip, nama, bersih, kdpangkat from fgaji where bersih > 10000000";
	public final String queryNipNamaMasaKerjadiAtas10tahunBelumMenikah = // add by selfi
			"select NIP, NAMA, MASKER, KDSTAWIN FROM fgaji where MASKER > 10 and KDSTAWIN=1";
	public final String queryNamaJandaKembang = 
			"SELECT nama,nip,kdstawin,janak FROM fgaji where kdstawin=3 and janak=0;"; //add by siska
}
