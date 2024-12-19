package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConf.class);
        CommentService commentService = context.getBean(CommentService.class);

        CommentInfo commentInfo = new CommentInfo();
        commentInfo.setAuthor("SYSTEM");
        commentInfo.setText("회원가입이 승인되었습니다.");
        String res = commentService.PrintComment(commentInfo);

        logger.info("최종 리턴값 : " + res);
    }
}