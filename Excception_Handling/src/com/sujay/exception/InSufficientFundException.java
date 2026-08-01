package com.sujay.exception;

public class InSufficientFundException extends RuntimeException{
    public InSufficientFundException() {
    }

    public InSufficientFundException(String message) {
        super(message);
    }
}
