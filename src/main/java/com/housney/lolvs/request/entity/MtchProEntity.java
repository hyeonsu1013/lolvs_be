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
@ApiModel(description = "HY 매치별 선수 정보")
public class MtchProEntity extends BaseVO {

    @ApiModelProperty(value = "매치 선수 SEQ")
    private long mtchProSeq;

    @ApiModelProperty(value = "매치번호")
    private long mtchNo;

    @ApiModelProperty(value = "매치상세번호")
    private int mtchDtalNo;

    @ApiModelProperty(value = "선수번호")
    private long proNo;

    @ApiModelProperty(value = "챔피언번호")
    private long chmpNo;

    @ApiModelProperty(value = "포지션타입")
    private String pstnType;

    @ApiModelProperty(value = "KILL POINT")
    private int killPit;

    @ApiModelProperty(value = "DEATH POINT")
    private int dethPit;

    @ApiModelProperty(value = "ASSIST POINT")
    private int asstPit;

    @ApiModelProperty(value = "DB상태")
    private String dbStat;

}