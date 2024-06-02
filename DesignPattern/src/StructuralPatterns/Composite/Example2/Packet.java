package StructuralPatterns.Composite.Example2;

import java.util.ArrayList;

public class Packet implements Priceable, Rewardable {
	
	public String name;
	public ArrayList<Priceable> products1;
	public ArrayList<Rewardable> products2;
	public int bonus;
	public boolean isRewardable;
	
	public Packet(String name, int bonus) {
		this.name = name;
		this.bonus = bonus;
		this.products1 = new ArrayList<>();
		this.products2 = new ArrayList<>();
		this.isRewardable = isRewardable();
	}
	
	public void addProduct(Priceable object) {
		products1.add(object);
		if(object instanceof Rewardable) {
			products2.add((Rewardable)object);
		}
	}	

	@Override
	public int price() {	
		int totalPrice = 0;		
        for (Priceable product : products1) {
        	totalPrice += product.price();
        }
        
        return totalPrice - bonus() - bonus;
	};
	
	@Override
	public int bonus() {		
		if(isRewardable) {
			return 0;
		}
		
		int totalBonus = 0;		
        for (Rewardable product : products2) {
        	totalBonus += product.bonus();
        }      
        return totalBonus;
	};
	
	@Override
	public boolean isRewardable() {
		if(price() > 50) {
			return true;
		}
		return false;
	};
	
    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price() + ", Bonus: " + bonus();
    };

}
