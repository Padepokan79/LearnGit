package com.padepokan79.model;

public class  InputVariable {
	public  int nextPage = 0;

	public  int inputHari;//untuk fgajiUangDuka ,menu on 1
	public  int inputGaji;// untuk fgajiUangDuka ,menu on 2
	public  String inputDate; //format nya 2016-01-01 untuk fgajiUangDuka, menu On 2 & 4
	public  int inputTunjanganIstri;//untuk fgajiUangduka ,menu on 3 & 4
	public  int inputTunjanganAnak;//untuk fgajiUangduka ,menu on 3 & 4


	//getGroupByGapokPNS
	public  int inputGapok;//umtuk class DataRapel ,menu on 1 dan class detil_kekurangan menu on 1

	//getMenampilkanDataYangDibayarkanSatuBulanSetelahDataAwal
	public  String inputBulanAwal;
	public  String inputBulanAkhir;

	//getMenampilkanDataNamaYangHurufAwalADanPangkat3D
	public  String inputHurufAwal;
	public  String inputKodePangkat;//untul class DataRapel ,menu on 4 dan untuk class detil_kekurangan ,menu on 5

	//getMenampilkanTempatLahirDiLimaPuluhDanJenisKelaminPerempuan MENU ON 2
	public  String inputTempatLahir;
	public  String inputJenisKelamin; // P atau L

	//getMenampilkanPNSpunyaNPWPdanMasaKerjaLama MENU ON 3
	public  String inputMasakerja; // untuk Memasukan input masa kerja

	//getqueryMenampilkanJumlahPNSyangMempunyaiTunjanganEselonberdasrakanInputanBatasKecildanBatasBesar
	public  int inputTunjanganEselonAwal;
	public  int inputTunjanganEselonAkhir;


	public  int inputMasaKerja;//untuk class detil_kekurangan menu on 1
	public  String inputTanggalBayar;//untuk class detil_kekurangan ,menu on 4
	
	//getqueryMencariTahunPajakdanJabatanGolongan
	public  int inputTahunPajak;
	public  int inputJabatanGolongan;
	
	public  int inputStatusPajak;    //contoh 1 sudah bayar, 0 belum bayar
	public  int inputGender;	//contoh 1 laki2 , 2 perempuan
	public  int inputJumalahKeluarga; //contoh 1 , 2 , 3
	
	//getkode
<<<<<<< HEAD
	public  int inputKode;   // ? 1. untuk kode agama, trans, skpd, gol
	public String getInputKodePangkat() {
		return inputKodePangkat;
	}

	public void setInputKodePangkat(String inputKodePangkat) {
		this.inputKodePangkat = inputKodePangkat;
	}

	public int getInputKode() {
		return inputKode;
	}

	public void setInputKode(int inputKode) {
		this.inputKode = inputKode;
	}

	public  String inputGolongan;
=======
	public static int inputKode;   // ? 1. untuk kode agama, trans, skpd, gol
>>>>>>> 756b504a5259ff218898cbbac35fa523e3e3277d
	
	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getInputHari() {
		return inputHari;
	}

	public void setInputHari(int inputHari) {
		this.inputHari = inputHari;
	}

	public int getInputGaji() {
		return inputGaji;
	}

	public void setInputGaji(int inputGaji) {
		this.inputGaji = inputGaji;
	}

	public String getInputDate() {
		return inputDate;
	}

	public void setInputDate(String inputDate) {
		this.inputDate = inputDate;
	}

	public int getInputTunjanganIstri() {
		return inputTunjanganIstri;
	}

	public void setInputTunjanganIstri(int inputTunjanganIstri) {
		this.inputTunjanganIstri = inputTunjanganIstri;
	}

	public int getInputTunjanganAnak() {
		return inputTunjanganAnak;
	}

	public void setInputTunjanganAnak(int inputTunjanganAnak) {
		this.inputTunjanganAnak = inputTunjanganAnak;
	}

	public int getInputGapok() {
		return inputGapok;
	}

	public void setInputGapok(int inputGapok) {
		this.inputGapok = inputGapok;
	}

	public String getInputBulanAwal() {
		return inputBulanAwal;
	}

	public void setInputBulanAwal(String inputBulanAwal) {
		this.inputBulanAwal = inputBulanAwal;
	}

	public String getInputBulanAkhir() {
		return inputBulanAkhir;
	}

	public void setInputBulanAkhir(String inputBulanAkhir) {
		this.inputBulanAkhir = inputBulanAkhir;
	}

	public String getInputHurufAwal() {
		return inputHurufAwal;
	}

	public void setInputHurufAwal(String inputHurufAwal) {
		this.inputHurufAwal = inputHurufAwal;
	}

	public String getInputTempatLahir() {
		return inputTempatLahir;
	}

	public void setInputTempatLahir(String inputTempatLahir) {
		this.inputTempatLahir = inputTempatLahir;
	}

	public String getInputJenisKelamin() {
		return inputJenisKelamin;
	}

	public void setInputJenisKelamin(String inputJenisKelamin) {
		this.inputJenisKelamin = inputJenisKelamin;
	}

	public String getInputMasakerja() {
		return inputMasakerja;
	}

	public void setInputMasakerja(String inputMasakerja) {
		this.inputMasakerja = inputMasakerja;
	}

	public int getInputTunjanganEselonAwal() {
		return inputTunjanganEselonAwal;
	}

	public void setInputTunjanganEselonAwal(int inputTunjanganEselonAwal) {
		this.inputTunjanganEselonAwal = inputTunjanganEselonAwal;
	}

	public int getInputTunjanganEselonAkhir() {
		return inputTunjanganEselonAkhir;
	}

	public void setInputTunjanganEselonAkhir(int inputTunjanganEselonAkhir) {
		this.inputTunjanganEselonAkhir = inputTunjanganEselonAkhir;
	}

	public int getInputMasaKerja() {
		return inputMasaKerja;
	}

	public void setInputMasaKerja(int inputMasaKerja) {
		this.inputMasaKerja = inputMasaKerja;
	}

	public String getInputTanggalBayar() {
		return inputTanggalBayar;
	}

	public void setInputTanggalBayar(String inputTanggalBayar) {
		this.inputTanggalBayar = inputTanggalBayar;
	}

	public int getInputTahunPajak() {
		return inputTahunPajak;
	}

	public void setInputTahunPajak(int inputTahunPajak) {
		this.inputTahunPajak = inputTahunPajak;
	}

	public int getInputJabatanGolongan() {
		return inputJabatanGolongan;
	}

	public void setInputJabatanGolongan(int inputJabatanGolongan) {
		this.inputJabatanGolongan = inputJabatanGolongan;
	}

	public int getInputStatusPajak() {
		return inputStatusPajak;
	}

	public void setInputStatusPajak(int inputStatusPajak) {
		this.inputStatusPajak = inputStatusPajak;
	}

	public int getInputGender() {
		return inputGender;
	}

	public void setInputGender(int inputGender) {
		this.inputGender = inputGender;
	}

	public int getInputJumalahKeluarga() {
		return inputJumalahKeluarga;
	}

	public void setInputJumalahKeluarga(int inputJumalahKeluarga) {
		this.inputJumalahKeluarga = inputJumalahKeluarga;
	}

	public String getInputGolongan() {
		return inputGolongan;
	}

	public void setInputGolongan(String inputGolongan) {
		this.inputGolongan = inputGolongan;
	}

	public int getInputJumlahAwal() {
		return inputJumlahAwal;
	}

	public void setInputJumlahAwal(int inputJumlahAwal) {
		this.inputJumlahAwal = inputJumlahAwal;
	}

	public int getInputJumlahAkhir() {
		return inputJumlahAkhir;
	}

	public void setInputJumlahAkhir(int inputJumlahAkhir) {
		this.inputJumlahAkhir = inputJumlahAkhir;
	}

	public String getInputNama() {
		return inputNama;
	}

	public void setInputNama(String inputNama) {
		this.inputNama = inputNama;
	}

	public int getInputNoUrut() {
		return inputNoUrut;
	}

	public void setInputNoUrut(int inputNoUrut) {
		this.inputNoUrut = inputNoUrut;
	}

	//Tabel 15 t_tunjangan
	public  int inputJumlahAwal;
	public  int inputJumlahAkhir;
	
	//getnama
	public  String inputNama;   // untuk input nama atasan, bendahara, operator, pns.
	
	//getqueryMencariPNSberdasarkanNoUrut
	public  int inputNoUrut;
	
}
