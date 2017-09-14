package com.padepokan79.model;

public interface ListQuery {
	public final String queryNamaDanLakiJomblo = 
			"SELECT nama,bersih FROM fgaji where kdjenkel=1 limit 0,10;";
	public final String queryNamaDanStatusKawin = 
			"SELECT nama,bersih FROM fgaji where kdjenkel=1 limit 0,10;";
	public final String queryNipNamaGajiBersihDiAtas10Jt =
			"select nip, nama, bersih, kdpangkat from fgaji where bersih > 10000000 limit 100;";
	public final String queryJombloMasaKerjaDiatas10thn = // add by selfi
			"select NIP, NAMA, MASKER, KDSTAWIN FROM fgaji where MASKER > 10 and KDSTAWIN=1 limit 100;";
	public final String queryNamaJandaKembang = 
			"SELECT nip,nama,kdstawin,janak FROM fgaji where kdstawin=3 and janak=0 limit 100;"; //add by siska

}
