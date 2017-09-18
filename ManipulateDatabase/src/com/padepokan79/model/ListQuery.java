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
			"SELECT distinct nip,nama,kdstawin,janak FROM fgaji where kdstawin=3 and janak=0 limit 0,10;"; //add by siska
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

	//===========================================================================================================================================
	//tabel 4 hutang

	public final String queryNamaPegawaiYangMempunyaiHutangLebihDari10JtJumlahCicilanlebihdari1Tahun = // add by rzkypprtm
			"SELECT hutang.NIP, mstpegawai.nama as Nama, hutang.JMLHUTANG as Jumlah_Hutang, hutang.JMLBULAN FROM hutang, mstpegawai WHERE hutang.JMLHUTANG > 10000000 AND hutang.JMLBULAN > 12 limit 0,10;";
	public final String queryTampilkanJumlahPNSyangBerhutangBerdasarkanCicilan = // add by rzkypprtm
			"SELECT JMLCICILAN, COUNT(*) FROM hutang GROUP BY JMLCICILAN;";
	public final String queryHutangUntukAnak =
			"select nip,kdhutang,jmlhutang,jmlcicilan,cicilanakhir,jmlbulan,tmthutang,tathutang,keterangan from hutang order by jmlhutang desc limit 10;"; //add by siska
	public final String queryHutangPalingBanyak = // add by selfi
			"SELECT hutang.NIP, mstpegawai.nama, hutang.JMLHUTANG AS JUMLAH_HUTANG from hutang,mstpegawai WHERE hutang.NIP=mstpegawai.NIP order by JUMLAH_HUTANG DESC LIMIT 10;";
	public final String queryHutangPalingbanyak = // add by selfi
			"select NIP, JMLHUTANG,JMLBULAN from hutang ORDER BY JMLBULAN AND JMLHUTANG ASC limit 10;"; 

	
//===========================================================================================================================================
//tabel 5 keluarga
	
	public final String queryPNSJombloWafat =
			"select nip,nmkel as Nama,tglnikah,tglwafat from keluarga where tglnikah IS NULL and tglwafat IS NOT NULL limit 10;"; //add by siska
	public final String queryPNSUsiaPernikahanPerak25tahun = // add by selfi
			"select NIP, NMKEL as NAMAKELUARGA,TGLNIKAH from keluarga where TGLNIKAH > '1992-01-01' AND TGLNIKAH < '1992-12-30';";
	public final String queryPNSjomblosejati = // add by nopan
			"select NMKEL,TGLLHR,TGLNIKAH from keluarga where TGLLHR <= '1987/09/15' AND TGLNIKAH IS NULL;";
	public final String queryKeluargaPNSyangSudahMenikahDanMempunyaiKartuSuamiIstri = // add by rzkypprtm
			"SELECT NIP, NMKEL as Nama, TGLNIKAH, NIPSUAMIISTRI FROM keluarga WHERE TGLNIKAH IS NOT NULL AND NIPSUAMIISTRI IS NOT NULL AND NOT NIPSUAMIISTRI = '';";
	public final String queryNamaKeluargaPNSyangPernahMenikahLaluCerai = // add by rzkypprtm
			"SELECT NIP, NMKEL as Nama, TGLNIKAH, TGLCERAI FROM keluarga WHERE TGLNIKAH IS NOT NULL AND TGLCERAI IS NOT NULL;";

	
//===========================================================================================================================================
//tabel 6 skpp_pegawai

	public final String queryNamaPnsYangmempunyaiAnakTapiTidakMempunyaiIstri = // add by novan
			"select NIP,NAMA,TJISTRI,TJANAK from skpp_pegawai where TJISTRI = 0 AND TJANAK > 0;";
	public final String queryNamaPnsYangPensiunTahunIni = // add by selfi
			"select NIP,NAMA,TMTPENSIUN from skpp_pegawai WHERE TMTPENSIUN >= '2017-01-01'  AND TMTPENSIUN <= '2017-12-31' LIMIT 50;";
	public final String queryNamaPNSYangSkepnyaDiterbitkanOlehPresiden = //add by siska
			"select distinct nip,nama,tgllhr as Tanggal_Lahir, tmtstop as Tanggal_Berhenti,kdpangkat as Pangkat,masker as Masa_Kerja,penerbitskep as Penerbit from skpp_pegawai where masker > '20' and tmtstop < '2012-06-31' and penerbitskep like '%Presiden%' limit 10;";
	public final String queryTampilkanJumlahSKPP_PNSberdasarkanKodePangkat = // add by rzkypprtm
			"SELECT KDPANGKAT as Kode_Pangkat, COUNT(*) as Jumlah_PNS FROM skpp_pegawai GROUP BY KDPANGKAT ORDER BY KDPANGKAT, COUNT(*);";
	public final String queryTampilkanJumlahSuratSKPPberdasarkanPenerbitnya = // add by rzkypprtm
			"SELECT PENERBITSKEP as PENERBIT , COUNT(*) as Jumlah_Surat FROM skpp_pegawai GROUP BY PENERBITSKEP ORDER BY PENERBITSKEP, COUNT(*) desc;";

//==========================================================================================================================================================================
//Tabel 7 fgaji_uangduka
	

	public final String queryNamaPNSyangMeninggaldanUangDukaDibayarSetelah1MingguSesudahWafat = // add by rzkypprtm ? = 7(1minggu)
			"SELECT  b.NIP, a.NAMA, b.TGLWAFAT, b.TGLBAYAR FROM mstpegawai a, fgaji_uangduka WHERE a.NIP = b.NIP AND (TGLBAYAR-TGLWAFAT) <= ? LIMIT ?, 10;";
	public final String queryTGLWafatTahun2016DanUangBersihLebihDari1Jt = // add by selfi, ? 2016-01-01 (sesuai tahun dan bulan)  , ?= sesuai Nominal gaji
			"select NIP,TGLWAFAT,BERSIH from fgaji_uangduka where TGLWAFAT > ? AND BERSIH > ? limit 0,10;";
	public final String queryNamaPNSYangMeningglTanpaTunjanganAnakIstri = // add by siska
			"select distinct fgaji_uangduka.NIP,mstpegawai.NAMA as Nama,tglwafat,tjistri,tjanak  from fgaji_uangduka,mstpegawai where fgaji_uangduka.NIP = mstpegawai.NIP and tjistri=? and tjanak=? limit 0,10;";
	public final String queryPnsWafatLebihdar4thnYangmempunyaiIstriTidakMempunyaiAnak = // add by novan
			"select NIP,TGLWAFAT,TJISTRI,TJANAK from fgaji_uangduka where TGLWAFAT <= ? AND (TJISTRI > ? AND TJANAK = ?) ;";
	public final String queryJumlahPNSYangTidakMempunyaiTunjanganEselonDanTunjanganFungsi = // add by rzkypprtm ?1 = 0 , ?2= 0
			"SELECT COUNT(TJESELON) as JUMLAH_PNS_NonTJSESLON_NonTJFUNGSI FROM fgaji_uangduka WHERE TJESELON = '?' AND TJFUNGSI = '?' LIMIT ?, 10;";


//==========================================================================================================================================================================
//Tabel 8 data_rapel

	public final String queryGroupByGapokPNS = // add by siska
			"select gapok, count(*) as Jumlah_PNS from data_rapel where gapok > ? group by gapok limit 100;"; // di database ? = 300.000

}

