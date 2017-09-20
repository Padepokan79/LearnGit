package com.padepokan79.model;

import java.sql.DriverManager;

import org.json.JSONArray;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class FgajiUangDuka extends DatabaseConnection implements ListQuery {
	
	int menuOn = 0;
	public FgajiUangDuka() {
		
	}

	public JSONArray simpleQuery(String query){
		try
		{

			PreparedStatement st = (PreparedStatement) conn.prepareStatement(query);
			if( menuOn == 1) {
				st.setInt(1, InputVariable.inputHari);
				st.setInt(2, InputVariable.nextPage);
			}
			else if( menuOn == 2) {
				st.setString(1, InputVariable.inputDate);
				st.setInt(2, InputVariable.inputGaji);
				st.setInt(3, InputVariable.nextPage);
			}
			else if ( menuOn == 3) {
				st.setInt(1, InputVariable.inputTunjanganIstri);
				st.setInt(2, InputVariable.inputTunjanganAnak);	
			}
			else if ( menuOn == 4) {
				st.setString(1, InputVariable.inputDate);
				st.setInt(2, InputVariable.inputTunjanganIstri);
				st.setInt(3, InputVariable.inputTunjanganAnak);	
			}
			else if ( menuOn == 5 ) {
				st.setInt(1, InputVariable.nextPage);
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
	
	public JSONArray getNamaPNSyangMeninggaldanUangDukaDibayarSetelah1MingguSesudahWafat(){
		try
		{
			menuOn = 1;
			String query = queryNamaPNSyangMeninggaldanUangDukaDibayarSetelah1MingguSesudahWafat;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null; 
	}
	
	public JSONArray getTGLWafatDanUangBersihLebihDari1Jt(){
		try
		{
			menuOn = 2;
			String query = queryTGLWafatDanUangBersihLebihDari1Jt;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public JSONArray queryNamaPNSYangMeningglTanpaTunjanganAnakIstri(){
		try
		{
			menuOn = 3;
			String query = queryNamaPNSYangMeningglTanpaTunjanganAnakIstri;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public JSONArray queryPnsWafatLebihdar4thnYangmempunyaiIstriTidakMempunyaiAnak(){
		try
		{
			menuOn = 4;
			String query = queryPnsWafatLebihdar4thnYangmempunyaiIstriTidakMempunyaiAnak;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public JSONArray queryJumlahPNSYangTidakMempunyaiTunjanganEselonDanTunjanganFungsi(){
		try
		{
			menuOn = 5;
			String query = queryJumlahPNSYangTidakMempunyaiTunjanganEselonDanTunjanganFungsi;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
