import java.sql.DriverManager;

import org.json.JSONArray;
import org.json.JSONObject;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			// create our mysql database connection
			
			String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://192.168.2.192:3000/dbgajido";
			Class.forName(myDriver);
			Connection conn = (Connection) DriverManager.getConnection(myUrl, "taspen", "taspen");

			// our SQL SELECT query. 
			// if you only need a few columns, specify them by name instead of using "*"
			String query = "SELECT * FROM fgaji limit 10;";
			
			PreparedStatement st = (PreparedStatement) conn.prepareStatement(query);
			
			// execute the query, and get a java resultset
			ResultSet rs = (ResultSet) st.executeQuery();

			System.out.println("------ ------ ------ ----- -----");
			JSONArray arrayData = Convertor.convertToJSON(rs);
			System.out.println(arrayData.length());
			for (int i = 0; i < arrayData.length(); i++) {
				JSONObject obj =  arrayData.getJSONObject(i);
				System.out.println(obj);
				System.out.println(obj.get("tjberas"));
			}
			
//			obj =  arrayData.getJSONObject(1);
//			System.out.println(obj);
//			obj =  arrayData.getJSONObject(2);
//			System.out.println(obj);


//			System.out.println("********************************");
//			System.out.println(arrayData.toString());
//			System.out.println("++++++++++++++++++++++++++++++++");
//			
			//System.out.println(Convertor.convertToXML(rs));
			
//			// iterate through the java resultset
//			while (rs.next())
//			{
//				System.out.println(rs.getString(1));
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));
//				System.out.println(rs.getString(4));
//				System.out.println(rs.getString(5));
//				System.out.println("------ ------ ------ ----- -----");
//				JSONArray arrayData = Convertor.convertToJSON(rs);
//				System.out.println(arrayData.toString());
//				System.out.println("++++++++++++++++++++++++++++++++");
//				
//			}

			st.close();
		}
		catch (Exception e)
		{
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
	}

}
