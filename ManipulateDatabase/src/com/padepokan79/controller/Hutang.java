package com.padepokan79.controller;

import java.sql.DriverManager;

import org.json.JSONArray;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.padepokan79.model.Convertor;
import com.padepokan79.model.ListQuery;
import com.padepokan79.util.DatabaseConnection;

public class Hutang extends DatabaseConnection implements ListQuery{


	public Hutang() {
		
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
	public JSONArray getQueryNamaPegawaiYangMempunyaiHutangLebihDari10JtJumlahCicilanlebihdari1Tahun(){
		try
		{
			String query = queryNamaPegawaiYangMempunyaiHutangLebihDari10JtJumlahCicilanlebihdari1Tahun;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getQueryTampilkanJumlahPNSyangBerhutangBerdasarkanCicilan(){
		try
		{
			String query = queryTampilkanJumlahPNSyangBerhutangBerdasarkanCicilan;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getQueryHutangUntukAnak(){
		try
		{
			String query = queryHutangUntukAnak;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getQueryHutangPalingBanyak(){
		try
		{
			String query = queryHutangPalingBanyak;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getQueryHutangPalingbanyak(){
		try
		{
			String query = queryHutangPalingbanyak;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
