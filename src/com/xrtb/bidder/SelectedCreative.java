package com.xrtb.bidder;

import com.xrtb.common.Campaign;
import com.xrtb.common.Creative;

/**
 * A class that is used to hold a campaign and the associated creative that matches a bid request. Used by the
 * CampaignProcessor to return the campaign+creative pair, which will then be used by the CampaignSelector to
 * make the BidResponse.
 * @author Ben M. Faul
 *
 */

public class SelectedCreative {
	public String dealId;
	public double price;
	public String impid;
	/** The campaign of the selection */
	Campaign campaign;
	/** The creative within the campaign that was selected */
	Creative creative;
	/** The cap specification, if present */
	String capSpec;
	
	/**
	 * Return the campaign of the selection.
	 * @return Campaign. The campaign.
	 */
	public Campaign getCampaign() {
		return campaign;
	}

	/**
	 * Returns the Creative that was selected out of the campaign
	 * @return Creative. The selected creative.
	 */
	public Creative getCreative() {
		return creative;
	}

	public double getPrice() {
		return price;
	}
	
	public String getDealId() {
		return dealId;
	}
	
	public SelectedCreative(Creative creative,  String dealId, double price, String impid) {
		this.campaign = campaign;
		this.creative = creative;
		this.dealId = dealId;
		this.price = price;
		this.impid = impid;
	}
}
