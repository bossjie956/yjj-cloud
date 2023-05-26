package com.yjj.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.yjj.common.security.annotation.EnableRyFeignClients;

/**
 * 认证授权中心
 * 
 * @author ruoyi
 */
@EnableRyFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class YjjAuthApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(YjjAuthApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  认证授权中心启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "    _   _    (_)     (_)       \n" +
                "   | | | |   | |     | |   \n" +
                "   | |_| |   | |     | |  \n" +
                "   \\\\__, |   | |     | |  \n" +
                "     _/  / __/ |   __/ |   \n" +
                "    |___/ /____/  /____/"   );
    }
}
