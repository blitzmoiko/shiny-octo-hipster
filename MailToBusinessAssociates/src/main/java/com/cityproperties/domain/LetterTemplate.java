package com.cityproperties.domain;

import java.sql.Blob;
import java.util.HashSet;
import java.util.Set;

/**
 * LetterTemplate
 */
public class LetterTemplate implements java.io.Serializable {
	//TODO Generate Java Doc
	private Integer letterTemplateId;
	private Blob template;
	private Set<MailType> mailTypes = new HashSet<MailType>(0);

	public LetterTemplate() {
	}

	public LetterTemplate(Integer letterTemplateId, Blob template) {
		this.letterTemplateId = letterTemplateId;
		this.template = template;
	}

	public LetterTemplate(Integer letterTemplateId, Blob template,
			Set<MailType> mailTypes) {
		this.letterTemplateId = letterTemplateId;
		this.template = template;
		this.mailTypes = mailTypes;
	}
	
	/**
	 * @return the letterTemplateId
	 */
	public Integer getLetterTemplateId() {
		return letterTemplateId;
	}

	/**
	 * @param letterTemplateId the letterTemplateId to set
	 */
	public void setLetterTemplateId(Integer letterTemplateId) {
		this.letterTemplateId = letterTemplateId;
	}

	/**
	 * @return the template
	 */
	public Blob getTemplate() {
		return template;
	}

	/**
	 * @param template the template to set
	 */
	public void setTemplate(Blob template) {
		this.template = template;
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
