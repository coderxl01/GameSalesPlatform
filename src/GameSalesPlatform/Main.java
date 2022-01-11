package GameSalesPlatform;

import java.time.LocalDate;
import java.util.Date;

import Abstract.ICampaignService;
import Abstract.IGameService;
import Abstract.IPlayerCheckService;
import Abstract.IPlayerService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) { 
		Player player = new Player(1, "Kadir", "ÞENSOY", new Date(1993,05,16), "60199334386");
        Game game = new Game(1, "PES 2020 PS4", 80,12);
        Campaign campaign = new Campaign(1,"Crazy Campaign",12);
        
       
       IPlayerService playerService = new PlayerManager(new MernisServiceAdapter());
       playerService.Add(player);
       
       ICampaignService campaignService= new CampaignManager();
       campaignService.Add(campaign); 
       
       IGameService gameManager= new GameManager();
       gameManager.add(game);
       gameManager.Sell(game, playerService.GetPlayer(1), campaign);

		
		 
		
	}

}
