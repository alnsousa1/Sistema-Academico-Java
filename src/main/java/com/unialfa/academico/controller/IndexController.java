package com.unialfa.academico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String iniciar(Model model){
        model.addAttribute("boasVindas", "Bem vindo ao Sistema Acadêmico UniALFA");
        return "index";
    }
}
