package com.yeongjae;

import org.springframework.stereotype.Component;

@Component
public class FileMsgLoggerImpl implements CommonMsgLogger{
    @Override
    public void InsertLog(String msg) {
        System.out.println("FILE 로깅내용 : " + msg);
    }
}
