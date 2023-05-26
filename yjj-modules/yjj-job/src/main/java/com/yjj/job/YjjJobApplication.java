package com.yjj.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.yjj.common.security.annotation.EnableCustomConfig;
import com.yjj.common.security.annotation.EnableRyFeignClients;
import com.yjj.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 定时任务
 * 
 * @author ruoyi
 */
@EnableCustomConfig
@EnableCustomSwagger2   
@EnableRyFeignClients
@SpringBootApplication
public class YjjJobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(YjjJobApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  定时任务模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "    _   _    (_)     (_)       \n" +
                "   | | | |   | |     | |   \n" +
                "   | |_| |   | |     | |  \n" +
                "   \\\\__, |   | |     | |  \n" +
                "     _/  / __/ |   __/ |   \n" +
                "    |___/ /____/  /____/"   );
    }
}
