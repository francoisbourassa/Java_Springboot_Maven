package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class DemoApplication {

    @GetMapping("/")
    public String index(Model model) {
        // Ajoutez des attributs au modèle si nécessaire. 
        // Ceux-ci seront accessibles dans la vue "index".
        model.addAttribute("message", "Bienvenue sur la page d'accueil!");

        // Cela indique à Spring Boot de retourner la vue nommée "index".
        // Assurez-vous d'avoir une vue "index" (comme un fichier "index.html" ou "index.ftl" ou autre, selon votre technologie de vue) dans le bon répertoire.
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
