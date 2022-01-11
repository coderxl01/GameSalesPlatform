package Entities;

import java.sql.Date;

public class Campaign {
	private int id;
	private String campaignName;
	private double percentDiscount;
	private Date startTime;	
	private Date endTime;
	public Campaign() { 
	}
	public Campaign(int id, String campaignName, double percentDiscount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.percentDiscount = percentDiscount;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public double getpercentDiscount() {
		return percentDiscount;
	}
	public void setpercentDiscount(double percentDiscount) {
		this.percentDiscount = percentDiscount;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}	
	
}
