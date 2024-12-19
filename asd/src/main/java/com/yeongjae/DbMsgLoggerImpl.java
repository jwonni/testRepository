package com.yeongjae;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class DbMsgLoggerImpl  implements CommonMsgLogger{
    @Override
    public void InsertLog(String msg) {
        System.out.println("DB 로깅내용 : " + msg);
    }
}

