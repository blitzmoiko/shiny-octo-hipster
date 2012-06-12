package com.cityproperties.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * MailType
 */
public class MailType implements java.io.Serializable {
	//TODO Generate Java Doc
	private Integer mailTypeId;
	private LetterContent letterContent;
	private LetterTemplate letterTemplate;
	private String description;
	private Date revisionDate;
	private Set<MailRecord> mailRecords = new HashSet<MailRecord>(0);

	public MailType() {
	}

	/**
	 * @param mailTypeId
	 * @param letterContent
	 * @param letterTemplate
	 * @param description
	 * @param revisionDate
	 */
	public MailType(Integer mailTypeId, LetterContent letterContent,
			LetterTemplate letterTemplate, String description, Date revisionDate) {
		this.mailTypeId = mailTypeId;
		this.letterContent = letterContent;
		this.letterTemplate = letterTemplate;
		this.description = description;
		this.revisionDate = revisionDate;
	}

	/**
	 * @param mailTypeId
	 * @param letterContent
	 * @param letterTemplate
	 * @param description
	 * @param revisionDate
	 * @param mailRecords
	 */
	public MailType(Integer mailTypeId, LetterContent letterContent,
			LetterTemplate letterTemplate, String description, Date revisionDate,
			Set<MailRecord> mailRecords) {
		this.mailTypeId = mailTypeId;
		this.letterContent = letterContent;
		this.letterTemplate = letterTemplate;
		this.description = description;
		this.revisionDate = revisionDate;
		this.mailRecords = mailRecords;
	}

	/**
	 * @return the mailTypeId
	 */
	public Integer getMailTypeId() {
		return mailTypeId;
	}

	/**
	 * @param mailTypeId the mailTypeId to set
	 */
	public void setMailTypeId(Integer mailTypeId) {
		this.mailTypeId = mailTypeId;
	}

	/**
	 * @return the letterContent
	 */
	public LetterContent getLetterContent() {
		return letterContent;
	}

	/**
	 * @param letterContent the letterContent to set
	 */
	public void setLetterContent(LetterContent letterContent) {
		this.letterContent = letterContent;
	}

	/**
	 * @return the letterTemplate
	 */
	public LetterTemplate getLetterTemplate() {
		return letterTemplate;
	}

	/**
	 * @param letterTemplate the letterTemplate to set
	 */
	public void setLetterTemplate(LetterTemplate letterTemplate) {
		this.letterTemplate = letterTemplate;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the revisionDate
	 */
	public Date getRevisionDate() {
		return revisionDate;
	}

	/**
	 * @param revisionDate the revisionDate to set
	 */
	public void setRevisionDate(Date revisionDate) {
		this.revisionDate = revisionDate;
	}

	/**
	 * @return
	 */
	public Set<MailRecord> getMailRecords() {
		return this.mailRecords;
	}

	/**
	 * @param mailRecords
	 */
	public void setMailRecords(Set<MailRecord> mailRecords) {
		this.mailRecords = mailRecords;
	}
	
}
