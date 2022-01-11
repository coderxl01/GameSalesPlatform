package Concrete;

 

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.text.html.parser.Entity;

import Abstract.IPlayerCheckService;
import Abstract.IPlayerService;
import Entities.Player;

public class PlayerManager implements IPlayerService {
	private List<Player> players = new ArrayList<Player>();
	private IPlayerCheckService _playerCheckService; 
	public PlayerManager(IPlayerCheckService playerCheckService) {
		_playerCheckService=playerCheckService;
	}
	@Override
	public void Add(Player player) {
		if(_playerCheckService.CheckIfRealPerson(player)) {
			System.out.println(player.getFirstName()+" "+player.getLastName() +" oyuncusu doðrulandý");
			System.out.println(player.getFirstName()+" "+player.getLastName() +" oyuncusu eklendi");
			players.add(player);
		}
		else {
			System.out.println("Kiþi doðrulanamadý!!");
		}
		
	}

	@Override
	public void Update(Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName() +" oyuncusu güncellendi");
		
	}

	@Override
	public void Delete(Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName() +" oyuncusu silindi");
		
	}
	@Override
	public Player GetPlayer(int id) { 
	//	List<Player> validTrxs = players.stream()
    //            .filter( (Player tr) -> tr.getId()==id ).collect( Collectors.toList() );
		 
		for (Player player : players) {
	        if (players.size()>0) { 
	            return player;
	        }
	    } 
		
	    return null; 
	}

}
