import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sql 
{
	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/students";
		String uname="root";
		String pswd="ajith";
		String query="select * from students_table";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pswd);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())
		{
		String s=rs.getInt(1) +"    "+rs.getString(2)+"    "+rs.getString(3)+"    "+rs.getString(4)+"    "+rs.getString(5);
		System.out.println(s);
		}
		st.close();
		con.close();
		
	}

}
