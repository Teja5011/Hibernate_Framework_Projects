package hiberanate_1;

import javax.persistence.Entity;
import javax.persistence.Id;

//class -->Entity-->table
//DataMembers(non-static)-->coloums
//(Identifier)@Id-->primary key

@Entity
public class Bottle 
{
	@Id
	String colour;
	double price;
	int capacity;
	static String brand;
	
	
	
}
