
package music_database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



public class DBConnect {


    public static void main(String[] args) {
        try {
        String host = "jdbc:derby://localhost:1527/Songs";
        String uName = "pass";
        String uPass = "pass";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        
       Statement stmt = con.createStatement();
       String sql = "SELECT * FROM Music";
       ResultSet rs = stmt.executeQuery(sql);
       
        while (rs.next()){
        
        String album = rs.getString("Album");
        String genre = rs.getString("Genre");
        String artist = rs.getString("Artist");
        String released_date = rs.getString("Released_Date");
        String number_tracks = rs.getString("Number_Tracks");
        
        System.out.println (album + " \n" + genre + " \n" + artist + " \n" + released_date + " \n" + 
                number_tracks + " \n");
        }
         }
       
           catch (SQLException err){
                System.out.println(err.getMessage());
                }
    } 
        
}
