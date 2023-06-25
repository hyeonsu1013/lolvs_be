package com.housney.lolvs.common.vo.environment;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * datasource 환경변수 VO
 * @author housney
 */
@Data
@Component
@ConfigurationProperties("spring.datasource")
public class AppDataSourceVO {

    private String username;
    private String password;
    private String url;
    private String driver;

}
