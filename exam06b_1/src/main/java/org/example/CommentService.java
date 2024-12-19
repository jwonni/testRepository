package org.example;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private static final Logger logger = Logger.getLogger(CommentService.class.getName());


    @ToLog
    public String PrintComment(CommentInfo info){
//        System.out.println("PRINT COMMENT > Author: "+ info.getAuthor() + ",Text:" + info.getText());
        logger.info("PRINT COMMENT > Author: "+ info.getAuthor() + ",Text:" + info.getText());

        return "SUCCESS";
    }

}
