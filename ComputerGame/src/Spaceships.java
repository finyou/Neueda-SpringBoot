
public class Spaceships extends MainGame{
	
	private int ammo;
	private int lives;
	
	public Spaceships(int xPosition, int yPosition, String direction, int speed) {
		super(xPosition, yPosition, direction, speed);
		this.ammo = 100;
		this.lives = 3;
	}
	
	public void spaceshipDisplay(){
		   System.out.println(getxPosition() + " " + getyPosition() + " "+ getDirection() + " "+ getSpeed());
	}
	

	public int getAmmo() {
		return ammo;
	}

	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}
	
	public void shoot() {
		this.ammo = this.ammo-4;
		if (this.ammo!=0) {
		System.out.println("Ammo = " + this.ammo );
	}
		else{
		System.out.println("Out of Ammo!");
			
		}

	}
	
	public void crash() {
		this.lives = this.lives-1;
		if(this.lives>0) {
			System.out.println("You Crashed!");
		}
			if(this.lives ==0) {
			System.out.println("Game Over!");
			this.ammo=100;
			this.lives=3;
		}
	}

	@Override
	public String toString() {
		return "Spaceships [ammo=" + ammo + ", lives=" + lives + "]";
	}
	
	

}
