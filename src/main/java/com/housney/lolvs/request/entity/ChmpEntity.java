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
@ApiModel(description = "HY 챔피언")
public class ChmpEntity extends BaseVO {

    @ApiModelProperty(value = "챔피언번호")
    private long chmpNo;

    @ApiModelProperty(value = "챔피언명")
    private String chmpName;

    @ApiModelProperty(value = "챔피언명(KR)")
    private String chmpKrnm;

    @ApiModelProperty(value = "DB상태")
    private String dbStat;

}