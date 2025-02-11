package hibernate_3.controller;

import hibernate_3.dao.ShoeCrud;
import hibernate_3.dto.Shoe;

public class ShoeMain 
{
	public static void main(String[] args) 
	{
		ShoeCrud crud=new ShoeCrud();
		Shoe shoe1=new Shoe(1, "NIKE", "WHITE", 7, 999);
	//	crud.saveShoe(shoe1);
	//  crud.fetchShoe(1);
	//  crud.deleteShoe(5);
    //	crud.updateShoe(shoe1);
    //	crud.fetchAllShoes();
		
		crud.fetchShoeByBrand(null);
	}
}
