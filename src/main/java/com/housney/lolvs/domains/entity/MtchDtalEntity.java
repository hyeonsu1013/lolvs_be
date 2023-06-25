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
@ApiModel(description = "HY 리그 매치 상세")
public class MtchDtalEntity extends BaseVO {

    @ApiModelProperty(value = "매치 SEQ")
    private long mtchDtalSeq;

    @ApiModelProperty(value = "매치번호")
    private long mtchNo;

    @ApiModelProperty(value = "매치상세번호")
    private int mtchDtalNo;

    @ApiModelProperty(value = "포지션타입")
    private String pstnType;

    @ApiModelProperty(value = "선수번호")
    private long proNo;

    @ApiModelProperty(value = "DB상태")
    private String dbStat;

}