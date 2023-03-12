package com.harry.myspaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@RestController
public class MyspacesApplication {
    final static Logger logger = LoggerFactory.getLogger(MyspacesApplication.class);

    public static void main(String[] args) {
        logger.info("logback测试marin");
        logger.error("logback测试marin");
        logger.warn("logback测试marin");
        logger.trace("logback测试marin");
        logger.debug("logback测试mari2n");
        SpringApplication.run(MyspacesApplication.class, args);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        logger.info("logback测试u8u2u");
        return new ResponseEntity<>("hello world", HttpStatus.OK);
    }

}
