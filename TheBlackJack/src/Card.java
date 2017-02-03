
import javax.swing.*;


public class Card {
	private String figure;
	private String suit;
	private int value;
	
	
	//this is the constructor of the class Card
	public Card (String fig, String st, int val){
		
		this.figure = fig;
		this.suit = st;
		this.value = val;
		
	}
	
	public int getValue(){
		
		return value;
	}
	
	public String getCard(){
		
		return figure+suit;
	}
	
	
	public ImageIcon cardIcon(){
		
		String cardIcon = "C:\\Users\\Stryker\\workspace\\TheBlackJack\\resources\\Cardsimg" + figure + suit + ".png";
		return new ImageIcon(cardIcon);
	}

	
}
