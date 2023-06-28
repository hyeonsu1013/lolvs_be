package com.housney.lolvs.common.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum HyError {

    /* default */
    SUCCESS(200, ""),
    INTERNAL_SERVER_ERROR(500, "내부 서버 오류가 발생했습니다."),
    

    /* Check Auth  */
    NO_ACCESS_TOKEN(1001, "토큰 정보가 없습니다."),
    EXPR_ACCESS_TOKEN(1002, "유효하지 않은 토큰 정보입니다."),
    ACCESS_NOT_ALLOWED(1003, "허용되지 않는 접근입니다."),

    /* parameter */
    MISSING_PARAMETER(3001, "필수 파라미터가 누락 되었습니다."),
    UNVALID_PARAMETER(3002, "유효하지 않은 파라미터 정보입니다."),

    /* search and result */
    NO_DATA_FOUND(4001, "검색결과가 없습니다.");

    private static final Map<Integer, HyError> infos = Collections.unmodifiableMap(Stream.of(values()).collect(
            Collectors.toMap(HyError::getValue, Function.identity())
    ));

    private final int value;
    private final String reasonPhrase;

    public static HyError valueOf(int errorCode) {
        return Optional
                .ofNullable(infos.get(errorCode))
                .orElse(HyError.INTERNAL_SERVER_ERROR);
    }
}
