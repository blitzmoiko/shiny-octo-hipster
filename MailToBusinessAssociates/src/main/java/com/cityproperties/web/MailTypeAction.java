package com.cityproperties.web;

import java.util.ArrayList;
import java.util.List;

import com.cityproperties.dao.MailTypeDAO;
import com.cityproperties.domain.MailType;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class MailTypeAction extends ActionSupport implements ModelDriven<MailType> {

	private MailType mailType = new MailType();
	private List<MailType> mailTypes = new ArrayList<MailType>();
	private MailTypeDAO mailTypeDAO = new MailTypeDAO();

	@Override
	public MailType getModel() {
		return mailType;
	}

	public boolean add() {
		mailTypeDAO.addMailType(mailType);
		return true;
	}

	@SuppressWarnings("unchecked")
	public boolean list() {
		mailTypes = mailTypeDAO.listMailType();
		return true;
	}

	public MailType getMailType() {
		return mailType;
	}

	public void setMailType(MailType mailType) {
		this.mailType = mailType;
	}

	public List<MailType> getMailTypeList() {
		return mailTypes;
	}

	public void setMailTypeList(List<MailType> mailTypes) {
		this.mailTypes = mailTypes;
	}

}
