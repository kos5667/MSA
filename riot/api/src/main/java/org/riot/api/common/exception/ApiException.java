package org.riot.api.common.exception;

import org.riot.api.common.util.CodeType;

public class ApiException extends Exception {
    
    private CodeType codeType;
	
	public ApiException() { }
	
	public ApiException(String message) {
		super(message);
	}
	
	public ApiException(CodeType codeType ) {
		this.codeType = codeType;
	}
	
	public ApiException(String message, CodeType codeType ) {
		super(message);
		this.codeType = codeType;
	}
	
	public ApiException(CodeType codeType, String message) {
		super(message);
		this.codeType = codeType;
	}
	
	public CodeType getCodeType() {
		return this.codeType;
	}
}
