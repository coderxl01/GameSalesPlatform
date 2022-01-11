package Adapters; 
import Abstract.IPlayerCheckService;
import Entities.Player;
import MernisService.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPlayerCheckService {

 

	@Override
	public boolean CheckIfRealPerson(Player player) {  // servisten çekilecek
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try { 
			return client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getFirstName(),
					player.getLastName(), player.getDateOfBirh().getYear());
		} catch (Exception e) {
			System.out.println("hata");
			return false;
		}	
		
		 
	}
	
}
