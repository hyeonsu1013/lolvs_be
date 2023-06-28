package com.housney.lolvs.common.global.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Arrays;

@Data
@EqualsAndHashCode(callSuper = false)
public class HyException extends Exception {

    private Object code;
    private String message;

    public HyException() {
        // HyException 발생 시 StackTrace 제거
        StackTraceElement[] stackTrace = super.getStackTrace();
        StackTraceElement[] newArray = Arrays.stream(stackTrace).filter(i -> i.getMethodName().equals("The method to remove"))
                .toArray(StackTraceElement[]::new);
        super.setStackTrace(newArray);
    }

    public HyException(String errMsg) {
        super(errMsg);
        StackTraceElement[] stackTrace = super.getStackTrace();
        StackTraceElement[] newArray = Arrays.stream(stackTrace).filter(i -> i.getMethodName().equals("The method to remove"))
                .toArray(StackTraceElement[]::new);
        super.setStackTrace(newArray);
    }

    public HyException(HyError hyError) {
        this(hyError.getReasonPhrase());
        this.code = hyError.getValue();
    }

    public HyException(HyError hyError, String errMsg) {
        this(hyError);
        this.message = errMsg;
    }

    public int getCode() {
        return (Integer)this.code;
    }
}
