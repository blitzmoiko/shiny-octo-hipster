package com.cityproperties.dao;

import java.util.List;

import com.cityproperties.domain.MailRecord;
import com.cityproperties.util.DataAccessLayerException;

public class MailRecordDAO extends AbstractDAO {

	public MailRecordDAO() {
		super();
	}

	public void addMailRecord(MailRecord mailRecord) throws DataAccessLayerException {
		super.saveOrUpdate(mailRecord);
	}

	public void updateMailRecord(MailRecord mailRecord) throws DataAccessLayerException {
		super.saveOrUpdate(mailRecord);
	}

	public void deleteMailRecord(MailRecord mailRecord) throws DataAccessLayerException {
		super.delete(mailRecord);
	}

	public MailRecord findMailRecord(Long id) throws DataAccessLayerException {
		return (MailRecord) super.find(MailRecord.class, id);
	}

	@SuppressWarnings("rawtypes")
	public List listMailRecord() throws DataAccessLayerException {
		return super.findAll(MailRecord.class);
	}

}
