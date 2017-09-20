package com.padepokan79.model;

import org.json.JSONArray;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class Twafat extends DatabaseConnection implements ListQuery{
	public Twafat() {
		
	}

	public JSONArray simpleQuery(String query){
		try
		{
			PreparedStatement st = (PreparedStatement) conn.prepareStatement(query);
			// execute the query, and get a java resultset
			ResultSet rs = (ResultSet) st.executeQuery();
			return Convertor.convertToJSON(rs);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public JSONArray getQueryNIPNamaTanggalWafat(){
		try
		{
			String query = queryNIPNamaTanggalWafat;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public JSONArray getQueryKdKubKelPenerimaKosong(){
		try
		{
			String query = queryKdKubKelPenerimaKosong;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public JSONArray getQueryPenerbitBukanDariLurah(){
		try
		{
			String query = queryPenerbitBukanDariLurah;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public JSONArray getQueryDaftarPegawaiYangMatiSebelumTahun2013(){
		try
		{
			String query = queryDaftarPegawaiYangMatiSebelumTahun2013;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getQueryPNSYangMatinyaPalingLama(){
		try
		{
			String query = queryPNSYangMatinyaPalingLama;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}