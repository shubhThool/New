package com.fnp.framework.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
    private static final Properties props = new Properties();

    static {
        String env = System.getProperty("env", "staging");  // Default environment
        try (FileInputStream input = new FileInputStream("src/test/resources/config.properties")) {
            props.load(input);
            System.out.println("Loaded config from: config.properties");
        } catch (IOException e) {
            throw new RuntimeException("Unable to load config file", e);
        }
    }

    public static String get(String key) {
        return props.getProperty(key);
    }
}
