package com.housney.lolvs.common.vo.environment;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class AppCronDataVO {
    boolean use;
    String cron;
    String cronChk;
}
