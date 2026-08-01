package com.synchronizedmethod.atmmachine;

public class InvalidAmount extends RuntimeException{
    public InvalidAmount() {
    }

    public InvalidAmount(String message) {
        super(message);
    }
}
