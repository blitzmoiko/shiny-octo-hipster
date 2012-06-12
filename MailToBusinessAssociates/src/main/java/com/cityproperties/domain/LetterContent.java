package com.cityproperties.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * LetterContent
 */
public class LetterContent implements java.io.Serializable {
	//TODO Generate Java Doc
	private Integer letterContentId;
	private String content;
	private Set<MailType> mailTypes = new HashSet<MailType>(0);

	public LetterContent() {
	}

	public LetterContent(Integer letterContentId, String content) {
		this.letterContentId = letterContentId;
		this.content = content;
	}

	public LetterContent(Integer letterContentId, String content, Set<MailType> mailTypes) {
		this.letterContentId = letterContentId;
		this.content = content;
		this.mailTypes = mailTypes;
	}

	/**
	 * @return the letterContentId
	 */
	public Integer getLetterContentId() {
		return letterContentId;
	}

	/**
	 * @param letterContentId the letterContentId to set
	 */
	public void setLetterContentId(Integer letterContentId) {
		this.letterContentId = letterContentId;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return
	 */
	public Set<MailType> getMailTypes() {
		return this.mailTypes;
	}

	/**
	 * @param mailTypes
	 */
	public void setMailTypes(Set<MailType> mailTypes) {
		this.mailTypes = mailTypes;
	}

}
