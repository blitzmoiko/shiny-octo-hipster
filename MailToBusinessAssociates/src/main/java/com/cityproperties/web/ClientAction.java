package com.cityproperties.web;

import java.util.ArrayList;
import java.util.List;

import com.cityproperties.dao.ClientDAO;
import com.cityproperties.domain.Client;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ClientAction extends ActionSupport implements ModelDriven<Client> {

	private Client client = new Client();
	private List<Client> clients = new ArrayList<Client>();
	private ClientDAO clientDAO = new ClientDAO();

	@Override
	public Client getModel() {
		return client;
	}

	public boolean add() {
		clientDAO.addClient(client);
		return true;
	}

	@SuppressWarnings("unchecked")
	public boolean list() {
		clients = clientDAO.listClient();
		return true;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Client> getClientList() {
		return clients;
	}

	public void setClientList(List<Client> clients) {
		this.clients = clients;
	}

}
