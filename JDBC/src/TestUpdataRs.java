import java.sql.*;
public class TestUpdataRs {
	public static void main(String[] args){
		try{
			Class.forName("");
			Connection conn=DriverManager.getConnection("url","","");
			Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=stmt.executeQuery("select * from emp2");
			rs.next();
			
			rs.updateString("ename","AAAA");
			rs.updateRow();
			
			rs.moveToInsertRow();
			rs.updateInt(1, 9999);
			rs.updateString("ename", "AAAA");
			rs.updateInt("mgr", 7839);
			rs.updateDouble("sal", 99.99);
			rs.insertRow();
			
			rs.moveToCurrentRow();
			
			rs.absolute(5);
			rs.deleteRow();
			
			//rs.cancelRowUpdate();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
