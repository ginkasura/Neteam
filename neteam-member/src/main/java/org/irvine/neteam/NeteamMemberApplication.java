package org.irvine.neteam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author g_ban
 * @date 1/14/22
 */
@SpringBootApplication
@MapperScan("org.irvine.neteam.dao")
public class NeteamMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(NeteamMemberApplication.class, args);
    }
}
