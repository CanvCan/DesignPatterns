package StructuralPatterns.Composite.Example2;

import java.util.ArrayList;

public class Cart implements Priceable, Rewardable {
	
	public String name;
	public ArrayList<Priceable> packet1;
	public ArrayList<Rewardable> packet2;
	public int bonus;
	public boolean isRewardable;
	
	public Cart(String name, int bonus) {
		this.name = name;
		this.bonus = bonus;
		this.packet1 = new ArrayList<>();
		this.packet2 = new ArrayList<>();
		this.isRewardable = isRewardable();
	}
	
	public void addProduct(Priceable object) {
		packet1.add(object);
		if(object instanceof Rewardable) {
			packet2.add((Rewardable)object);
		}
	}	

	@Override
	public int price() {	
		int totalPrice = 0;		
        for (Priceable product : packet1) {
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
        for (Rewardable product : packet2) {
        	totalBonus += product.bonus();
        }       
        return totalBonus;
	};
	
	
	@Override
	public boolean isRewardable() {
		if(price() > 100) {
			return true;
		}
		return false;
	};
	
    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price() + ", Bonus: " + bonus();
    };

}
