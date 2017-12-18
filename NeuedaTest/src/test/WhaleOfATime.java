package test;

public class WhaleOfATime {
	
	public static void main(String[] args) {
		Whale[] whaleArray = new Whale[4];
		whaleArray[0] = new Whale ("Right", "Atlantic", 2001, 21, 16);
		whaleArray[1] = new Whale ("Blue", "Pacific", 2001, 23, 16);
		whaleArray[2] = new Whale ("Sperm", "Atlantic", 1900, 20, 40);
		whaleArray[3] = new Whale ("Humpback", "Antarctic", 919, 13, 13);
		
		for (int j=0; j<whaleArray.length; j++) {
			System.out.println(whaleArray[j]);
		}
		
	
	
	for (int i=0; i<=whaleArray.length; i++) {
		if (whaleArray[i].getMainOcean().equals("Atlantic")){
			System.out.println("Atlantic Whales: " + whaleArray[i].getName());
		}
	}
	

	if (whaleArray[0].getMaxSpeed()>(whaleArray[1].getMaxSpeed())){
		System.out.println(whaleArray[0]);
	}
		else if (whaleArray[1].getMaxSpeed()>(whaleArray[2].getMaxSpeed())){
			System.out.println(whaleArray[1]);
		}
			else if (whaleArray[2].getMaxSpeed()>(whaleArray[3].getMaxSpeed())){
				System.out.println(whaleArray[2]);
			}
				else if (whaleArray[3].getMaxSpeed()>(whaleArray[0].getMaxSpeed())){
					System.out.println(whaleArray[3]);
		
		}
		
//	}
//	System.out.println("Max Speed of Whales: " + ((whaleArray[0].getMaxSpeed() + whaleArray[1].getMaxSpeed()
//			+ whaleArray[2].getMaxSpeed() + whaleArray[3].getMaxSpeed())/4));
	

	}



}
