package com.padepokan79.model;

import java.sql.DriverManager;

import org.json.JSONArray;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class Satker extends DatabaseConnection implements ListQuery{

	

	public Satker() {
		
	}

	public JSONArray simpleQuery(String query){
		try
		{

			PreparedStatement st = (PreparedStatement) conn.prepareStatement(query);
			// execute the query, and get a java resultset
			ResultSet rs = (ResultSet) st.executeQuery();

			//System.out.println("------ ------ ------ ----- -----");
			return Convertor.convertToJSON(rs);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryNamaAtasanDRSDanJabatanCamat(){
		try
		{
			String query = queryNamaAtasanDRSDanJabatanCamat;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryKepalaDinasHaji(){
		try
		{
			String query = queryKepalaDinasHaji;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryBendaharaPembantuDaftarGaji(){
		try
		{
			String query = queryBendaharaPembantuDaftarGaji;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryNamaOperatorDenganAkhiranH(){
		try
		{
			String query = queryNamaOperatorDenganAkhiranH;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryJumlahPegawaiYangKerjaDiDinasKesehatan(){
		try
		{
			String query = queryJumlahPegawaiYangKerjaDiDinasKesehatan;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}