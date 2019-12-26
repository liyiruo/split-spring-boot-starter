package com.liyiruo.springboot.configure;

import com.liyiruo.springboot.service.ISplitService;
import com.liyiruo.springboot.service.impl.SplitServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//发现value里的类时，自动配置
@ConditionalOnClass(value = {ISplitService.class,SplitServiceImpl.class})
public class SplitAutoConfigure {
    @Bean
    @ConditionalOnMissingBean
    public ISplitService starterService() {
        return new SplitServiceImpl();
    }
}
