package com.tastingspace.tastingprocess;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TastingResult implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String sauceId;
	private java.lang.Boolean isSauceAsDescribed;

	public TastingResult() {
	}

	public java.lang.String getSauceId() {
		return this.sauceId;
	}

	public void setSauceId(java.lang.String sauceId) {
		this.sauceId = sauceId;
	}

	public java.lang.Boolean getIsSauceAsDescribed() {
		return this.isSauceAsDescribed;
	}

	public void setIsSauceAsDescribed(java.lang.Boolean isSauceAsDescribed) {
		this.isSauceAsDescribed = isSauceAsDescribed;
	}

	public TastingResult(java.lang.String sauceId,
			java.lang.Boolean isSauceAsDescribed) {
		this.sauceId = sauceId;
		this.isSauceAsDescribed = isSauceAsDescribed;
	}

}