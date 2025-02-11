package hibernate_laptop.dto;

public class Laptop 
{
	private int id;
	private String brand;
	private String os;
	private String processor;
	private int ram;
	private double price;
	private String colour;
	private int displaySize;
	
	public Laptop(int id, String brand, String os, String processor, int ram, double price, String colour,
			int displaySize) 
	{
		super();
		this.id = id;
		this.brand = brand;
		this.os = os;
		this.processor = processor;
		this.ram = ram;
		this.price = price;
		this.colour = colour;
		this.displaySize = displaySize;
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

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(int displaySize) {
		this.displaySize = displaySize;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + ", os=" + os + ", processor=" + processor + ", ram=" + ram
				+ ", price=" + price + ", colour=" + colour + ", displaySize=" + displaySize + "]";
	}
	
	
	
	
	
	
}
