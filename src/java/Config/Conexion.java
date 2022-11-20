
package Config;

import java.sql.Connection;
import java.sql.DriverManager;



public class Conexion {
    Connection conn;  
    String url = "jdbc:mysql://localhost:3306/bd_foodtruck";
    String user = "root";
    String pass = "";
           
        public Connection conexion(){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn=DriverManager.getConnection(url,user,pass);
                
            }catch(Exception e){
            }
            return conn;
        }    
    
}
