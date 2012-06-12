package com.cityproperties.web;

import java.util.ArrayList;
import java.util.List;

import com.cityproperties.dao.MailRecordDAO;
import com.cityproperties.domain.MailRecord;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class MailRecordAction extends ActionSupport implements ModelDriven<MailRecord> {

	private MailRecord mailRecord = new MailRecord();
	private List<MailRecord> mailRecords = new ArrayList<MailRecord>();
	private MailRecordDAO mailRecordDAO = new MailRecordDAO();

	@Override
	public MailRecord getModel() {
		return mailRecord;
	}

	public boolean add() {
		mailRecordDAO.addMailRecord(mailRecord);
		return true;
	}

	@SuppressWarnings("unchecked")
	public boolean list() {
		mailRecords = mailRecordDAO.listMailRecord();
		return true;
	}

	public MailRecord getMailRecord() {
		return mailRecord;
	}

	public void setMailRecord(MailRecord mailRecord) {
		this.mailRecord = mailRecord;
	}

	public List<MailRecord> getMailRecordList() {
		return mailRecords;
	}

	public void setMailRecordList(List<MailRecord> mailRecords) {
		this.mailRecords = mailRecords;
	}

}
