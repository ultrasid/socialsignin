package com.socialsignin;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class RunSocialSignIn {

    public static void main(String[] args) {
        SpringApplication.run(RunSocialSignIn.class, args);
    }
}
