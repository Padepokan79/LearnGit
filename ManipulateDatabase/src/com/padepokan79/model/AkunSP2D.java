package com.padepokan79.model;

import java.sql.DriverManager;

import org.json.JSONArray;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class AkunSP2D extends DatabaseConnection implements ListQuery{
	int menuOn = 0;

	public AkunSP2D() {
		
	}

	public JSONArray queryMencariKDSKPDdiAkunsp2d(String query, int inputKode, int nextPage){
		try
		{	
			InputVariable in = new InputVariable();
			PreparedStatement st = (PreparedStatement) conn.prepareStatement(query);
			
				st.setInt(1, inputKode);
				st.setInt(2, nextPage);
			
			// execute the query, and get a java resultset
			ResultSet rs = (ResultSet) st.executeQuery();

			//System.out.println("------ ------ ------ ----- -----");
			return Convertor.convertToJSON(rs);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryMencariBerdasakanKDSKPDdiAkunsp2d(int kodeSKPD, int nextPage){
		try
		{
			String query = queryMencariBerdasakanKDSKPDdiAkunsp2d;
			return queryMencariKDSKPDdiAkunsp2d(query, kodeSKPD, nextPage);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryMencariBerdasakanKDTRANSdiAkunsp2d(){
		try
		{
			menuOn = 2;
			String query = queryMencariBerdasakanKDTRANSdiAkunsp2d;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryListKDTransdiAkunsp2d(){
		try
		{
			menuOn = 3;
			String query = queryListKDTransdiAkunsp2d;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}