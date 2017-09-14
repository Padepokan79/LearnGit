package com.padepokan79.model;

public interface ListQuery {
	public final String queryNamaDanLakiJomblo = 
			"SELECT nama,bersih FROM fgaji where kdjenkel=1 limit 0,10;";
	public final String queryNamaDanStatusKawin = 
			"SELECT nama,bersih FROM fgaji where kdjenkel=1 limit 0,10;";
	public final String queryNipNamaGajiBersihDiAtas10Jt = // add by rzkypprtm
			"select nip, nama, bersih, kdpangkat from fgaji where bersih > 10000000 limit 0,10;";
	public final String queryJombloMasaKerjaDiatas10thn = // add by selfi
			"select NIP, NAMA, MASKER, KDSTAWIN FROM fgaji where MASKER > 10 and KDSTAWIN=0 limit 0,10;";
	public final String queryNamaJandaKembang = 
			"SELECT DISTINCT nip,nama,kdjenkel,kdstawin,janak FROM fgaji where kdjenkel=2 and kdstawin=3 and janak=0 limit 100;"; //add by siska
	public final String queryNamaUsiaAntara25Sampai35 = //add by rzkypprtm
			"SELECT nip, nama, bersih, kdpangkat, TGLLHR as usia from fgaji where kdstawin = '1' and TGLLHR <= '1992/09/14' and TGLLHR >= '1982/09/14' limit 0,10;";
	public final String queryNamaSuperDad = 
			"SELECT nip,nama,kdjenkel,tgllhr,kdpangkat,masker,janak FROM fgaji where kdjenkel = 1 and kdpangkat=1  and masker > 20 and janak > 1 limit 0,10;"; //add by siska


//========================================================================================================================================
// tabel 2 SATKERJA
	
	public final String queryNamaAtasanDRSDanJabatanCamat =  // tambahan selfi
			"SELECT SATKERJA,JAB_ATASAN,DESCSATKER,KOTA, NAMA_ATASA AS NAMA_ATASAN FROM satkerja WHERE NAMA_ATASA LIKE 'DRS%' AND JAB_ATASAN LIKE 'CAMAT%' ;";
	public final String queryKepalaDinasHaji = 
			"select SATKERJA,descsatker,nama_atasa,jab_atasan from satkerja where descsatker like '%dinas%' and nama_atasa like 'h%' ;"; //add by siska	
	public final String queryBendaharaPembantuDaftarGaji = 
			"select SATKERJA,descsatker,nip_bend,nama_bend,jab_bend,jab_operat from satkerja where jab_bend like '%pembantu%' and jab_operat like '%gaji%';"; //add by siska	
	public final String queryNamaOperatorDenganAkhiranH = // add by rzkypprtm
			"SELECT SATKERJA as Satuan_Kerja, DESCSATKER as Deskripsi, Kota, nama_opera as Nama_Operator from satkerja where nama_opera like '%h';";
	public final String queryJumlahPegawaiYangKerjaDiDinasKesehatan = // add by rzkypprtm
			"SELECT DESCSATKER as Satuan_Kerja, COUNT(*) from satkerja where DESCSATKER like '%PUSKESMAS%' or DESCSATKER like '%KESEHATAN%' GROUP BY DESCSATKER LIMIT 0,10;";



//===========================================================================================================================================
//tabel 3 twafat

	public final String queryNIPNamaTanggalWafat = // add by rzkypprtm
			"SELECT twafat.NIP,mstpegawai.nama,twafat.TGLWAFAT FROM twafat,mstpegawai WHERE twafat.NIP = mstpegawai.NIP AND twafat.TGLWAFAT > '2014/04/31';";
	public final String queryKdKubKelPenerimaKosong =
			"select twafat.NIP,mstpegawai.nama,twafat.TGLWAFAT,penerbit,kdhubkelpenerima from  twafat,mstpegawai where twafat.NIP = mstpegawai.NIP AND twafat.TGLWAFAT and kdhubkelpenerima=''  limit 10;"; //add by siska
	public final String queryPenerbitBukanDariLurah = // add by selfi
			"select twafat.NIP,mstpegawai.nama, twafat.PENERBIT from twafat,mstpegawai where twafat.NIP=mstpegawai.NIP AND NOT PENERBIT LIKE '%lurah%' limit 10;";
	public final String queryDaftarPegawaiYangMatiSebelumTahun2013 = // add by rzkypprtm
			"SELECT twafat.NIP,mstpegawai.nama,twafat.TGLWAFAT FROM twafat,mstpegawai WHERE twafat.TGLWAFAT < '2013/00/10' AND twafat.TGLSTOP < '2013/00/10' limit 0,10;";
	public final String queryPNSYangMatinyaPalingLama = // add by rzkypprtm
			"SELECT twafat.NIP,mstpegawai.nama,twafat.TGLWAFAT FROM twafat,mstpegawai ORDER BY twafat.TGLWAFAT asc limit 1;";
}