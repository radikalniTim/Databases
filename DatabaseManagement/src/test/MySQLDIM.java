//MySQLDIM -> My SQL DatabaseConnect Information Management

package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MySQLDIM{
	
	String databaseURL = null;
	String databaseUserName = null;
	String databasePassword = null;
	String databaseName = null;
	Connection connection;

/*---------------------------------------------------------------------------------------------------
* 										CONSTRUCTOR
*---------------------------------------------------------------------------------------------------
*/	
	public MySQLDIM (){

	}

/*---------------------------------------------------------------------------------------------------
* 						METHOD FOR FETCHING DATA FROM TO THE TABLE
*----------------------------------------------------------------------------------------------------
*/	
	public ArrayList<String> getData (String databaseTableName, String searchInColumnName, String searchValue, String...fetchDataFromColumnName){
		
		connection = ConnectionHelper.getDatabaseConnection();
		
		/* This method is returning all of the data that is equal to the specified value (searchValue) 
		 * from specified columns (searchInColumnName)*/
		 
		
		//columnNameArray is used for easyer data manipulation
		String[] columnNameArray = fetchDataFromColumnName;
		
		//array list used for storing data from search query
		ArrayList<String> fetchedData = new ArrayList<String>();
		
		//final String query = "SELECT * from users WHERE idusers = ?";		
		PreparedStatement ps;
		try {			
		
			ps = connection.prepareStatement("SELECT * from users WHERE idusers = 2");
			//ps.setString(1, "2");
			
			ResultSet resultSet = ps.executeQuery();
			if(resultSet.next()) {
				fetchedData.add(resultSet.getString("idusers"));
			}
			/* "while" loop shifts pointer on every selected row, and "for" loop adds data from each selected 
			 * cell in that row to array list "fetchedData"*/			 
		
		System.out.println("Java had succsessfully retreived data from database: " + databaseName + "." + databaseTableName);
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		finally {


		}
		
		return fetchedData; //when calling this method, you must return data in array list with generic type <String>
	}	

}


