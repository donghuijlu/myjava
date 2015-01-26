import java.sql.*;
public class TestJDBC {
	public static void main(String[] args){
		ResultSet rs=null;
		Statement stmt=null;
		Connection conn=null;
		
		try{
			Class.forName("...jdbc.driver.OracleDriver");
			//new ...jdbc.driver.OracleDriver();
			conn=DriverManager.getConnection("url");
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select * from dept");
			while(rs.next()){
				System.out.println(rs.getString("deptno"));
				System.out.println(rs.getInt("deptno"));
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(rs !=null){
					rs.close();
					rs=null;
				}
				if(stmt !=null){
					stmt.close();
					stmt=null;
				}
				if(conn !=null){
					conn.close();
					conn=null;
				}
				
			}catch(SQLException e){
				e.printStackTrace();
			}

		}
	}
 
}
