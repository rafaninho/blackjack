import java.util.ArrayList;
import java.util.Collections;



public class Deck {
	
	private ArrayList<Card> objArrayList = new ArrayList<Card>();
	
	int value;
	
	//constructor
	public Deck (){
		
		
		for (int i = 1; i <= 13; i++){
			
			String figure;
			value = 0;
			
			switch(i){
			
			case 1:
				figure = "A";
				value = 11;
				break;
				
			case 11:
				figure = "J";
				value = 10;
				break;
				
			case 12:
				figure = "Q";
				value = 10;
				break;
				
			case 13:
				figure = "K";
				value = 10;
				break;
				
				default:
					figure = i+"";
					value = value +i;
					break;
			}
			
			for (int j = 0; j < 4; j++){
				
				String suit = "";
				switch (j){
				
				case 0:
					suit = "H";
					break;
					
				case 1:
					suit = "D";
					break;
					
				case 2:
					suit = "S";
					break;
					
				case 3:
					suit = "C";
					break;
				}
				
				Card c = new Card(figure, suit, value);
				objArrayList.add(c);
				
				
			}
			
		}
	}
	
	public void shuffleBaralho(){
		
		Collections.shuffle(objArrayList);
	}
	
	
	public Card takeCard(){
		
		return objArrayList.remove(0);
		
	}
	

}
