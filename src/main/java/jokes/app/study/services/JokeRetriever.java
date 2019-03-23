package jokes.app.study.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeRetriever {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeRetriever(){
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }


    public String getRandomJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }


}
