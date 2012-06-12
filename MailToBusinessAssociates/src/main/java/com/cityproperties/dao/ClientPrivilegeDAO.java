package com.cityproperties.dao;

import java.util.List;

import com.cityproperties.domain.ClientPrivilege;
import com.cityproperties.util.DataAccessLayerException;

public class ClientPrivilegeDAO extends AbstractDAO {

	public ClientPrivilegeDAO() {
		super();
	}

	public void addClientPrivilege(ClientPrivilege privilege) throws DataAccessLayerException {
		super.saveOrUpdate(privilege);
	}

	public void updateClientPrivilege(ClientPrivilege privilege) throws DataAccessLayerException {
		super.saveOrUpdate(privilege);
	}

	public void deleteClientPrivilege(ClientPrivilege privilege) throws DataAccessLayerException {
		super.delete(privilege);
	}

	public ClientPrivilege findClientPrivilege(Long id) throws DataAccessLayerException {
		return (ClientPrivilege) super.find(ClientPrivilege.class, id);
	}

	@SuppressWarnings("rawtypes")
	public List listClientPrivilege() throws DataAccessLayerException {
		return super.findAll(ClientPrivilege.class);
	}

}
