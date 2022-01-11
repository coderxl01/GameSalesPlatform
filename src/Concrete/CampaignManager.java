package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void Add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyasý eklendi");
	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyasý güncellendi");
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyasý silindi");
		
	}

	 
		 

}