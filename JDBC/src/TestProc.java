import java.sql.*;


//调用存储过程
public class TestProc {
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc","","");
		CallableStatement cstmt=conn.prepareCall("{call p(?,?,?,?)}");
		cstmt.registerOutParameter(3,Types.INTEGER);//设定第三个为输出参数
		cstmt.registerOutParameter(4, Types.INTEGER);
		cstmt.setInt(1, 3);
		cstmt.setInt(2, 4);
		cstmt.setInt(4, 5);
		cstmt.execute();
		System.out.println(cstmt.getInt(3));
		System.out.println(cstmt.getInt(4));
		cstmt.close();
		conn.close();
	}

}
