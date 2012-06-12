package com.cityproperties.web;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class ChangePasswordAction extends ActionSupport {
	private String oldPassword;
	private String newPassword;

	public String execute() {
//TODO
//Old password must be existing in the db, with the user logged in
//If old password equals new password, return "Entered new password is still same with the old password. Please enter new one."
//New password, must at least be 6 characters
//New password, validate
//Password must be encrypted
//New Password must be same with retyped password
		if (this.oldPassword.equals(newPassword)) {
			return Action.ERROR;
		} else {
			addActionError(getText("error.login"));
			return Action.ERROR;
		}
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}

