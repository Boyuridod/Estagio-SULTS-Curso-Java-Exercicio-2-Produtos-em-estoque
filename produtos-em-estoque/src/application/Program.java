package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = scan.nextLine();
		System.out.print("Price: $");
		product.price = scan.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = scan.nextInt();
		
		System.out.println("\nProduct data: " + product.toString());
		
		System.out.print("\nEnter the numer of products to be added in stock: ");
		product.addProducts(scan.nextInt());
		
		System.out.println("\nUpdated data: " + product.toString());
		
		System.out.print("\nEnter the numer of products to be removed from stock: ");
		product.removeProducts(scan.nextInt());
		
		System.out.println("\nUpdated data: " + product.toString());
	
		scan.close();
	}

}
