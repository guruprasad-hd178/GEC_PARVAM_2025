package concrete_pojo;

class POJO{
	private int id;
	private String name;
	private String address;
	
	public POJO(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public POJO() {
		super();
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "POJO [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}

public class Pojo {
	public static void main(String[] args) {
		/*
		 * pojo class
		 * ===========
		 * 1 this class should not extends or implements any class or interface
		 * 2 every fields (states/properties) should be private
		 * 3 all args constructor
		 * 4 no args constructor
		 * 5 toString()
		 * 6 getter and setter should be public methodsd
		 */
		POJO pojo = new POJO(1, "guru", "hassan");
		System.out.println(pojo);
		
	}
}
