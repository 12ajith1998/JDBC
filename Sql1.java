import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sql1
{
	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/students";
		String uname="root";
		String pswd="ajith";
		int rollno=15;
		String name="Kiran";
		String place="arakkonam";
		String phn="857605987";
		String dept="B.E";
		String query="insert into students_table values (?,?,?,?,?) ";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pswd);
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1, rollno);
		st.setString(2, name);
		st.setString(3, place);
		st.setString(4, phn);
		st.setString(5, dept);
		
		int count=st.executeUpdate();
		
		System.out.println(count);
		st.close();
		con.close();
		
	}

}
