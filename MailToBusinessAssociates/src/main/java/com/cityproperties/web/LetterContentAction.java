package com.cityproperties.web;

import java.util.ArrayList;
import java.util.List;

import com.cityproperties.dao.LetterContentDAO;
import com.cityproperties.domain.LetterContent;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LetterContentAction extends ActionSupport implements ModelDriven<LetterContent> {

	private LetterContent letterContent = new LetterContent();
	private List<LetterContent> letterContents = new ArrayList<LetterContent>();
	private LetterContentDAO letterContentDAO = new LetterContentDAO();

	@Override
	public LetterContent getModel() {
		return letterContent;
	}

	public boolean add() {
		letterContentDAO.addLetterContent(letterContent);
		return true;
	}

	@SuppressWarnings("unchecked")
	public boolean list() {
		letterContents = letterContentDAO.listLetterContent();
		return true;
	}

	public LetterContent getLetterContent() {
		return letterContent;
	}

	public void setLetterContent(LetterContent letterContent) {
		this.letterContent = letterContent;
	}

	public List<LetterContent> getLetterContentList() {
		return letterContents;
	}

	public void setLetterContentList(List<LetterContent> letterContents) {
		this.letterContents = letterContents;
	}

}
