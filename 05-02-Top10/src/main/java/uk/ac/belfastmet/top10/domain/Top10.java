package uk.ac.belfastmet.top10.domain;

public class Top10 {

	
	private String name;
	private String image;
	private int placing;

	
	public Top10(String name, String image, int placing) {
		super();
		this.name = name;
		this.image = image;
		this.placing = placing;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public int getPlacing() {
		return placing;
	}


	public void setPlacing(int placing) {
		this.placing = placing;
	}
	
}
