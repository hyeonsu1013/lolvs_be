package com.housney.lolvs.common.utils;

/**
 * Mapper 내에서 사용할 함수 모음집
 */
public class MapperUtils {

    public static boolean isEmpty(Object obj) {
        return HyObjectUtils.isBlank(obj);
    }
    public static boolean isNotEmpty(Object obj) {
        return !isEmpty(obj);
    }
}
