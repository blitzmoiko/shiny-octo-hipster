package com.cityproperties.domain;

/**
 * ClientPrivilege
 */
public class ClientPrivilege implements java.io.Serializable {
	//TODO Generate Java Doc
	private Integer clientId;
	private Client client;
	private Boolean hasView;
	private Boolean hasInsert;
	private Boolean hasUpdate;
	private Boolean hasDelete;

	public ClientPrivilege() {
	}

	public ClientPrivilege(Client client, Boolean hasView, Boolean hasInsert,
			Boolean hasUpdate, Boolean hasDelete) {
		this.client = client;
		this.hasView = hasView;
		this.hasInsert = hasInsert;
		this.hasUpdate = hasUpdate;
		this.hasDelete = hasDelete;
	}

	/**
	 * @return
	 */
	public Integer getClientId() {
		return this.clientId;
	}

	/**
	 * @param clientId
	 */
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return
	 */
	public Client getClient() {
		return this.client;
	}

	/**
	 * @param client
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @return
	 */
	public Boolean hasView() {
		return this.hasView;
	}

	/**
	 * @param hasView
	 */
	public void setView(Boolean hasView) {
		this.hasView = hasView;
	}

	/**
	 * @return
	 */
	public Boolean hasInsert() {
		return this.hasInsert;
	}

	/**
	 * @param hasInsert
	 */
	public void setInsert(Boolean hasInsert) {
		this.hasInsert = hasInsert;
	}

	/**
	 * @return
	 */
	public Boolean hasUpdate() {
		return this.hasUpdate;
	}

	/**
	 * @param hasUpdate
	 */
	public void setUpdate(Boolean hasUpdate) {
		this.hasUpdate = hasUpdate;
	}

	/**
	 * @return
	 */
	public Boolean hasDelete() {
		return this.hasDelete;
	}

	/**
	 * @param hasDelete
	 */
	public void setDelete(Boolean hasDelete) {
		this.hasDelete = hasDelete;
	}

}
