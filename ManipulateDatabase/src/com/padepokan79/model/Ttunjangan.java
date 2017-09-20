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

	public JSONArray getMenampilkanJumlahPNSYangPensiunBerdasarkanKodeJabatandanUsiaJabatan(String query, int nextPage){
		try
		{
			PreparedStatement st = (PreparedStatement) conn.prepareStatement(query);
				st.setInt(1, InputVariable.nextPage);
			// execute the query, and get a java resultset
			ResultSet rs = (ResultSet) st.executeQuery();

			//System.out.println("------ ------ ------ ----- -----");
			return Convertor.convertToJSON(rs);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray simpleQuery(String query, int jumlahAwal, int jumlahAkhir, int nextPage){
		try
		{
			PreparedStatement st = (PreparedStatement) conn.prepareStatement(query);
				st.setInt(1, jumlahAwal);
				st.setInt(2, jumlahAkhir);
				st.setInt(3, nextPage);
			// execute the query, and get a java resultset
			ResultSet rs = (ResultSet) st.executeQuery();
			return Convertor.convertToJSON(rs);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
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
	public JSONArray getMenampilkanJumlahPNSYangPensiunBerdasarkanKodeJabatandanUsiaJabatan(){
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