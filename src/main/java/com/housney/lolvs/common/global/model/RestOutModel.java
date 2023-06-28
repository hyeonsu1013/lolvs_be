package com.housney.lolvs.common.global.model;

import com.housney.lolvs.common.global.exception.HyError;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestOutModel<T> {

    private String status = "SUCCESS";
    private Object code;
    private String message;
    private T data;

    @SuppressWarnings("unchecked")
    public RestOutModel(int code, String status, String message, Object data) {
        this(status, new Object(), message, (T) data);
        this.code = code;
    }

    public void setCode(int errCode) {
        this.code = errCode;
    }
	public void setCode(HyError hyError) {
		this.code = hyError.getValue();
	}
}
