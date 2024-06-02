package StructuralPatterns.Composite.Example2;

public class Product implements Priceable, Rewardable {
	
	public String name;
	public int price;
	public int bonus;
	public boolean isRewardable;
	
	public Product(String name, int price, int bonus) {
		this.name = name;
		this.price = price;
		this.bonus = bonus;
		this.isRewardable = isRewardable();
	}
	
	@Override
	public int price() {
		return price - bonus();
	};
	
	@Override
	public int bonus() {
		if(isRewardable) {
			return 0;
		}
		return bonus;
	};
	
	@Override
	public boolean isRewardable() {
		if(name.length() > 5 && bonus > 2) {
			return true;
		}
		return false;
	};
	
    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price() + ", Bonus: " + bonus();
    };

}
