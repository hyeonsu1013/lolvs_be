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
@ApiModel(description = "HY 챔피언첨부파일")
public class ChmpAtchEntity extends BaseVO {

    @ApiModelProperty(value = "챔피언첨부파일 SEQ")
    private long chmpAtchSeq;

    @ApiModelProperty(value = "챔피언번호")
    private long chmpNo;

    @ApiModelProperty(value = "챔피언첨부파일번호")
    private int chmpAtchNo;

    @ApiModelProperty(value = "파일타입")
    private String fileType;

    @ApiModelProperty(value = "파일경로")
    private String filePath;

    @ApiModelProperty(value = "DB상태")
    private String dbStat;

}