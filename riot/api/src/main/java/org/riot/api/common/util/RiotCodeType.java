package org.riot.api.common.util;

public enum RiotCodeType {
    
    ERROR_BAD_REUEST                (400, "Bad request"),
    ERROR_UNAUTHORIZED              (401, "Unauthorized"),
    ERROR_FORBIDDEN                 (403, "Forbidden"),
    ERROR_DATA_NOT_FOUND            (404, "Data not found"),
    ERROR_METHOD_NOT_ALLOWED        (405, "Method not allowed"),
    ERROR_UNSUPPORTED_MEDIA_TYPE    (415, "Unsupported media type"),
    ERROR_RATE_LIMIT_EXCEEDED       (429, "Rate limit exceeded"),
    ERROR_INTERNAL_SERVER_ERROR     (500, "Internal server error"),
    ERROR_BAD_GATEWAY               (502, "Bad gateway"),
    ERROR_SERVICE_UNAVAILABLE       (503, "Service unavailable"),
    ERROR_GATEWAY_TIMEOUT           (504, "Gateway timeout");

    public int code;

	public String reason;

    RiotCodeType(int code, String reason) {
		this.code = code;
		this.reason = reason;
	}
	
	public int getCode() {
		return code;
	}
	public String getReason() {
		return reason;
	}
}
