package com.cityproperties.dao;

import java.util.List;

import com.cityproperties.domain.LetterContent;
import com.cityproperties.util.DataAccessLayerException;

public class LetterContentDAO extends AbstractDAO {

	public LetterContentDAO() {
		super();
	}

	public void addLetterContent(LetterContent letterContent) throws DataAccessLayerException {
		super.saveOrUpdate(letterContent);
	}

	public void updateLetterContent(LetterContent letterContent) throws DataAccessLayerException {
		super.saveOrUpdate(letterContent);
	}

	public void deleteLetterContent(LetterContent letterContent) throws DataAccessLayerException {
		super.delete(letterContent);
	}

	public LetterContent findLetterContent(Long id) throws DataAccessLayerException {
		return (LetterContent) super.find(LetterContent.class, id);
	}

	@SuppressWarnings("rawtypes")
	public List listLetterContent() throws DataAccessLayerException {
		return super.findAll(LetterContent.class);
	}

}
