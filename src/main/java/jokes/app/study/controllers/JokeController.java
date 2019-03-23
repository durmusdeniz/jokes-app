package jokes.app.study.controllers;

import jokes.app.study.services.JokeRetriever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class JokeController {

    @Autowired
    private JokeRetriever jokeRetriever;

    @GetMapping({"/",""})
    public String getJoke(Model model){

        model.addAttribute("joke", jokeRetriever.getRandomJoke());
        return "chucknorris";
    }





}
