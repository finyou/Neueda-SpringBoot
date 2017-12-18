
public class GameMethod {
	
	public static void main(String[] args) {
		MainGame a1 = new MainGame (20, 20, "NorthWest", 100);
		MainGame a2 = new MainGame (70, 10, "South", 200);
		MainGame a3 = new MainGame (45, 95, "East", 150);
		
		Spaceships s1 = new Spaceships (20, 20, "NorthWest", 100);
		
		s1.shoot();
		s1.shoot();
		s1.shoot();
		s1.crash();
		s1.shoot();
		s1.crash();
		s1.crash();
		System.out.println(s1);

		
	}
	


}
