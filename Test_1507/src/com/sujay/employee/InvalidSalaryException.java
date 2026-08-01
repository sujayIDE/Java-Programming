package com.sujay.employee;

public class InvalidSalaryException extends RuntimeException{
    public InvalidSalaryException() {
    }

    public InvalidSalaryException(String message) {
        super(message);
    }
}
