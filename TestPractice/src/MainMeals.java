import java.util.ArrayList;

public class MainMeals {

	public static void main(String[] args) {
		
		ArrayList<Breakfast> Breakfast = new ArrayList<Breakfast>();
		
		Breakfast finolaBreakfast = new Breakfast();
		finolaBreakfast.setName("Finola");
		finolaBreakfast.setCereal("Corn Flakes");
		finolaBreakfast.setCookedFood("Bacon and Eggs");
		finolaBreakfast.setDrink("Coffee");
		
		Breakfast.add(finolaBreakfast);
		
		Breakfast davidBreakfast = new Breakfast();
		davidBreakfast.setName("David");
		davidBreakfast.setCereal("Coco Pops");
		davidBreakfast.setCookedFood("Omelette");
		davidBreakfast.setDrink("Green Tea");
		
		Breakfast.add(davidBreakfast);
		
		System.out.println(Breakfast);
		
		
	}
	

	

	

}