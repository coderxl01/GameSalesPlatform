package Entities;

public class Game {
	private int id;
	private String gameName;
	private double price;
	private int stokCount;
	public Game() { 
	}

	public Game(int id, String gameName, double price, int stokCount) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.price = price;
		this.stokCount=stokCount;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public int getStokCount() {
		return stokCount;
	}

	public void setStokCount(int stokCount) {
		this.stokCount = stokCount;
	}
	
}
