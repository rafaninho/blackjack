
/*public class Player {

	private String name;
	private int score;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}*/

import javax.swing.*;
import java.util.ArrayList;

public class Player{
	
	private ArrayList<Card> pCardsArrayList = new ArrayList<Card>();
	
	public void adcCard(Card pCard){
		
		pCardsArrayList.add(pCard);
	}
	
	public int getPPoints(){
		
		int total = 0;
		
		for (int i = 0; i < pCardsArrayList.size(); i++){
			
			Card c = pCardsArrayList.get(i);
			total = total + c.getValue();
		}
		
		for (int i = 0; i < pCardsArrayList.size(); i++){
			
			Card c = pCardsArrayList.get(i);
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
	
	
	public ArrayList<ImageIcon> getPCards(){
		
		ArrayList<ImageIcon> cardImg = new ArrayList<ImageIcon>();
		
		for (int i = 0; i < pCardsArrayList.size(); i++){
			
			Card c = pCardsArrayList.get(i);
			cardImg.add(c.cardIcon());
		}
		
		return cardImg;
	}
	
	public void removePCards(){
		
		pCardsArrayList.clear();
	}
	
}
