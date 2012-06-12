package com.cityproperties.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * BusinessAssociate
 */
public class BusinessAssociate implements java.io.Serializable {
	//TODO Generate Java Doc
	private Integer businessAssociateId;
	private Client client;
	private String firstName;
	private String middleName;
	private String lastName;
	private String sex;
	private String email;
	private String homePhone;
	private String workPhone;
	private String mobilePhone;
	private Date birthDate;
	private Date anniversaryDate;
	private Boolean isSupplier;
	private Set<MailRecord> mailRecords = new HashSet<MailRecord>(0);

	public BusinessAssociate() {
	}

	public BusinessAssociate(Integer businessAssociateId, Client client, String firstName,
			String lastName, String sex, String email, Boolean isSupplier) {
		this.businessAssociateId = businessAssociateId;
		this.client = client;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.email = email;
		this.isSupplier = isSupplier;
	}

	public BusinessAssociate(Integer businessAssociateId, Client client, String firstName,
			String middleName, String lastName, String sex, String email,
			String homePhone, String workPhone, String mobilePhone,
			Date birthDate, Date anniversaryDate, Boolean isSupplier,
			Set<MailRecord> mailRecords) {
		this.businessAssociateId = businessAssociateId;
		this.client = client;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.sex = sex;
		this.email = email;
		this.homePhone = homePhone;
		this.workPhone = workPhone;
		this.mobilePhone = mobilePhone;
		this.birthDate = birthDate;
		this.anniversaryDate = anniversaryDate;
		this.isSupplier = isSupplier;
		this.mailRecords = mailRecords;
	}

	/**
	 * @return the businessAssociateId
	 */
	public Integer getBusinessAssociateId() {
		return businessAssociateId;
	}

	/**
	 * @param businessAssociateId the businessAssociateId to set
	 */
	public void setBusinessAssociateId(Integer businessAssociateId) {
		this.businessAssociateId = businessAssociateId;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the homePhone
	 */
	public String getHomePhone() {
		return homePhone;
	}

	/**
	 * @param homePhone the homePhone to set
	 */
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	/**
	 * @return the workPhone
	 */
	public String getWorkPhone() {
		return workPhone;
	}

	/**
	 * @param workPhone the workPhone to set
	 */
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	/**
	 * @return the mobilePhone
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}

	/**
	 * @param mobilePhone the mobilePhone to set
	 */
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the anniversaryDate
	 */
	public Date getAnniversaryDate() {
		return anniversaryDate;
	}

	/**
	 * @param anniversaryDate the anniversaryDate to set
	 */
	public void setAnniversaryDate(Date anniversaryDate) {
		this.anniversaryDate = anniversaryDate;
	}

	/**
	 * @return the isSupplier
	 */
	public Boolean isSupplier() {
		return isSupplier;
	}

	/**
	 * @param isSupplier the isSupplier to set
	 */
	public void setSupplier(Boolean isSupplier) {
		this.isSupplier = isSupplier;
	}

	/**
	 * @return the mailRecords
	 */
	public Set<MailRecord> getMailRecords() {
		return mailRecords;
	}

	/**
	 * @param mailRecords the mailRecords to set
	 */
	public void setMailRecords(Set<MailRecord> mailRecords) {
		this.mailRecords = mailRecords;
	}

}
