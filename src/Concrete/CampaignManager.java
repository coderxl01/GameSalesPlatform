package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void Add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyas� eklendi");
	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyas� g�ncellendi");
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyas� silindi");
		
	}

	 
		 

}