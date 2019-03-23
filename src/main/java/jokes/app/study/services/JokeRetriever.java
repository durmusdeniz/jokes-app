package jokes.app.study.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeRetriever {




    public String getRandomJoke(){
        return new ChuckNorrisQuotes().getRandomQuote();
    }


}
