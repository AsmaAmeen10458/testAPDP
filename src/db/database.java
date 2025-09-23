package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class database {
  private static final String JDBC_URL = "jdbc:mysql://localhost:3306/task" ;
  private static final String USERNAME = "root";
  private static final String PASSWORD = "";
  
  public static Connection getConnection(){
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          return DriverManager.getConnection(JDBC_URL, USERNAME,PASSWORD);
      }catch (ClassNotFoundException | SQLException e){
          JOptionPane.showMessageDialog(null, e);//"Please Contact Developers!");
          return null;
      }
  }
}
 