package com.cityproperties.dao;

import java.util.List;

import com.cityproperties.domain.BusinessAssociate;
import com.cityproperties.util.DataAccessLayerException;

public class BusinessAssociateDAO extends AbstractDAO {

	public BusinessAssociateDAO() {
		super();
	}

	public void addBusinessAssociate(BusinessAssociate businessAssociate) throws DataAccessLayerException {
		super.saveOrUpdate(businessAssociate);
	}

	public void updateBusinessAssociate(BusinessAssociate businessAssociate) throws DataAccessLayerException {
		super.saveOrUpdate(businessAssociate);
	}

	public void deleteBusinessAssociate(BusinessAssociate businessAssociate) throws DataAccessLayerException {
		super.delete(businessAssociate);
	}

	public BusinessAssociate findBusinessAssociate(Long id) throws DataAccessLayerException {
		return (BusinessAssociate) super.find(BusinessAssociate.class, id);
	}

	@SuppressWarnings("rawtypes")
	public List listBusinessAssociate() throws DataAccessLayerException {
		return super.findAll(BusinessAssociate.class);
	}

}
