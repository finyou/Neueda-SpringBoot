
public class Breakfast extends Meal {
	
	private String cereal;
	private String cookedFood;
	private String drink;
	
	public Breakfast(String name, String cereal, String cookedFood, String drink) {
		super(name);
		this.cereal = cereal;
		this.cookedFood = cookedFood;
		this.drink = drink;
	}
	
	public void breakfastDisplay(){
		   System.out.println(getName() + " " + cereal + " "+ cookedFood + " "+ drink);
	}
	
	public Breakfast() {
		super();
		this.cereal = "Coco Pops";
		this.cookedFood= "Bacon and Eggs";
		this.drink="Latte";
		
	}
	
	public String getCereal() {
		return cereal;
	}
	public void setCereal(String cereal) {
		this.cereal = cereal;
	}
	public String getCookedFood() {
		return cookedFood;
	}
	public void setCookedFood(String cookedFood) {
		this.cookedFood = cookedFood;
	}
	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}

	@Override
	public String toString() {
		return "Breakfast \nName:" + getName() + " \nCereal:" + cereal + " \nCooked Food:" + cookedFood + " \nDrink:" + drink + "\n\n";
	}


	}
	
