

import java.sql.*;
import javax.swing.JOptionPane;



public class MysqlConnect {
    
    Connection conn = null;
    public static Connection ConnectDB(){
        
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection  conn = DriverManager.getConnection("jdbc:mysql://localhost/todo?verifyServerCertificate=false&useSSL=true", "root", "");
           return conn;
       }
      catch(Exception e){
      
      JOptionPane.showMessageDialog(null, e);
      return null;
      
      }
    }
    
}
