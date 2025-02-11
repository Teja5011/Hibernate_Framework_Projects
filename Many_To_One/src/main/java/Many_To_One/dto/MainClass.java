package Many_To_One.dto;

import javax.persistence.Persistence;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Persistence.createEntityManagerFactory("teja");
	}

}
