package com.cityproperties.dao;

import java.util.List;

import com.cityproperties.domain.LetterTemplate;
import com.cityproperties.util.DataAccessLayerException;

public class LetterTemplateDAO extends AbstractDAO {

	public LetterTemplateDAO() {
		super();
	}

	public void addLetterTemplate(LetterTemplate letterTemplate) throws DataAccessLayerException {
		super.saveOrUpdate(letterTemplate);
	}

	public void updateLetterTemplate(LetterTemplate letterTemplate) throws DataAccessLayerException {
		super.saveOrUpdate(letterTemplate);
	}

	public void deleteLetterTemplate(LetterTemplate letterTemplate) throws DataAccessLayerException {
		super.delete(letterTemplate);
	}

	public LetterTemplate findLetterTemplate(Long id) throws DataAccessLayerException {
		return (LetterTemplate) super.find(LetterTemplate.class, id);
	}

	@SuppressWarnings("rawtypes")
	public List listLetterTemplate() throws DataAccessLayerException {
		return super.findAll(LetterTemplate.class);
	}

}
