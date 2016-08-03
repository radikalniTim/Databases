package test;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		MySQLDIM moneyManager = new MySQLDIM ("jdbc:mysql://localhost:3306/moneymanager", "moneymanager",  "root", "So1C-17>4");
		
		//INSERTING DATA
		//moneyManager.insertData("users", "userName", "pETperko", "firstName", "Petar", "lastName", "Petroviæ", "mail", "petar.petroviæ@firma.com", "password", "petPer88");

		//FETCHING DATA
		/*ArrayList <String> result = new ArrayList <String>();
		result = moneyManager.getData("users", "userName", "pETperko", "firstName", "lastName", "mail");
		
		for (String temp:result){
		System.out.println(temp);
		}
		*/
		
		//UPDATING DATA
		//moneyManager.updateData("users", "userName", "pETperko", "password", "PetrovPassword123", "mail", "petar.petro@petrovMail.com", "sex", "Yes please");
		
		//DELETING DATA
		//moneyManager.deleteRow("users", "password", "PetrovPassword123");
	}

}
