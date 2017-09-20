package com.padepokan79.model;

import org.json.JSONArray;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class Agama extends DatabaseConnection implements ListQuery{
	public Agama() {

	}

	public JSONArray queryMencariNamaAgama(String query, int inputKode, int nextPage){
		try
		{

			PreparedStatement st = (PreparedStatement) conn.prepareStatement(query);
			st.setInt(1, inputKode);
			st.setInt(2, nextPage);
			ResultSet rs = (ResultSet) st.executeQuery();
			return Convertor.convertToJSON(rs);

		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getQueryMencariNamaAgama(int inputKode, int nextPage){
		try
		{
			String query = queryMencariNamaAgama;
			return queryMencariNamaAgama(query, inputKode, nextPage);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}