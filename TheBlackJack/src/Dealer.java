import javax.swing.*;
import java.util.ArrayList;

public class Dealer{
	
	private ArrayList<Card> dCardsArrayList = new ArrayList<Card>();
	
	public void adcCard(Card dCard){
		
		dCardsArrayList.add(dCard);
	}
	
	public int getDPoints(){
		
		int total = 0;
		
		for (int i = 0; i < dCardsArrayList.size(); i++){
			
			Card c = dCardsArrayList.get(i);
			total = total + c.getValue();
		}
		
		for (int i = 0; i < dCardsArrayList.size(); i++){
			
			Card c = dCardsArrayList.get(i);
			switch (c.getCard()){
			
			case "AC":
				if(total > 21){
					total = total - 10;
				}
				break;
				
			case "AD":
				if(total > 21){
					total = total - 10;
				}
				break;
				
			case "AH":
				if(total > 21){
					total = total - 10;
				}
				break;
				
			case "AS":
				if(total > 21){
					total = total - 10;
				}
				break;
				
				default:
					break;
			}
			
		}
		return total;
	}
	
	
	public ArrayList<ImageIcon> getDCards(){
		
		ArrayList<ImageIcon> cardImg = new ArrayList<ImageIcon>();
		
		for (int i = 0; i < dCardsArrayList.size(); i++){
			
			Card c = dCardsArrayList.get(i);
			cardImg.add(c.cardIcon());
		}
		
		return cardImg;
	}
	
	public void removeDCards(){
		
		dCardsArrayList.clear();
	}
	
	
	public ImageIcon getHiddenCard(){
		
		String hc = "C:\\Users\\Stryker\\workspace\\TheBlackJack\\resources\\Cardsimg\\HC.png";
		return new ImageIcon(hc);
	}
}