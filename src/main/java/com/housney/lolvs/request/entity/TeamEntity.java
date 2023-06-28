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
@ApiModel(description = "HY 팀")
public class TeamEntity extends BaseVO {

    @ApiModelProperty(value = "팀번호")
    private long teamNo;

    @ApiModelProperty(value = "팀명")
    private String teamName;

    @ApiModelProperty(value = "팀별명")
    private String teamNknm;

    @ApiModelProperty(value = "팀약어")
    private String teamAbbr;

    @ApiModelProperty(value = "리그지역")
    private String lgueGrup;

    @ApiModelProperty(value = "팀 창단일")
    private String fundDate;

    @ApiModelProperty(value = "DB상태")
    private String dbStat;

}