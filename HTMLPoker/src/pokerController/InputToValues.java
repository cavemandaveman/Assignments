package pokerController;

public class InputToValues {
	
	private int players;
	private double ante;
	private double wallet;
	private double pot;
	
	public InputToValues() {}
	
	public InputToValues(String players, String ante, String wallet) {
		this.players = Integer.parseInt(players);
		this.ante = Double.parseDouble(ante);
		this.wallet = Double.parseDouble(wallet);
	}
	
	public int getPlayers() {
		return players;
	}
	
	public double getAnte() {
		return ante;
	}
	
	public double getWallet() {
		return wallet;
	}

	public void setWallet() {
		this.wallet = wallet - ante;
	}
	
	public double getPot() {
		return pot;
	}
	
	public void setPot() {
		this.pot = ante*players;
	}
}
