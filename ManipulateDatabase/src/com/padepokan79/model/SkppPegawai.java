package com.padepokan79.model;

import java.sql.DriverManager;

import org.json.JSONArray;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class SkppPegawai implements ListQuery{
	
	String myDriver = "org.gjt.mm.mysql.Driver";
	String myUrl = "jdbc:mysql://192.168.2.192:3000/dbgajido";
	Connection conn = null;
		
	public SkppPegawai() {
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
	
	public JSONArray getNamaPnsYangmempunyaiAnakTapiTidakMempunyaiIstri(){
		try
		{
			String query = queryNamaPnsYangmempunyaiAnakTapiTidakMempunyaiIstri;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public JSONArray getNamaPnsYangPensiunTahunIni(){
		try
		{
			String query = queryNamaPnsYangPensiunTahunIni;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public JSONArray getNamaPNSYangSkepnyaDiterbitkanOlehPresiden(){
		try
		{
			String query = queryNamaPNSYangSkepnyaDiterbitkanOlehPresiden;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public JSONArray getTampilkanJumlahSKPP_PNSberdasarkanKodePangkat(){
		try
		{
			String query = queryTampilkanJumlahSKPP_PNSberdasarkanKodePangkat;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public JSONArray getTampilkanJumlahSuratSKPPberdasarkanPenerbitnya(){
		try
		{
			String query = queryTampilkanJumlahSuratSKPPberdasarkanPenerbitnya;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}