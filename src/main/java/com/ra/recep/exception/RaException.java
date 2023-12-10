package com.ra.recep.exception;

public class RaException extends RuntimeException{
    private ErrorMessage errorMessage;

    public RaException(String errorCode) {
        super(errorCode);
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setCode(errorCode);
        Messages mess = new Messages();
        mess.setJp("システムエラー");
        mess.setEn("System error");
        errorMessage.setMessages(mess);
        this.errorMessage = errorMessage;
    }

    public ErrorMessage getErrorMessage() {
        return errorMessage;
    }
}
