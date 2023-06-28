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
@ApiModel(description = "HY 리그 매치")
public class MtchEntity extends BaseVO {

    @ApiModelProperty(value = "매치번호")
    private long mtchNo;

    @ApiModelProperty(value = "리그번호")
    private long lgueNo;

    @ApiModelProperty(value = "매치타입")
    private String mtchType;

    @ApiModelProperty(value = "매치승리타입")
    private String mtchWinType;

    @ApiModelProperty(value = "HOME 팀번호")
    private long homeTeamNo;

    @ApiModelProperty(value = "AWAY 팀번호")
    private long awayTeamNo;

    @ApiModelProperty(value = "리그일시")
    private String lgueDate;

    @ApiModelProperty(value = "리그시각")
    private String lgueTime;

    @ApiModelProperty(value = "리그결과")
    private String lgueRslt;

    @ApiModelProperty(value = "DB상태")
    private String dbStat;

}