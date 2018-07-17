package DB;

import java.sql.*;

public class Insert_query extends DB.DBConnection{
 
    public static String insert(String Id, String Name, int Age, String Address ) {
        
        String insert = ("INSERT INTO student(ID, NAME, AGE, ADDRESS) VALUES ('" +id+ "','" +name+ "','" +age+ "','" +address+ "')");
                  
        try {
                java.sql.Statement stmt = conn.createStatement();
                stmt.executeUpdate(insert);;
        }catch (SQLException e) {
             
        }

        return (insert);

        }
}