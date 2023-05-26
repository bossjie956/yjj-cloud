package com.yjj.system;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.yjj.common.security.annotation.EnableCustomConfig;
import com.yjj.common.security.annotation.EnableRyFeignClients;
import com.yjj.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 * 
 * @author ruoyi
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class YjjSystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(YjjSystemApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "    _   _    (_)     (_)       \n" +
                "   | | | |   | |     | |   \n" +
                "   | |_| |   | |     | |  \n" +
                "   \\\\__, |   | |     | |  \n" +
                "     _/  / __/ |   __/ |   \n" +
                "    |___/ /____/  /____/"   );
    }
}
