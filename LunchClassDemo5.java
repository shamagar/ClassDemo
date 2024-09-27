//Demonstrated class on Product and Customer
package com.LunchClassDemo;


//Creating a class of Product
class Product
{
	private String itemNo;
	private String pName;
	private double price;
	private int qty;
	
	//Constractors 
	/*
	public Product(double p, int q)
	{
		price = p;
		qty = q;
	}
	*/
	public Product(String itemNo,String pName)
	{
		this.itemNo = itemNo;
		this.pName = pName;
	}
	
	public Product(String itemNo, String pName, double price, int qty)
	{
		this.itemNo = itemNo;
		this.pName = pName;
		this.price = price;
		this.qty = qty;
	}
	
	//Getter and setter methods
	public String getItemNo() 
	{
		return itemNo;
	}


	public String getpName() 
	{
		return pName;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double p) 
	{
		if(p >= 0)
			price = p;
		else
			price = 0;
	}

	public int getQty() 
	{
		return qty;
	}

	public void setQty(int q) 
	{
		if(q >= 0)
			qty = q;
		else
			qty = 0;
	}

	@Override
	public String toString() 
	{
		return "Product [itemNo=" + itemNo + ", pName=" + pName + ", price=" + price + ", qty=" + qty + "]";
	}
	
	

}

//Creating a class for Customer
class Customer
{
	private int custId;
	private String cName;
	private String address;
	private String phoneNo;
	
	public Customer(int custId, String cName)
	{
		this.custId = custId;
		this.cName = cName;
	}
	public Customer(int custId, String cName, String address, String phoneNo) 
	{
		super();
		this.custId = custId;
		this.cName = cName;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	
	
	public String getcName() 
	{
		return cName;
	}
	
	
	public String getAddress() 
	{
		return address;
	}
	
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public String getPhoneNo() 
	{
		return phoneNo;
	}
	
	public void setPhoneNo(String phoneNo) 
	{
		this.phoneNo = phoneNo;
	}
	
	public int getCustId() 
	{
		return custId;
	}
	
	
	
	@Override
	public String toString() 
	{
		return "Customer [custId=" + custId + ", cName=" + cName + ", address=" + address + ", phoneNo=" + phoneNo
				+ "]";
	}

	
}
	
	

public class LunchClassDemo5 
{

	public static void main(String[] args) 
	{
		Product p = new Product("a34-5","Noodles",6.99,5);
		Customer c = new Customer(2345,"Meena","485 Creek terrace","8172980013");
		
		//Calling toString Methods
		System.out.println(p);
		System.out.println(c);
	}

}
