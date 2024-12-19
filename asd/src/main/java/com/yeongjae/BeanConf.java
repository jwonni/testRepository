package com.yeongjae;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.yeongjae")
@Configuration
public class BeanConf {

//    @Bean
//    public EmailMsgSenderImpl emailMsgSender() {
//        return new EmailMsgSenderImpl();
//    }
//
//    @Bean
//    public FileMsgLoggerImpl fileMsgLogger() {
//        return new FileMsgLoggerImpl();
//    }



    @Bean
    public CommonMsgService talkMsgService(@Qualifier("talkMsgSenderImpl") CommonMsgSender sender,
                                             @Qualifier("fileMsgLoggerImpl") CommonMsgLogger logger) {
        CommonMsgService msgService
                = new CommonMsgService(sender, logger);
        return msgService;
    }

    @Bean
    public CommonMsgService emailMsgService(@Qualifier("emailMsgSenderImpl") CommonMsgSender sender,
                                           @Qualifier("fileMsgLoggerImpl") CommonMsgLogger logger) {
        CommonMsgService msgService
                = new CommonMsgService(sender, logger);
        return msgService;
    }


}
