package com.cdac.acts;
public class ItemClass
{
	private int itemCode;
	private double price;
	private int quantity;	
	
	public ItemClass(int itemCode, double price, int quantity)
	{
		this.itemCode = itemCode;
		this.price = price;		
		this.quantity = quantity;
	}
	
	public int getItemCode()
	{
		return itemCode;
	}
	public double getPrice()
	{
		return price;
	}
	public int quantity()
	{
		return quantity;
	}
	
	public String toString()
	{
		return "ItemCode: "+itemCode+"Price: "+price+"Quantity: "+quantity;
	}
	public void reduceQuality(int quantity1)
	{
		this.quantity = this.quantity-quantity1;
	}
	
	public double bill(int quantity)
	{
		return quantity * this.price;
	}
}	