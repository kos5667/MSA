package org.riot.api.common.exception;

import org.riot.api.common.util.RiotCodeType;

public class RiotException extends Exception{
    
    private int code;
    private String reason;

    public RiotException(RiotCodeType code) {
        switch (code.getCode()) {
            case 400:
                this.code = code.getCode();
                break;
            case 401:
                this.code = code.getCode();
                break;
            case 403:
                this.code = code.getCode();
                break;
            case 404:
                break;
            case 405:
                break;
            case 415:
                break;
            case 429:
                break;
            case 500:
                break;
            case 502:
                break;
            case 503:
                break;
            case 504:
                break;
            }
    }

    public int getCode() {
        return this.code;
    }

    public String getReason() {
        return this.reason;
    }
}
