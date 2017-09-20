package com.padepokan79.model;

import java.sql.DriverManager;

import org.json.JSONArray;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class Guru extends DatabaseConnection implements ListQuery{

	int menuOn = 0;

	public Guru() {
		
	}

	public JSONArray simpleQuery(String query, int inputKode){
		try
		{
			InputVariable in = new InputVariable();
			PreparedStatement st = (PreparedStatement) conn.prepareStatement(query);
			if( menuOn == 1) {
				st.setInt(1, inputKode);
				//st.setInt(2, InputVariable.nextPage);
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
	public JSONArray getqueryMencariKodeGurudiTabelGuruTBL(){
		try
		{
			menuOn = 1;
			String query = queryMencariKodeGurudiTabelGuruTBL;
			return simpleQuery(query, 2);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}