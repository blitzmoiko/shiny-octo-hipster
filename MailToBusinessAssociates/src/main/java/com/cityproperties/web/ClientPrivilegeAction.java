package com.cityproperties.web;

import java.util.ArrayList;
import java.util.List;

import com.cityproperties.dao.ClientPrivilegeDAO;
import com.cityproperties.domain.ClientPrivilege;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ClientPrivilegeAction extends ActionSupport implements ModelDriven<ClientPrivilege> {

	private ClientPrivilege privilege = new ClientPrivilege();
	private List<ClientPrivilege> privileges = new ArrayList<ClientPrivilege>();
	private ClientPrivilegeDAO privilegeDAO = new ClientPrivilegeDAO();

	@Override
	public ClientPrivilege getModel() {
		return privilege;
	}

	public boolean add() {
		privilegeDAO.addClientPrivilege(privilege);
		return true;
	}

	@SuppressWarnings("unchecked")
	public boolean list() {
		privileges = privilegeDAO.listClientPrivilege();
		return true;
	}

	public ClientPrivilege getClientPrivilege() {
		return privilege;
	}

	public void setClientPrivilege(ClientPrivilege privilege) {
		this.privilege = privilege;
	}

	public List<ClientPrivilege> getClientPrivilegeList() {
		return privileges;
	}

	public void setClientPrivilegeList(List<ClientPrivilege> privileges) {
		this.privileges = privileges;
	}

}
