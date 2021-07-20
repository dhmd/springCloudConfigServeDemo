package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @classname: ClientApplication
 * @description:
 * @author: dhm
 * @create: 2021/07/14 14:18
 */
@SpringBootApplication
@EnableEurekaServer
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

}
