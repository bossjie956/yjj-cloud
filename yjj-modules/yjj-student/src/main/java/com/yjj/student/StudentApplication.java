package com.yjj.student;

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
public class StudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  学生管理模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "    _   _    (_)     (_)       \n" +
                "   | | | |   | |     | |   \n" +
                "   | |_| |   | |     | |  \n" +
                "   \\\\__, |   | |     | |  \n" +
                "     _/  / __/ |   __/ |   \n" +
                "    |___/ /____/  /____/"   );
    }

}
