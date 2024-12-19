package com.yeongjae;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Lazy
//@Scope("prototype")
@Component
public class CommonMsgService {

//    @Qualifier("emailMsgSenderImpl")
//    @Autowired
    private final CommonMsgSender sender;

//    @Qualifier("fileMsgLoggerImpl")
//    @Autowired
    private final CommonMsgLogger logger;

//    public CommonMsgService() {
//        sender = new EmailMsgSenderImpl();
//        logger = new FileMsgLoggerImpl();
//    }

    public CommonMsgService(@Qualifier("emailMsgSenderImpl") CommonMsgSender sender,
                            @Qualifier("fileMsgLoggerImpl") CommonMsgLogger logger) {
        this.sender = sender;
        this.logger = logger;
    }


    public void SendMsg(String target, String msg) {
        int res = sender.SendMsgInner(target, msg);
        if(res == 1) {
            logger.InsertLog("성공메시지");
        }else {
            logger.InsertLog("실패메시지");
        }
    }


}
