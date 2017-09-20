package com.padepokan79.model;

import java.sql.DriverManager;

import org.json.JSONArray;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class DetilKekurangan extends DatabaseConnection implements ListQuery {
	
	
	int menuOn = 0;
	public DetilKekurangan() {
		
	}

	public JSONArray simpleQuery(String query){
		try
		{

			PreparedStatement st = (PreparedStatement) conn.prepareStatement(query);
			if( menuOn == 1) {
				st.setInt(1, InputVariable.inputMasaKerja);
				st.setInt(2, InputVariable.inputGapok);
			}
			else if ( menuOn == 4) {
				st.setString(1, InputVariable.inputTanggalBayar);
				st.setString(2, InputVariable.inputTanggalBayar);
				st.setInt(3, InputVariable.nextPage);
			}
			else if ( menuOn == 5 ) {
				st.setString(1, InputVariable.inputKodePangkat);
				st.setInt(2, InputVariable.nextPage);
			}
			
			// execute the query, and get a java resultset
			ResultSet rs = (ResultSet) st.executeQuery();

			//System.out.println("------ ------ ------ ----- -----");
			return Convertor.convertToJSON(rs);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		}
	
	public JSONArray queryMenampikanMaskerDibawah5TahunDanGajiDiatas25jt(){
		try
		{
			menuOn = 1;
			String query = queryMenampikanMaskerDibawah5TahunDanGajiDiatas25jt;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public JSONArray queryMenampilkanJenisKekuranganYangLebihDariSatu(){
		try
		{
			String query = queryMenampilkanJenisKekuranganYangLebihDariSatu;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public JSONArray queryJumlahPNSBerdasarkanGolonganJumlahAnakJumlahIstri(){
		try
		{
			String query = queryJumlahPNSBerdasarkanGolonganJumlahAnakJumlahIstri;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public JSONArray queryMenampilkanDaftarTanggalBayarberdasarkanInput(){
		try
		{
			menuOn = 4;
			String query = queryMenampilkanDaftarTanggalBayarberdasarkanInput;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public JSONArray queryMencariKodePangkatdanMengurutkanUPDSTAMP(){
		try
		{
			menuOn = 5;
			String query = queryMencariKodePangkatdanMengurutkanUPDSTAMP;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
