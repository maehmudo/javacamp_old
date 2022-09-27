package classWithAttributes;

public class Product {
	// we did here "Overloading"
	public Product(int id, String name, String description, double price, int stockAmount, String colour) {
		System.out.println("Constructor block worked");
		this.id = id;
		this.colour = colour;
		this.name = name;
		this.price = price;
		this.description = description;
		this.stockAmount = stockAmount;
		
	}
	
	public Product() {
		
	}
	private int id;
	String name;
	String description;
	double price;
	int stockAmount;
	String colour;
	String code;

	// getter
	public int getId() {

		return id;
	}

	// setter
	public void setId(int id) {

		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
