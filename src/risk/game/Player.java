package risk.game;

import java.util.ArrayList;

public class Player {
	private PlayerColor c;
	protected ArrayList<Country> controledCountries;
	private RiscCard[] riscCard;
	
	public void setRiscCard(RiscCard card){
		for(int i = 0; i< riscCard.length; i++)
		{
			if(riscCard[i]== null){
				this.riscCard[i] = card;
				break;
			}
		}	
	}
	
	public Player(PlayerColor c ){
		this.c = c;
		this.riscCard = new RiscCard[5];
		for(int i = 0; i< riscCard.length;i++)
		{
			riscCard[i] = new RiscCard(4);
		}
		this.controledCountries = new ArrayList<Country>(42);
	}
	
	public boolean checkRiscCard()
	{
		if(this.riscCard[4] != null)
			return true;
		else
			return false;
	}

	public void deleteRiscCard(){
		int solieder=0;
		int cavalyman=0;
		int canon=0;
		int joker=0;
		for(int i = 0; i < riscCard.length; i++)
		{
			if(this.riscCard[i].getSymbol() == 1){
				solieder++;
			}
			else if(this.riscCard[i].getSymbol() == 2){
				cavalyman++;
			}
			else if(this.riscCard[i].getSymbol() == 3){
				canon++;
			}
			else if(this.riscCard[i].getSymbol() == 0){
				joker++;
			}
		}
		if(solieder > 3){delete(1,0);}
		else if(cavalyman > 3){delete(2,0);}
		else if(canon > 3){delete(3,0);}
		else if ((solieder+ joker) >3){int a = delete(1,0); delete(0,a);}
		else if ((cavalyman+ joker) >3){int a = delete(2,0);delete(0,a);}
		else if ((canon+ joker) >3){int a = delete(3,0);delete(0,a);}
	}

	private int delete(int delete, int a){
		int count=a;
		for(int i = 0; i < riscCard.length; ){
			if(count == 3){
				break;
			}
			if(this.riscCard[i] == null){break;}
			if(this.riscCard[i].getSymbol() == delete){
				int index = i;
				count++;
				while(i<(riscCard.length-1))
	        	{            	
					riscCard[i] = riscCard[i+1];
					riscCard[i+1] = null;
	            	i++;
	        	}
				i = index-1;
			}
			i++;
		}
		return count;
	}
	
	public PlayerColor getColor() {
		return this.c;
	}
	public void addCountry(Country c) {
		this.controledCountries.add(c);
	}
}


