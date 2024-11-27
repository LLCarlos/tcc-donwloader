package com.ufrgs.tccdownloaderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ufrgs.tccdownloaderservice")
public class TccDownloaderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TccDownloaderServiceApplication.class, args);
    }


}
