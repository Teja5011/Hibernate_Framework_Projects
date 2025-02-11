package hiberanate_2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchUser 
{
	public static void main(String[] args) 
	{
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("teja");
		EntityManager em=emf.createEntityManager();
		User db=em.find(User.class,987456);
		if(db!=null)
		{
			System.out.println(db);
		}
		else
		{
			System.out.println("DATA NOT FOUND");
		}
	}
}
