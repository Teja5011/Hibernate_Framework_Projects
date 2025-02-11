package hibernate_3.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shoe
{
	@Id
	private int ShoeId;
	private String brand,color;
	private int size;
	private double price;
	
	public Shoe(int shoeId, String brand, String color, int size, double price) 
	{
		super();
		ShoeId = shoeId;
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.price = price;
	}

	public Shoe()
	{
		// TODO Auto-generated constructor stub
	}
	

	public int getShoeId() {
		return ShoeId;
	}

	public void setShoeId(int shoeId) {
		ShoeId = shoeId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString()
	{
		return "Shoe [ShoeId=" + ShoeId + ", brand=" + brand + ", color=" + color + ", size=" + size + ", price="
				+ price + "]";
	}
	
	
	
}
