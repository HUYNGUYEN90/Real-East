
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author 14085
 */
public class The_connection {
    
    private static String  servername = "localhost";
    private static String dbname= "java_rst_dn";
    private static  String username = "root";
    private static Integer portnumber = 3306;
    private static String password = ""; // no password
    
    //create a function to get the connection
    
    public static  Connection getTheConnection()
    {
        Connection connection = null;
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setDatabaseName(dbname);
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPortNumber(portnumber);
        datasource.setPassword(password);
        
        try {
            connection = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(The_connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    
    
    
}
