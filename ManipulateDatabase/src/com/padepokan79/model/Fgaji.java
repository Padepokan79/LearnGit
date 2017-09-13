package com.padepokan79.model;

import java.sql.DriverManager;

import org.json.JSONArray;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class Fgaji implements ListQuery{

	String myDriver = "org.gjt.mm.mysql.Driver";
	String myUrl = "jdbc:mysql://192.168.2.192:3000/dbgajido";
	Connection conn = null;

	public Fgaji() {
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
			// execute the query, and get a java resultset
			ResultSet rs = (ResultSet) st.executeQuery();

			//System.out.println("------ ------ ------ ----- -----");
			return Convertor.convertToJSON(rs);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getNamaDanGajiBersih(){
		try
		{
			String query = "SELECT nama,bersih FROM fgaji limit 0 , 10;";
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	public JSONArray getNamaDanStatusKawin(){
		try
		{
			String query = queryNamaDanStatusKawin;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getNamaDanLakiJomblo(){
		try
		{
			//String query = queryNamaDanLakiJomblo;
			return simpleQuery(queryNamaDanLakiJomblo);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getNamaDanJomblo(int gender){
		try
		{
			String query = "SELECT getNamaDanJomblo FROM fgaji where kdjenkel=?  limit 0,10;";
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}


}
