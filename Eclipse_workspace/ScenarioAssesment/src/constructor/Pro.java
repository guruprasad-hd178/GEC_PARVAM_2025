package constructor;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name) {
        this(name, 0.0);
    }

    public Product(String name, double price) {
        this(name, price, 0);
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public static void main(String[] args) {
		Product p1 = new Product("truck");
		Product p2 = new Product("car", 200);
		Product p3 = new Product("bike", 100, 3);	
	}
}


