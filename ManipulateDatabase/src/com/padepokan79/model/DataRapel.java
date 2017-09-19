package com.padepokan79.model;

import java.sql.DriverManager;

import org.json.JSONArray;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class DataRapel implements ListQuery{

	String myDriver = "org.gjt.mm.mysql.Driver";
	String myUrl = "jdbc:mysql://192.168.2.192:3000/dbgajido";
	Connection conn = null;
	int menuOn = 0;

	public DataRapel() {
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
				st.setInt(1, InputVariable.inputGapok);
			}
			else if( menuOn == 3) {
				st.setString(1, InputVariable.inputBulanAwal);
				st.setString(2, InputVariable.inputBulanAkhir);
				st.setInt(3, InputVariable.nextPage);
			}
			else if( menuOn == 4) {
				st.setString(1, InputVariable.inputHurufAwal);
				st.setString(2, InputVariable.inputKodePangkat);
				st.setInt(3, InputVariable.nextPage);
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
	public JSONArray getqueryGroupByGapokPNS(){
		try
		{
			menuOn = 1;
			String query = queryGroupByGapokPNS;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryGroupKodeSatuanKerjaNamaSatuanKerjaDanJumlahPNSNya(){
		try
		{
			String query = queryGroupKodeSatuanKerjaNamaSatuanKerjaDanJumlahPNSNya;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryMenampilkanDataYangDibayarkanSatuBulanSetelahDataAwal(){
		try
		{
			menuOn = 3;
			String query = queryMenampilkanDataYangDibayarkanSatuBulanSetelahDataAwal;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryMenampilkanDataNamaYangHurufAwalADanPangkat3D(){
		try
		{
			menuOn = 4;
			String query = queryMenampilkanDataNamaYangHurufAwalADanPangkat3D;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryMenampilkanPNSyangJenisKElaminNULLdanBukanPriadaWanit(){
		try
		{
			String query = queryMenampilkanPNSyangJenisKElaminNULLdanBukanPriadaWanita;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}