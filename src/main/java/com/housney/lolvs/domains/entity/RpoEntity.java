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
@ApiModel(description = "HY 선수")
public class RpoEntity extends BaseVO {

    @ApiModelProperty(value = "선수번호")
    private long rpoNo;

    @ApiModelProperty(value = "선수ID")
    private String proId;

    @ApiModelProperty(value = "선수명")
    private String proName;

    @ApiModelProperty(value = "생일")
    private String brthDate;

    @ApiModelProperty(value = "DB상태")
    private String dbStat;

}