package com.yeongjae;

import org.springframework.stereotype.Component;

@Component
public class TalkMsgSenderImpl implements CommonMsgSender{
    @Override
    public int SendMsgInner(String target, String msg) {
        System.out.println(target + "에게 Talk 전송 : " + msg);
        return 1;
    }
}
