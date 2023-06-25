package com.housney.lolvs.domains.entity;

import com.housney.lolvs.common.vo.BaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@ApiModel(description = "HY 선수첨부파일")
public class RpoAtchEntity extends BaseVO {

    @ApiModelProperty(value = "선수첨부파일 SEQ")
    private long rpoAtchSeq;

    @ApiModelProperty(value = "선수번호")
    private long proNo;

    @ApiModelProperty(value = "선수첨부파일번호")
    private int proAtchNo;

    @ApiModelProperty(value = "파일타입")
    private String fileType;

    @ApiModelProperty(value = "파일경로")
    private String filePath;

    @ApiModelProperty(value = "리그번호")
    private long lgueNo;

    @ApiModelProperty(value = "DB상태")
    private String dbStat;

}