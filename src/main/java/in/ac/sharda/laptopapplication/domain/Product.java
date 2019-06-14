package in.ac.sharda.laptopapplication.domain;

public class Product {

	private int id,price;
	private String name, desc;
	public Product(){
		
	}
	public Product(int id, int price,String name, String desc){
		
		this.id = id;
		this.price = price;
		this.name = name;
		this.desc = desc;
	}
	

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Product){
			return ((Product)obj).getId() == id;
		}
		return false;
	}
	
}
