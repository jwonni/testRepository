package com.yeongjae;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SmsMsgSenderImpl implements CommonMsgSender{
    @Override
    public int SendMsgInner(String target, String msg) {
        System.out.println(target + "에게 SMS전송 : " + msg);
        return 1;
    }
}
