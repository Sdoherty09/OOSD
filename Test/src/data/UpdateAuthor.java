package data;
//Update an Author in the Authors table.
import java.sql.*;

public class UpdateAuthor {

	public static void main(String[] args) {
		// database URL
		final String DATABASE_URL = "jdbc:mysql://localhost/books";
		
			String firstname="Maria";
			String lastname="Brennan";
			Connection connection = null;
			PreparedStatement pstat=null;
			int i=0;
			
			try{
				// establish connection to database
				connection = DriverManager.getConnection(
				DATABASE_URL, "root", "Login123" );
				// create Statement for updating table
				pstat=connection.prepareStatement("Update Authors SET LastName=? Where Firstname=?");	
				pstat.setString(1, lastname);
				pstat.setString(2, firstname);
				i=pstat.executeUpdate();
			 }
			catch(SQLException sqlException ) {
				sqlException.printStackTrace();
			 }
			finally{
				try{
					pstat.close();
					connection.close();
				}
				catch ( Exception exception ){
					exception.printStackTrace();
				}
			}
			System.out.println(i+ " updated in database");
		} // end main
	} // end class