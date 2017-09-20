package com.padepokan79.model;

import java.sql.DriverManager;

import org.json.JSONArray;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class Fspt extends DatabaseConnection implements ListQuery{

	int menuOn = 0;

	public Fspt() {
		
	}

	public JSONArray simpleQuery(String query){
		try
		{
			PreparedStatement st = (PreparedStatement) conn.prepareStatement(query);
			if( menuOn == 1) {
				st.setInt(1, InputVariable.inputNoUrut);
			}
			else if( menuOn == 2) {
				st.setString(1, InputVariable.inputNama);
				st.setInt(2, InputVariable.inputKode);
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
	public JSONArray getqueryMencariPNSberdasarkanNoUrut(){
		try
		{
			menuOn = 1;
			String query = queryMencariPNSberdasarkanNoUrut;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryMencariPNSberdasrkanNamaDanKDSKPDsecaraBersanaan(){
		try
		{
			menuOn = 2;
			String query = queryMencariPNSberdasrkanNamaDanKDSKPDsecaraBersanaan;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}