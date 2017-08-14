package config;

import config.deps.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

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
        return   subjectWord.getWord() + " " +  verbWord.getWord()+ " " +  articleWord.getWord() +" " +
                adjectiveWord.getWord() + " " +  nounWord.getWord() +".";
    }
}
