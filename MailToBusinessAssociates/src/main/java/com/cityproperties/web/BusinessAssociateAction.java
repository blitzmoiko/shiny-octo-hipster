package com.cityproperties.web;

import java.util.ArrayList;
import java.util.List;

import com.cityproperties.dao.BusinessAssociateDAO;
import com.cityproperties.domain.BusinessAssociate;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BusinessAssociateAction extends ActionSupport implements ModelDriven<BusinessAssociate> {

	private BusinessAssociate businessAssociate = new BusinessAssociate();
	private List<BusinessAssociate> businessAssociates = new ArrayList<BusinessAssociate>();
	private BusinessAssociateDAO businessAssociateDAO = new BusinessAssociateDAO();

	@Override
	public BusinessAssociate getModel() {
		return businessAssociate;
	}

	public boolean add() {
		businessAssociateDAO.addBusinessAssociate(businessAssociate);
		return true;
	}

	@SuppressWarnings("unchecked")
	public boolean list() {
		businessAssociates = businessAssociateDAO.listBusinessAssociate();
		return true;
	}

	public BusinessAssociate getBusinessAssociate() {
		return businessAssociate;
	}

	public void setBusinessAssociate(BusinessAssociate businessAssociate) {
		this.businessAssociate = businessAssociate;
	}

	public List<BusinessAssociate> getBusinessAssociateList() {
		return businessAssociates;
	}

	public void setBusinessAssociateList(List<BusinessAssociate> businessAssociates) {
		this.businessAssociates = businessAssociates;
	}

}
