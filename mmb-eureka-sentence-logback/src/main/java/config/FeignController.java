package config;

import config.deps.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    private static final Logger logger = LoggerFactory.getLogger(FeignController.class);


    @Autowired
    VerbWord verbWord;

    @Autowired
    SubjectWord subjectWord;

    @Autowired
    ArticleWord articleWord;

    @Autowired
    AdjectiveWord adjectiveWord;

    @Autowired
    NounWord nounWord;

    @RequestMapping("/sentence1")
    public  String getSentence() {
        logger.info("sentence1");
        return   subjectWord.getWord() + " " +  verbWord.getWord()+ " " +  articleWord.getWord() +" " +
                adjectiveWord.getWord() + " " +  nounWord.getWord() +".";
    }
}
