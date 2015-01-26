import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class TestDML2 {

	public static void main(String[] args) {
		int deptno=0;
		if(args.length !=3){
			System.out.println("Paramter Error!");
			System.exit(-1);
		}
		try{
		deptno=Integer.parseInt(args[0]);
		}catch(NumberFormatException e){
			System.out.println("Paramater Error!");
			System.exit(-1);
		}
		
		String dname=args[1];
		String loc=args[2];
		
		Statement stmt=null;
		Connection conn=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//new oracle.jdbc.driver.OrcaleDriver();
			conn=DriverManager.getConnection("jdbc:orcale:thin:@192.168.0.1:1521:SXT","scott","tiger");
			stmt=conn.createStatement();
			String sql="insert into dept2 values("+deptno+",'"+dname+"','"+loc+"')";
			stmt.executeUpdate(sql);
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				try{
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
