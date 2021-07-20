package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @classname: ClientApplication
 * @description:
 * @author: dhm
 * @create: 2021/07/14 14:35
 */

@SpringBootApplication
@EnableConfigServer
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

}
