package com.cityproperties.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Client
 */
public class Client implements java.io.Serializable {
	//TODO Generate Java Doc
	private Integer clientId;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private Boolean isSuper;
	private Boolean isActive;
	private Set<BusinessAssociate> businessAssociates = 
			new HashSet<BusinessAssociate>(0);
	private Set<ClientPrivilege> clientPrivileges = 
			new HashSet<ClientPrivilege>(0);

	public Client() {
	}

	public Client(Integer clientId, String firstName, String lastName, String username,
			String password, Boolean isSuper, Boolean isActive) {
		this.clientId = clientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.isSuper = isSuper;
		this.isActive = isActive;
	}

	public Client(Integer clientId, String firstName, String lastName, String username,
			String password, Boolean isSuper, Boolean isActive,
			Set<BusinessAssociate> businessAssociates,
			Set<ClientPrivilege> clientPrivileges) {
		this.clientId = clientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.isSuper = isSuper;
		this.isActive = isActive;
		this.businessAssociates = businessAssociates;
		this.clientPrivileges = clientPrivileges;
	}

	/**
	 * @return the clientId
	 */
	public Integer getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the isSuper
	 */
	public Boolean isSuper() {
		return isSuper;
	}

	/**
	 * @param isSuper the isSuper to set
	 */
	public void setSuper(Boolean isSuper) {
		this.isSuper = isSuper;
	}

	/**
	 * @return the isActive
	 */
	public Boolean isActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return
	 */
	public Set<BusinessAssociate> getBusinessAssociates() {
		return this.businessAssociates;
	}

	/**
	 * @param businessAssociates
	 */
	public void setBusinessAssociates(Set<BusinessAssociate> businessAssociates) {
		this.businessAssociates = businessAssociates;
	}

	/**
	 * @return
	 */
	public Set<ClientPrivilege> getClientPrivileges() {
		return this.clientPrivileges;
	}

	/**
	 * @param clientPrivileges
	 */
	public void setClientPrivileges(Set<ClientPrivilege> clientPrivileges) {
		this.clientPrivileges = clientPrivileges;
	}

}
