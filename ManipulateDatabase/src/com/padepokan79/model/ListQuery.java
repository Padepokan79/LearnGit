package com.padepokan79.model;

public interface ListQuery {
	public final String queryNamaDanLakiJomblo = 
			"SELECT nama,bersih FROM fgaji where kdjenkel=1 limit 0,10;";
	public final String queryNamaDanStatusKawin = 
			"SELECT nama,bersih FROM fgaji where kdjenkel=1 limit 0,10;";
	public final String queryNipNamaGajiBersihDiAtas10Jt = // add by rzkypprtm
			"select nip, nama, bersih, kdpangkat from fgaji where bersih > 10000000 limit 0,10;";
	public final String queryJombloMasaKerjaDiatas10thn = // add by selfi
			"select NIP, NAMA, MASKER, KDSTAWIN FROM fgaji where MASKER > 10 and KDSTAWIN=1 limit 0,10;";
	public final String queryNamaJandaKembang = 
			"SELECT nip,nama,kdstawin,janak FROM fgaji where kdstawin=3 and janak=0 limit 0,10;"; //add by siska

	public final String queryNamaUsiaAntara25Sampai35 = //add by rzkypprtm
			"SELECT nip, nama, bersih, kdpangkat, TGLLHR as usia from fgaji where kdstawin = '1' and TGLLHR <= '1992/09/14' and TGLLHR >= '1982/09/14' limit 0,10";
	public final String queryNamaSuperDad = 
			"SELECT nip,nama,kdjenkel,tgllhr,kdpangkat,masker,janak FROM fgaji where kdjenkel = 1 and kdpangkat=1  and masker > 20 and janak > 1 limit 0,10;"; //add by siska
	
	
	public final String queryKepalaDinasHaji = 
			"select SATKERJA,descsatker,nama_atasa,jab_atasan from satkerja where descsatker like '%dinas%' and nama_atasa like 'h%' limit 0,10;"; //add by siska	

}
