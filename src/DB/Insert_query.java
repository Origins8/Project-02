package DB;

import java.sql.*;

public class Insert_query {
  
 
    public static String insert(String Id, String Name, int Age, String Address ) {

        java.sql.Connection conn = Connection();
        
        String insert = ("INSERT INTO student(ID, NAME, AGE, ADDRESS) VALUES ('" +id+ "','" +name+ "','" +age+ "','" +address+ "')");
        
            
        try {
                java.sql.Statement stmt = conn.createStatement();
                    stmt.executeUpdate(insert);;
        }
        catch (SQLException e) {
             
                }

        return (insert);

        }
}