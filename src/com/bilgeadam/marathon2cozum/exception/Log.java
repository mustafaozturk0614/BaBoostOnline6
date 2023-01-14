package com.bilgeadam.marathon2cozum.exception;

import java.io.Serializable;
import java.util.UUID;

public class Log implements Serializable {

	String id;
	String errorMessage;
	Integer errorCode;
	String className;
	String methodName;
	Long timeStamp;
	String detail;

	@Override
	public String toString() {
		return "Log{" + "id='" + id + '\'' + ", errorMessage='" + errorMessage + '\'' + ", errorCode=" + errorCode
				+ ", className='" + className + '\'' + ", methodName='" + methodName + '\'' + ", timeStamp=" + timeStamp
				+ ", detail='" + detail + '\'' + '}';
	}

	public Log(String errorMessage, Integer errorCode, String className, String methodName, Long timeStamp,
			String detail) {
		this.id = UUID.randomUUID().toString();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.className = className;
		this.methodName = methodName;
		this.timeStamp = timeStamp;
		this.detail = detail;
	}

	public Log(String errorMessage, Integer errorCode, String className, String methodName, Long timeStamp) {
		this.id = UUID.randomUUID().toString();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.className = className;
		this.methodName = methodName;
		this.timeStamp = timeStamp;

	}

	public Log() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}
