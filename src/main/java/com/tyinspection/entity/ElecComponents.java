package com.tyinspection.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ElecComponents {
	private long id;
	private String inspectSerialNum;
	private String purchaseNum;
	private String materialName;
	private String manufacturers;
	private String userDepartment;
	private String inspectCondition;
	private Integer inspectNum;
	private Integer dapNum;
	private Date sendDate;
	
	public ElecComponents() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ElecComponents(long id, String inspectSerialNum, String purchaseNum,
			String materialName, String manufacturers, String userDepartment,
			String inspectCondition, Integer inspectNum, Integer dapNum,
			Date sendDate, String remark) {
		super();
		this.id = id;
		this.inspectSerialNum = inspectSerialNum;
		this.purchaseNum = purchaseNum;
		this.materialName = materialName;
		this.manufacturers = manufacturers;
		this.userDepartment = userDepartment;
		this.inspectCondition = inspectCondition;
		this.inspectNum = inspectNum;
		this.dapNum = dapNum;
		this.sendDate = sendDate;
		this.remark = remark;
	}

	@JsonFormat(pattern="yyy-MM-dd")
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	private String remark;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getInspectSerialNum() {
		return inspectSerialNum;
	}
	public void setInspectSerialNum(String inspectSerialNum) {
		this.inspectSerialNum = inspectSerialNum;
	}
	public String getPurchaseNum() {
		return purchaseNum;
	}
	public void setPurchaseNum(String purchaseNum) {
		this.purchaseNum = purchaseNum;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public String getManufacturers() {
		return manufacturers;
	}
	public void setManufacturers(String manufacturers) {
		this.manufacturers = manufacturers;
	}
	public String getUserDepartment() {
		return userDepartment;
	}
	public void setUserDepartment(String userDepartment) {
		this.userDepartment = userDepartment;
	}
	public String getInspectCondition() {
		return inspectCondition;
	}
	public void setInspectCondition(String inspectCondition) {
		this.inspectCondition = inspectCondition;
	}
	public Integer getInspectNum() {
		return inspectNum;
	}
	public void setInspectNum(Integer inspectNum) {
		this.inspectNum = inspectNum;
	}
	public Integer getDapNum() {
		return dapNum;
	}
	public void setDapNum(Integer dapNum) {
		this.dapNum = dapNum;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
