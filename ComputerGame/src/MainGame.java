
public class MainGame {
		
		private int xPosition;
		private int yPosition;
		private String direction;
		private int speed;
		
		public MainGame(int xPosition, int yPosition, String direction, int speed) {
			super();
			this.xPosition = xPosition;
			this.yPosition = yPosition;
			this.direction = direction;
			this.speed = speed;
		}
		
		public MainGame() {
		
		}

		public int getxPosition() {
			return xPosition;
		}

		public void setxPosition(int xPosition) {
			this.xPosition = xPosition;
		}

		public int getyPosition() {
			return yPosition;
		}

		public void setyPosition(int yPosition) {
			this.yPosition = yPosition;
		}

		public String getDirection() {
			return direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
		
		
		
		


	}


