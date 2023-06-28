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
@ApiModel(description = "HY 리그")
public class LgueEntity extends BaseVO {

    @ApiModelProperty(value = "리그번호")
    private long lgueNo;

    @ApiModelProperty(value = "리그지역")
    private String lgueGrup;

    @ApiModelProperty(value = "리그명")
    private String lgueName;

    @ApiModelProperty(value = "리그별명")
    private String lgueNknm;

    @ApiModelProperty(value = "리그시작일시")
    private String lgueStDate;

    @ApiModelProperty(value = "리그종료일시")
    private String lgueEdDate;

    @ApiModelProperty(value = "DB상태")
    private String dbStat;

}