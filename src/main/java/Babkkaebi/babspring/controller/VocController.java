package Babkkaebi.babspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VocController {
    @GetMapping("voc")
    public String menu(Model model){
        model.addAttribute("data","hello spring!!");
        return "voc";
    }
}
