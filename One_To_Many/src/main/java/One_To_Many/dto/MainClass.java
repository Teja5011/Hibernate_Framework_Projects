package One_To_Many.dto;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import One_To_Many.dao.PersonDao;

public class MainClass 
{
 public static void main(String[] args)
 	{
	 	PersonDao dao=new PersonDao();
	 	List<Vehicle> list=new ArrayList<Vehicle>();
	 	list.add(new Vehicle())
	 	Person person=new Person(null, null, null, 0, list);
	 	System.out.println(person);
	 	
	 	dao.savePerson(person);
	 	
 	}
}
