package com.housney.lolvs.request.entity;

import com.housney.lolvs.common.vo.BaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@ApiModel(description = "HY 선수이력")
public class RpoHistEntity extends BaseVO {

    @ApiModelProperty(value = "선수이력 SEQ")
    private long rpoHistSeq;

    @ApiModelProperty(value = "선수번호")
    private long proNo;

    @ApiModelProperty(value = "선수이력번호")
    private int proHistNo;

    @ApiModelProperty(value = "리그번호")
    private long lgueNo;

    @ApiModelProperty(value = "팀번호")
    private long teamNo;

    @ApiModelProperty(value = "포지션타입")
    private String pstnType;

    @ApiModelProperty(value = "DB상태")
    private String dbStat;

}