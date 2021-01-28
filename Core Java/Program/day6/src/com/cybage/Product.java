package com.cybage;

public class Product extends Object implements Comparable
{
	public Product(int id, String name, double price, int stock) {
//		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	private int id;
	private String name;
	private double price;
	private int stock;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}
	
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (stock != other.stock)
            return false;
        return true;
    }
    
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.getId( )- ((Product) o).getId();
	}
	

	
	
}
