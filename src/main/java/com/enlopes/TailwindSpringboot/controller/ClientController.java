package com.enlopes.TailwindSpringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Controller
public class ClientController {

    @GetMapping("/client/{name}")
     public String getClientName(@PathVariable("name") String name, Model model) {
        model.addAttribute("clientName", name);
        return "index"; // Nome do template Thymeleaf (clientView.html)
    }

    @GetMapping("/client")
    public String getDefaultClientName(Model model) {
        String defaultName = "Cliente";
        model.addAttribute("clientName", defaultName);
        return "index"; // Nome do template Thymeleaf (index.html)
    }
    

}
