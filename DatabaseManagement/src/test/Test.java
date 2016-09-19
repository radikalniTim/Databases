package test;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		MySQLDIM moneyManager = new MySQLDIM ();


		//INSERTING DATA
		//moneyManager.insertData("users", "idusers", "2", "email", "petar.petrovic@firma.com", "firstName", "Tomislav", "lastName", "Kodrnja", "password", "kodrtOm");

		//FETCHING DATA
		ArrayList <String> result = new ArrayList <String>();
		result = moneyManager.getData("users", "idusers", "2", "firstName", "lastName", "email");
		
		for (String temp:result){
		System.out.println(temp);
		}
		
		
		//UPDATING DATA
		//moneyManager.updateData("users", "idusers", "2", "password", "PetrovPassword123", "email", "petar.petro@petrovMail.com");
		
		//DELETING DATA
		//moneyManager.deleteRow("users", "password", "PetrovPassword123");
	}

}
