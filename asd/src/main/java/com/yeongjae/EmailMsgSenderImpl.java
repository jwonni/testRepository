package com.yeongjae;

import org.springframework.stereotype.Component;

@Component
public class EmailMsgSenderImpl implements CommonMsgSender{
    @Override
    public int SendMsgInner(String target, String msg) {
        System.out.println(target + "에게 이메일전송 : " + msg);
        return 1;
    }
}
