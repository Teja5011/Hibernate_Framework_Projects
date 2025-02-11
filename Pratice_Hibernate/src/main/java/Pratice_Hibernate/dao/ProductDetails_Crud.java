package Pratice_Hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Pratice_Hibernate.dto.Product_Details;


public class ProductDetails_Crud<product>
{
	EntityManager em=Persistence.createEntityManagerFactory("teja").createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void saveProduct(Product_Details product)
	{
		et.begin();
		em.persist(product);
		et.commit();
	}
	
	public void fetchProuduct(Product_Details productId)
	{
		Product_Details db=em.find(Product_Details.class, productId);
		if(db==null)
		{
			System.out.println(db);
		}
		else
		{
			System.out.println("data not found");
		}	
	}
	
	public void fetchProuduct1(Product_Details productname)
	{
		Product_Details db=em.find(Product_Details.class, productname);
		if(db==null)
		{
			System.out.println(db);
		}
		else
		{
			System.out.println("data not found");
		}	
	}
	
	public void deleteProduct(Product_Details productBrand)
	{
		Product_Details db=em.find(Product_Details.class, productBrand);
		if(db==null)
		{
			et.begin();
			em.remove(db);
			et.commit();
			System.out.println("data removed");
		}
		else
		{
			System.out.println("data not found");
		}
	}
	public void updateProduct(Product_Details ProductPrice)
	{
		Product_Details db=em.find(null, ProductPrice);

		Product_Details db1=em.find(Product_Details.class,ProductPrice.getId());
		if(db1!=null)
		{
			System.out.println(ProductPrice+"before manuplation");
			if(ProductPrice.getBrand()==null)
				ProductPrice.setBrand(db1.getBrand());
			if(ProductPrice.getPrice()==0)
				ProductPrice.setPrice(db1.getPrice());
			System.out.println(ProductPrice+"after manuplation");
			  et.begin();
			  Product_Details updateData=em.merge(ProductPrice);
			  et.commit();
		   
			 System.out.println(updateData+"after updating in db");
		}
		else
		{
			System.out.println("data not found");
		}
	}
}
