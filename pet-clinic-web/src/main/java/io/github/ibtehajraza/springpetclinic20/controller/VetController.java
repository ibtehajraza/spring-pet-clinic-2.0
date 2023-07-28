package io.github.ibtehajraza.springpetclinic20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/list", "vets/index", "vets/index.html"})
    public String listVets() {
        return "vet/index";
    }
}
