package com.padepokan79.model;

import java.sql.DriverManager;

import org.json.JSONArray;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class Ttunjangan  extends DatabaseConnection implements ListQuery{

	
	int menuOn = 0;

	public Ttunjangan() {
		
	}

	public JSONArray simpleQuery(String query){
		try
		{
			PreparedStatement st = (PreparedStatement) conn.prepareStatement(query);
			if( menuOn == 1) {
				st.setInt(1, InputVariable.nextPage);
			}
			else if( menuOn == 2) {
				st.setInt(1, InputVariable.inputJumlahAwal);
				st.setInt(2, InputVariable.inputJumlahAkhir);
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
	public JSONArray getqueryMenampilkanJumlahPNSYangPensiunBerdasarkanKodeJabatandanUsiaJabatan(){
		try
		{
			menuOn = 1;
			String query = queryMenampilkanJumlahPNSYangPensiunBerdasarkanKodeJabatandanUsiaJabatan;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryMenampilkanJumlahPNSYangPensiunBerdasarkanJumlahUangPensiun(){
		try
		{
			menuOn = 2;
			String query = queryMenampilkanJumlahPNSYangPensiunBerdasarkanJumlahUangPensiun;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryMenampilkanPNSyangPensiunKurangdariUsia60(){
		try
		{
			String query = queryMenampilkanPNSyangPensiunKurangdariUsia60;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}