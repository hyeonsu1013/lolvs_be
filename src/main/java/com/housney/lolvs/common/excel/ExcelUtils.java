package com.housney.lolvs.common.excel;

public class ExcelUtils {

    // workbook의 경로와 bean의 인스턴스를 전달하면 지정된 시트의 값을 eventmodel을 사용(메모리 사용량이 적음)하여 bean에 설정하고 반환합니다.
    public static <B> B sheetToBean(String workbookPath, B bean) throws Exception {
//        SheetToBeanMapper mapper = new SheetToBeanMapper(workbookPath, bean);
//        mapper.execute();
        return bean;
    }
}
