package Pratice_Hibernate.dto;

public class Product_Details
{
	private int id;
	private String brand;
	private String productName;
	private String category;
	private double price;
	
	public Product_Details(int id, String brand, String productName, String category, double price) 
	{
		super();
		this.id = id;
		this.brand = brand;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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
		return "Product_Details [id=" + id + ", brand=" + brand + ", productName=" + productName + ", category="
				+ category + ", price=" + price + "]";
	}
	
	
	
	
}
