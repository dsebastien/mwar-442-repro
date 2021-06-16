package com.dummy.dataextraction.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Properties;

@ComponentScan
@EnableAutoConfiguration(exclude = {MetricFilterAutoConfiguration.class, MetricRepositoryAutoConfiguration.class})
public class DummyDataExtractionsControllerApp {

    private static final Logger log = LoggerFactory.getLogger(DummyDataExtractionsControllerApp.class);

    private final Environment env;

    public DummyDataExtractionsControllerApp(Environment env) {
        this.env = env;
    }

    @PostConstruct
    public void initApplication() {
    }

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(DummyDataExtractionsControllerApp.class);
        Environment env = app.run(args).getEnvironment();
    }
}
