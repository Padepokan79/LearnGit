package com.padepokan79.model;

import java.sql.DriverManager;

import org.json.JSONArray;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class HistorisEselon implements ListQuery{

	String myDriver = "org.gjt.mm.mysql.Driver";
	String myUrl = "jdbc:mysql://192.168.2.192:3000/dbgajido";
	Connection conn = null;
	int menuOn = 0;

	public HistorisEselon() {
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
			if( menuOn == 1) {
				st.setInt(1, InputVariable.nextPage);
			}
			else if( menuOn == 2) {
				st.setInt(3, InputVariable.nextPage);
			}
			else if( menuOn == 3) {
				st.setInt(3, InputVariable.nextPage);
			}
			else if( menuOn == 4) {
				st.setInt(1, InputVariable.inputTunjanganEselonAwal);
				st.setInt(2, InputVariable.inputTunjanganEselonAkhir);
				st.setInt(3, InputVariable.nextPage);
			}
			else if( menuOn == 5) {
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
	public JSONArray getqueryMenampilkanRatarataTunjanganEselon(){
		try
		{
			menuOn = 1;
			String query = queryMenampilkanRatarataTunjanganEselon;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryMenampilkanDaftarPNSYangMempunyaiKodeEselonBersuratKeputusan(){
		try
		{
			menuOn = 2;
			String query = queryMenampilkanDaftarPNSYangMempunyaiKodeEselonBersuratKeputusan;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryTJEselonYangNolBukanNull(){
		try
		{
			menuOn = 3;
			String query = queryTJEselonYangNolBukanNull;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryMenampilkanJumlahPNSyangMempunyaiTunjanganEselonberdasrakanInputanBatasKecildanBatasBesar(){
		try
		{
			menuOn = 4;
			String query = queryMenampilkanJumlahPNSyangMempunyaiTunjanganEselonberdasrakanInputanBatasKecildanBatasBesar;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public JSONArray getqueryMenampilkanHistorisSkep(){
		try
		{
			menuOn = 5;
			String query = queryMenampilkanHistorisSkep;
			return simpleQuery(query);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}