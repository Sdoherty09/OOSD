package data;
import java.sql.*;
public class Driver {

	public static void main(String[] args) {
		final String DATABASE_URL = "jdbc:mysql://localhost/books";
			Connection connection = null;
			PreparedStatement pstat=null;
			String firstname = "Maria";
			String lastname="Smith";
			int i=0;
			try{
				// establish connection to database
				connection = DriverManager.getConnection(DATABASE_URL, "root", "Login123" );
				pstat = connection.prepareStatement("INSERT INTO Authors (FirstName, LastName) VALUES (?,?)");
				pstat . setString (1, firstname );
				pstat . setString (2, lastname);
				i=pstat .executeUpdate();
			}
			catch(SQLException sqlException ) {
				sqlException . printStackTrace () ;
				}
				finally {
				try{
				pstat.close();
				connection. close () ;
				}
				catch ( Exception exception ){
				exception . printStackTrace () ;
				}
				}
			System.out.println(i+" record added to database");
				} // end main
			
	}


