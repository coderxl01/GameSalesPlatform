package Concrete;

import Abstract.IGameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() +	" adl� oyun eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() +	" adl� oyun g�ncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() +	" adl� oyun silindi.");
		
	}

	@Override
	public void Sell(Game game, Player player, Campaign campaing) {
		if(game.getStokCount()>1 && player != null && campaing != null) {
			System.out.println(game.getGameName() +	" adl� oyun "+ player.getFirstName()+" adl� oyuncuya "+ campaing.getCampaignName()+ " kampanyas� ile sat�ld�");
            game.setStokCount(game.getStokCount()-1);
		}
		else {
			System.out.println("Sat�� ger�ekle�medi");
		}
		
	}

}
