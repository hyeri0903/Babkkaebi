package Babkkaebi.babspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntroController {

    @GetMapping("intro")
    public String intro(Model model){
        model.addAttribute("data","hello spring!!");
        return "intro";
    }

    @GetMapping("intro-store")
    public String intro_store(Model model){
        model.addAttribute("data","hello spring!!");
        return "intro-store";
    }
}
