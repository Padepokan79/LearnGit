package com.padepokan79.test;

import org.json.JSONArray;
import org.json.JSONObject;

import com.padepokan79.model.Fgaji;

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testNamaDanGajiBersih(); // add by ikan
		testNamaDanStatusKawin();
		testNamaDanLakiJomblo();
	}
	
	
	
	
	public static void testNamaDanLakiJomblo(){
		Fgaji fgaji = new Fgaji();
		JSONArray data = fgaji.getNamaDanLakiJomblo();
		//System.out.println(data);
		showData(data,"nama","bersih");
	} // ikan added test for NamaDanGajiBersih
	public static void testNamaDanGajiBersih(){
		Fgaji fgaji = new Fgaji();
		JSONArray data = fgaji.getNamaDanGajiBersih();
		//System.out.println(data);
		showData(data,"nama","bersih");
	} // ikan added test for NamaDanGajiBersih
	public static void testNamaDanStatusKawin(){
		Fgaji fgaji = new Fgaji();
		JSONArray data = fgaji.getNamaDanStatusKawin();
		//System.out.println(data);
		showData(data,"nama","kdstawin");
	} // ikan added test for testNamaDanStatusKawin
	
	public static void showData(JSONArray arrayData,String fieldsa, String fieldsb) {
		System.out.println(arrayData);
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject obj =  arrayData.getJSONObject(i);
			System.out.println(obj);
			String status = "";
			if ((int)obj.get(fieldsb) == 1){
				status = "Kawin";
			}else{
				status = "Tidak kawin";
			}
			System.out.println(obj.get(fieldsa)+ " "+ ": "+status );
		}
	}

}
