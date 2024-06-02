package StructuralPatterns.Composite.Example2;

public class Application2 {
	
	public static void main(String[] args) {
		
		Cart cart1 = new Cart("Kampanya Sepeti 1", 50);
		Cart cart2 = new Cart("Kampanya Sepeti 2", 45);
		
		Packet packet1 = new Packet("Meyve Paketi", 10);
		Packet packet2 = new Packet("Tropikal Paketi", 20);
		Packet packet3 = new Packet("Sebze Paketi", 13);
		Packet packet4 = new Packet("Salata Paketi", 5);
		
		Product product1 = new Product("Elma", 10, 2);
		Product product2 = new Product("Armut", 15, 3);
		Product product3 = new Product("Muz", 35, 4);
		
		Product product4 = new Product("Avakado", 50, 4);
		Product product5 = new Product("Ananas", 80, 5);
		Product product6 = new Product("Mango", 75, 5);
		
		Product product7 = new Product("Brokoli", 15, 1);
		Product product8 = new Product("Ispanak", 5, 0);
		Product product9 = new Product("Kabak", 12, 1);
		
		Product product10 = new Product("Domates", 8, 1);
		Product product11 = new Product("Salatalık", 7, 1);
		Product product12 = new Product("Biber", 10, 1);
		
		packet1.addProduct(product1);
		packet1.addProduct(product2);
		packet1.addProduct(product3);
		
		packet2.addProduct(product4);
		packet2.addProduct(product5);
		packet2.addProduct(product6);
		
		packet3.addProduct(product7);
		packet3.addProduct(product8);
		packet3.addProduct(product9);
		
		packet4.addProduct(product10);
		packet4.addProduct(product11);
		packet4.addProduct(product12);
		
		Product product13 = new Product("CPU", 1000, 200);
		Product product14 = new Product("GPU", 1500, 350);
		Product product15 = new Product("RAM", 500, 100);
		
		packet3.addProduct(product13);
			
		cart1.addProduct(packet1);
		cart1.addProduct(packet2);
		cart2.addProduct(packet3);
		cart2.addProduct(packet4);
		
		cart1.addProduct(product14);
		cart2.addProduct(product15);
		
		System.out.println(cart1);
		System.out.println(cart2);
		
	}
	
}
