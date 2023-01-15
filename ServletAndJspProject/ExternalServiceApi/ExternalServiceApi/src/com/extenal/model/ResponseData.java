package com.extenal.model;

public class ResponseData {
	
	private String dateStart;
	private String password;
	private String code;
	private Long active;
	private String dateEnd;
	private String id;
	private String plan;
	private String message;
	private Boolean success;

	public ResponseData(String dateStart, String password, String code, Long active, String dateEnd, String id,
			String plan, String message, Boolean success) {
		super();
		this.dateStart = dateStart;
		this.password = password;
		this.code = code;
		this.active = active;
		this.dateEnd = dateEnd;
		this.id = id;
		this.plan = plan;
		this.message = message;
		this.success = success;
	}

	public ResponseData() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getDateStart() {
		return dateStart;
	}

	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getActive() {
		return active;
	}

	public void setActive(Long active) {
		this.active = active;
	}

	public String getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "ResponseData [dateStart=" + dateStart + ", password=" + password + ", code=" + code + ", active="
				+ active + ", dateEnd=" + dateEnd + ", id=" + id + ", plan=" + plan + ", message=" + message
				+ ", success=" + success + "]";
	}

	

}
