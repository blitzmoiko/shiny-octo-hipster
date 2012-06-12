package com.cityproperties.dao;

import java.util.List;

import com.cityproperties.domain.Client;
import com.cityproperties.util.DataAccessLayerException;

public class ClientDAO extends AbstractDAO {

	public ClientDAO() {
		super();
	}

	public void addClient(Client client) throws DataAccessLayerException {
		super.saveOrUpdate(client);
	}

	public void updateClient(Client client) throws DataAccessLayerException {
		super.saveOrUpdate(client);
	}

	public void deleteClient(Client client) throws DataAccessLayerException {
		super.delete(client);
	}

	public Client findClient(Long id) throws DataAccessLayerException {
		return (Client) super.find(Client.class, id);
	}

	@SuppressWarnings("rawtypes")
	public List listClient() throws DataAccessLayerException {
		return super.findAll(Client.class);
	}

}
