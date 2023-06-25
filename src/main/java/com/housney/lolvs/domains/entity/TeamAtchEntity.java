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
@ApiModel(description = "HY 팀첨부파일")
public class TeamAtchEntity extends BaseVO {

    @ApiModelProperty(value = "팀첨부파일 SEQ")
    private long teamAtchSeq;

    @ApiModelProperty(value = "팀번호")
    private long teamNo;

    @ApiModelProperty(value = "팀첨부파일번호")
    private int teamAtchNo;

    @ApiModelProperty(value = "파일타입")
    private String fileType;

    @ApiModelProperty(value = "파일경로")
    private String filePath;

    @ApiModelProperty(value = "리그번호")
    private long lgueNo;

    @ApiModelProperty(value = "DB상태")
    private String dbStat;

}