package com.example.springbootconfigandsecretsmanagedbydoppler.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("app")
public class AppConfig {
    String name;
    String secret;
    String apiKey;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
    
    @Override
    public String toString() {
        return "Application Config {\n" +
                "  applicationName: '" + name + '\'' +
                ",\n  appSecret: '"+ secret + '\'' +
                ",\n  apiKey: '"+ apiKey + '\'' +
                "\n}\n";
    }
}
