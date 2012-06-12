package com.cityproperties.web;

import java.util.ArrayList;
import java.util.List;

import com.cityproperties.dao.LetterTemplateDAO;
import com.cityproperties.domain.LetterTemplate;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LetterTemplateAction extends ActionSupport implements ModelDriven<LetterTemplate> {

	private LetterTemplate letterTemplate = new LetterTemplate();
	private List<LetterTemplate> letterTemplates = new ArrayList<LetterTemplate>();
	private LetterTemplateDAO letterTemplateDAO = new LetterTemplateDAO();

	@Override
	public LetterTemplate getModel() {
		return letterTemplate;
	}

	public boolean add() {
		letterTemplateDAO.addLetterTemplate(letterTemplate);
		return true;
	}

	@SuppressWarnings("unchecked")
	public boolean list() {
		letterTemplates = letterTemplateDAO.listLetterTemplate();
		return true;
	}

	public LetterTemplate getLetterTemplate() {
		return letterTemplate;
	}

	public void setLetterTemplate(LetterTemplate letterTemplate) {
		this.letterTemplate = letterTemplate;
	}

	public List<LetterTemplate> getLetterTemplateList() {
		return letterTemplates;
	}

	public void setLetterTemplateList(List<LetterTemplate> letterTemplates) {
		this.letterTemplates = letterTemplates;
	}

}
