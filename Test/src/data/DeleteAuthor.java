package data;
import java.sql.*;

public class DeleteAuthor {

	public static void main(String[] args) {
		// database URL
		final String DATABASE_URL = "jdbc:mysql://localhost/books";
		
			String firstname="Lisa";
			Connection connection = null;
			PreparedStatement pstat=null;
			int i=0;
			int authorID=2;
			try{
				
				// establish connection to database
				connection = DriverManager.getConnection(
				DATABASE_URL, "root", "Login123" );
				// create Statement for deleting from table
				pstat=connection.prepareStatement("Delete from Authors Where AuthorID=?");							
				pstat.setInt(1, authorID);
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
			System.out.println(i+ " removed from database");
		} // end main
} // end class

create table Customers (customer_id int NOT_NULL AUTO_INCREMENT, name (varchar(15)), address (varchar(20)), device_id int);