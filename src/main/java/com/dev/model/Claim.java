package main.java.com.dev.model;

import java.util.Date;

public class Claim {
	
	private int claimId;
	private int claimType;
	private int status;
	private Date claimApprovedOn;
	private Date dateClaimed;
	/**
	 * @return the claimId
	 */
	public int getClaimId() {
		return claimId;
	}
	/**
	 * @param claimId the claimId to set
	 */
	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}
	/**
	 * @return the claimType
	 */
	public int getClaimType() {
		return claimType;
	}
	/**
	 * @param claimType the claimType to set
	 */
	public void setClaimType(int claimType) {
		this.claimType = claimType;
	}
	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	/**
	 * @return the claimApprovedOn
	 */
	public Date getClaimApprovedOn() {
		return claimApprovedOn;
	}
	/**
	 * @param claimApprovedOn the claimApprovedOn to set
	 */
	public void setClaimApprovedOn(Date claimApprovedOn) {
		this.claimApprovedOn = claimApprovedOn;
	}
	/**
	 * @return the dateClaimed
	 */
	public Date getDateClaimed() {
		return dateClaimed;
	}
	/**
	 * @param dateClaimed the dateClaimed to set
	 */
	public void setDateClaimed(Date dateClaimed) {
		this.dateClaimed = dateClaimed;
	}
	
	public Claim(){
		
	}
	public Claim(int claimId, int claimType, int status, Date claimApprovedOn, Date dateClaimed) {
		super();
		this.claimId = claimId;
		this.claimType = claimType;
		this.status = status;
		this.claimApprovedOn = claimApprovedOn;
		this.dateClaimed = dateClaimed;
	}
	
	
	
	

}
