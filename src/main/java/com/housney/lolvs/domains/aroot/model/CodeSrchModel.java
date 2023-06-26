package com.housney.lolvs.domains.aroot.model;

import com.housney.lolvs.common.vo.SrchVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class CodeSrchModel extends SrchVO {

    @ApiModelProperty(value = "코드INI 목록")
    private List<String> codeIniList;

}
