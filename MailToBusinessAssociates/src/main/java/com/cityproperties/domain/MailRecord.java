package com.cityproperties.domain;

import java.util.Date;

/**
 * MailRecord
 */
public class MailRecord implements java.io.Serializable {
	//TODO Generate Java Doc
	private Integer mailRecordId;
	private Client client;
	private MailType mailType;
	private BusinessAssociate businessAssociate;
	private String comments;
	private Date sentDate;

	public MailRecord() {
	}

	public MailRecord(Integer mailRecordId, Client client, MailType mailType,
			BusinessAssociate businessAssociate, Date sentDate) {
		this.mailRecordId = mailRecordId;
		this.client = client;
		this.mailType = mailType;
		this.businessAssociate = businessAssociate;
		this.sentDate = sentDate;
	}

	public MailRecord(Integer mailRecordId, Client client, MailType mailType,
			BusinessAssociate businessAssociate, String comments, Date sentDate) {
		this.mailRecordId = mailRecordId;
		this.client = client;
		this.mailType = mailType;
		this.businessAssociate = businessAssociate;
		this.comments = comments;
		this.sentDate = sentDate;
	}

	/**
	 * @return the mailRecordId
	 */
	public Integer getMailRecordId() {
		return mailRecordId;
	}

	/**
	 * @param mailRecordId the mailRecordId to set
	 */
	public void setMailRecordId(Integer mailRecordId) {
		this.mailRecordId = mailRecordId;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @return the mailType
	 */
	public MailType getMailType() {
		return mailType;
	}

	/**
	 * @param mailType the mailType to set
	 */
	public void setMailType(MailType mailType) {
		this.mailType = mailType;
	}

	/**
	 * @return the businessAssociate
	 */
	public BusinessAssociate getBusinessAssociate() {
		return businessAssociate;
	}

	/**
	 * @param businessAssociate the businessAssociate to set
	 */
	public void setBusinessAssociate(BusinessAssociate businessAssociate) {
		this.businessAssociate = businessAssociate;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the sentDate
	 */
	public Date getSentDate() {
		return sentDate;
	}

	/**
	 * @param sentDate the sentDate to set
	 */
	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}

}
