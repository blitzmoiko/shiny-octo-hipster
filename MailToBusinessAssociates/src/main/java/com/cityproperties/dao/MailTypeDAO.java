package com.cityproperties.dao;

import java.util.List;

import com.cityproperties.domain.MailType;
import com.cityproperties.util.DataAccessLayerException;

public class MailTypeDAO extends AbstractDAO {

	public MailTypeDAO() {
		super();
	}

	public void addMailType(MailType mailType) throws DataAccessLayerException {
		super.saveOrUpdate(mailType);
	}

	public void updateMailType(MailType mailType) throws DataAccessLayerException {
		super.saveOrUpdate(mailType);
	}

	public void deleteMailType(MailType mailType) throws DataAccessLayerException {
		super.delete(mailType);
	}

	public MailType findMailType(Long id) throws DataAccessLayerException {
		return (MailType) super.find(MailType.class, id);
	}

	@SuppressWarnings("rawtypes")
	public List listMailType() throws DataAccessLayerException {
		return super.findAll(MailType.class);
	}

}
