package Abstract;

import java.util.List;

import Entities.Player;

public interface IPlayerService { 
	Player  GetPlayer(int id);
	void Add(Player player);
	void Update(Player player);
	void Delete(Player player);  
}
