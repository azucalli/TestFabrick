package com.fabrick.exercise.dto;


public class ResponseModel {

	public String status;
	public Errors errors;
	
	public class Errors{
		public String code;
		public String description;
		public String params;
		
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getParams() {
			return params;
		}
		public void setParams(String params) {
			this.params = params;
		}
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Errors getErrors() {
		return errors;
	}

	public void setErrors(Errors errors) {
		this.errors = errors;
	}

	
}
