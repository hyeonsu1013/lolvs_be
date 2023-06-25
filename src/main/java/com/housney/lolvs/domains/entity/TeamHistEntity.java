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
@ApiModel(description = "HY 팀이력")
public class TeamHistEntity extends BaseVO {

    @ApiModelProperty(value = "팀이력 SEQ")
    private long teamHistSeq;

    @ApiModelProperty(value = "팀번호")
    private long teamNo;

    @ApiModelProperty(value = "팀이력번호")
    private int teamHistNo;

    @ApiModelProperty(value = "리그번호")
    private long lgueNo;

    @ApiModelProperty(value = "팀스폰서")
    private String teamSpon;

    @ApiModelProperty(value = "팀 풀네임")
    private String teamFullName;

    @ApiModelProperty(value = "DB상태")
    private String dbStat;

}