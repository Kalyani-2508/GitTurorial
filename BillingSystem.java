package com.cdac.acts;
import com.cdac.acts.ItemClass;
import java.util.Scanner;

public class BillingSystem
{
	ItemClass itemArr [] = {
		new ItemClass(101,0.99,80),
		new ItemClass(102,1.3,70),
		new ItemClass(103,1.1,100),
		new ItemClass(104,0.7,30)
	};
	
	public static void displayStock() {
        System.out.println("Available Stock: ");
        for (int i = 0; i < itemArr.length; i++) {
            System.out.println(itemArr[i]);
        }
    }
	public static void buyItem(int itemCode, int quantity)
	{
		for(int i=0; i<itemArr.length; i++)
		{
			ItemClass item = itemArr[i];
			if(itemArr[i].getItemCode().equals(itemCode))
			{
				if(itemArr[i].getquantity() >= quantity)
				{
					itemArr[i].reduceQuality(quantity);
					
				}
			}
		}
	}
	
	public static void main(String []args)
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
		
		do{
			System.out.println("Enter your choice: ");
		    choice = sc.nextInt();
			System.out.println("****************MENU******************\n1. Display Stock\n2.Buy item by item code\n3.Display Bill\n0.EXIT");
			switch(choice)
			{
				case 1: displayStock();
				break;
				case 2: System.out.println("Enter item code: ");
						int itemCode = sc.nextInt();
						System.out.println("Enter quantity: ");
						int quantity = sc.nextInt();
						buyItem(itemCode,quantity);
				break;
				case 3: displayBill();
				break;				
				case 0: System.out.println("THANK YOU!!");
				break;
				default: System.out.println("Enter valid choice!!");	
			}
		}while(choice!=0);
}