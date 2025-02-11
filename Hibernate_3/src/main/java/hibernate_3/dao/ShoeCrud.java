package hibernate_3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_3.dto.Shoe;

public class ShoeCrud 
{
	EntityManager em=Persistence.createEntityManagerFactory("teja").createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void saveShoe(Shoe shoe)
	{
		et.begin();
		em.persist(shoe);
		et.commit();
	}
	
	public void fetchShoe(int ShoeId)
	{
		Shoe db=em.find(Shoe.class, ShoeId);
		if(db!=null)
		{     
			System.out.println(db);
		}
		else
		{
			System.out.println("data not found");
		}
	}
	
	public void deleteShoe(int ShoeId)
	{
		Shoe db=em.find(Shoe.class,ShoeId);
		if(db!=null)
		{
		  	et.begin();
		  	em.remove(db);
		  	et.commit();
		  	System.out.println("data deleted");
		}
		else
		{
			System.out.println("data not found");
		}
	}
	
	public void updateShoe(Shoe shoe)
	{
		Shoe db=em.find(Shoe.class, shoe.getBrand());
		
		Shoe db1=em.find(Shoe.class,shoe.getShoeId());
		if(db1!=null)
		{
			System.out.println(shoe+"before manuplation");
			if(shoe.getBrand()==null)
				shoe.setBrand(db1.getBrand());
			if(shoe.getColor()==null)
				shoe.setColor(db1.getColor());
			if(shoe.getPrice()==0)
				shoe.setPrice(db1.getPrice());
			if(shoe.getSize()==0)
				shoe.setSize(db1.getSize());
			System.out.println(shoe+"after manuplation");
			  et.begin();
			Shoe updateData=em.merge(shoe);
			  et.commit();
		   
			 System.out.println(updateData+"after updating in db");
		}
		else
		{
			System.out.println("data not found");
		}
	}
	
	public void fetchAllShoes()
	{
		Query data=em.createQuery("selct s from Shoe s where price>=50");
		System.out.println(data.getResultList());
	}
	
	public void fetchShoeByBrand(String brand)
	{
		Query query=em.createNamedQuery("select s from Shoe s where brand=?1");
		query.setParameter(1, brand);
		System.out.println(query.getResultList());
	}
}
