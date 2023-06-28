package com.housney.lolvs.common.global.advice;

import com.housney.lolvs.common.global.exception.HyError;
import com.housney.lolvs.common.global.exception.HyException;
import com.housney.lolvs.common.global.model.RestOutModel;
import com.housney.lolvs.common.utils.HyStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionAdvice extends Exception {

	final static Logger logger = LoggerFactory.getLogger(GlobalExceptionAdvice.class);

	private static final long serialVersionUID = -5297056074777366872L;
	private static final String ERR = "FAIL";

	@SuppressWarnings("rawtypes")
	@ExceptionHandler(Exception.class)
	protected ResponseEntity<RestOutModel> handleException(Exception e) {
		// Exception 이름만 추출
//		String errMsg = PhStringUtils.getExptNm(e.getMessage());

		final RestOutModel response = new RestOutModel(HttpStatus.INTERNAL_SERVER_ERROR.value(), ERR, e.getMessage(), null);
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}


	@SuppressWarnings("rawtypes")
	@ExceptionHandler(HyException.class)
	protected ResponseEntity<RestOutModel> handlePayException(HyException e) {

		String responseMessage = e.getMessage();
		if(HyStringUtils.isBlank(e.getMessage())) {
			responseMessage = HyError.valueOf(e.getCode()).getReasonPhrase();
		}

		final RestOutModel response = new RestOutModel(HyError.valueOf(e.getCode()).getValue(), ERR, responseMessage, null);
		logger.debug(response.toString());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
