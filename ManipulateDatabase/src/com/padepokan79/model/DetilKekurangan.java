package com.padepokan79.model;

import java.sql.DriverManager;

import org.json.JSONArray;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class DetilKekurangan implements ListQuery {
	
	String myDriver = "org.gjt.mm.mysql.Driver";
	String myUrl = "jdbc:mysql://192.168.2.192:3000/dbgajido";
	Connection conn = null;
	int menuOn = 0;
	public DetilKekurangan() {
		try
		{
			Class.forName(myDriver);
			// create our mysql database connection
			conn = (Connection) 
					DriverManager.getConnection(
							myUrl, "taspen", "taspen");

		}
		catch (Exception e)
		{
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
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
