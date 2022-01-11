package Concrete;

import Abstract.IGameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() +	" adlý oyun eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() +	" adlý oyun güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() +	" adlý oyun silindi.");
		
	}

	@Override
	public void Sell(Game game, Player player, Campaign campaing) {
		if(game.getStokCount()>1 && player != null && campaing != null) {
			System.out.println(game.getGameName() +	" adlý oyun "+ player.getFirstName()+" adlý oyuncuya "+ campaing.getCampaignName()+ " kampanyasý ile satýldý");
            game.setStokCount(game.getStokCount()-1);
		}
		else {
			System.out.println("Satýþ gerçekleþmedi");
		}
		
	}

}
