package One_To_Many.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import One_To_Many.dto.Person;

public class PersonDao 
{
	EntityManager em=(EntityManager) Persistence.createEntityManagerFactory("/teja");
	EntityTransaction et=em.getTransaction();
	
	public void saveOperation(Person person)
	{
		et.begin();
		em.persist(em);
		et.commit();
	}

}
