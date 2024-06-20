package com.yehorychev.tests.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.Properties;

public class Config {
    private static final Logger log = LoggerFactory.getLogger(Config.class);
    private static final String DEFAULT_PROPERTIES = "config/default.properties";

    public static void initialize() {

    }

    private static Properties loadProperties() {
        Properties properties = new Properties();
        try (InputStream stream = ResourceLoader.getResource(DEFAULT_PROPERTIES)) {
            properties.load(stream);
        } catch (Exception e) {
            log.error("Unable to read the property file {}", DEFAULT_PROPERTIES, e);
        }
        return properties;
    }

}
