package fr.nubox.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(path = {"", "/", "index", "index.html"}, method = RequestMethod.GET)
    public String index() {

        return "index";
    }
}
