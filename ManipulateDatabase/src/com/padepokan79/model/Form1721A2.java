package com.padepokan79.model;

import java.sql.DriverManager;

import org.json.JSONArray;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class Form1721A2 extends DatabaseConnection implements ListQuery{

	
	int menuOn = 0;

	public Form1721A2() {
		
	}

	public JSONArray simpleQuery(String query){
		try
		{

			PreparedStatement st = (PreparedStatement) conn.prepareStatement(query);
			if( menuOn == 1) {
				st.setInt(1, InputVariable.inputTahunPajak);
				st.setInt(2, InputVariable.inputJabatanGolongan);
				st.setInt(3, InputVariable.nextPage);
			}
			else if( menuOn == 3) {
				st.setInt(1, InputVariable.inputStatusPajak);
				st.setInt(2, InputVariable.inputGender);
				st.setInt(3, InputVariable.nextPage);
			}
			else if( menuOn == 4) {
				st.setInt(1, InputVariable.nextPage);
			}
			else if( menuOn == 5) {
				st.setInt(1, InputVariable.inputGender);
				st.setInt(2, InputVariable.inputJumalahKeluarga);
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
	public JSONArray getqueryMencariTahunPajakdanJabatanGolongan(){
		try
		{
			menuOn = 1;
			String query = queryMencariTahunPajakdanJabatanGolongan;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryMenunjukanJumlahJabatanPNSyangsudahbayardanBelum(){
		try
		{
			String query = queryMenunjukanJumlahJabatanPNSyangsudahbayardanBelum;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryMenampilkanStatusYangBelumBayarPajakDanLakiLaki(){
		try
		{
			menuOn = 3;
			String query = queryMenampilkanStatusYangBelumBayarPajakDanLakiLaki;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryMenampilkanYangSudahAdaNPWP(){
		try
		{
			menuOn = 4;
			String query = queryMenampilkanYangSudahAdaNPWP;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryMenampilkanStatusBerdasarkanGenderdanJumlahKeluarga(){
		try
		{
			menuOn = 5;
			String query = queryMenampilkanStatusBerdasarkanGenderdanJumlahKeluarga;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}