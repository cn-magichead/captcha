package com.magichand.captcha;

import com.magichand.captcha.config.CaptchaEndpoint;
import com.magichand.captcha.config.CaptchaProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(CaptchaProperties.class)
public class CaptchaAutoConfiguration {

    @Bean
    @ConditionalOnWebApplication
    public CaptchaEndpoint captchaEndpoint(CaptchaProperties properties) {
		CaptchaEndpoint captchaEndpoint =new CaptchaEndpoint(properties);
		return captchaEndpoint;
    }

}
