package com.mydog.website;

public class TipException extends RuntimeException {
    public TipException(){

    }

    public TipException(String message){
        super(message);
    }

    public TipException(String message, Throwable throwable){
        super(message, throwable);
    }

    public TipException(Throwable throwable){
        super(throwable);
    }
}
